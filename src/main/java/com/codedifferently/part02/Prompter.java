package com.codedifferently.part02;

import java.util.Scanner;

public class Prompter {
    private int answer;
    
    public Prompter(int answer) {
        this.answer = answer;
    }
    
    public void promptForGuess() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Guess a number between 1 and 10");
        String input = scanner.next();
        
        int guessedAnswer = normalizeInput(input);
    }
    
    private int normalizeInput(String input) {
        String number = "-1";
        for (char character : input.toCharArray()) {
            if (Character.isDigit(character) == false) {
                System.out.println("That doesn't seem to be a number.");
                return -1;
            } else {
                number += character;
            }
        }
        return Integer.parseInt(number);
    }
}

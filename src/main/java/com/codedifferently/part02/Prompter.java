package com.codedifferently.part02;

import java.util.Scanner;

public class Prompter {
    private int answer;
    
    public Prompter(int answer) {
        this.answer = answer;
    }
    
    public void promptForGuess() {
        System.out.println("Guess a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int guessedAnswer = normalizeInput(input);
        if (guessedAnswer == answer) {
            System.out.println("That's right! You guessed the correct number.");
        } else if (guessedAnswer > answer) {
            System.out.println("That's too high");
        } else if (guessedAnswer < answer) {
            System.out.println("That's too low");
        }
    }
    
    private int normalizeInput(String input) {
        String number = "";
        for (char character : input.toCharArray()) {
            if (Character.isDigit(character) == false) {
                System.out.println("That doesn't seem to be a number.");
                return -1;
            } else {
                number += character;
            }
        }
        // The above loop ensures this string will always be an int.
        return Integer.parseInt(number);
    }
}

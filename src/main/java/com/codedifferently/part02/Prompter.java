package com.codedifferently.part02;

import java.util.Scanner;

public class Prompter {
    private int correctAnswer;
    private int prevGuessedAnswer;
    
    public Prompter(int answer) {
        this.correctAnswer = answer;
    }
    
    public void promptForGuess() {
        System.out.println("Guess a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);
        
        boolean guessedCorrectAnswer = false;
        do {
            String input = scanner.next();
            int guessedAnswer = normalizeInput(input);
            if (guessedAnswer == prevGuessedAnswer) {
                System.out.println("You already made that guess on your last turn.");
            } else if (guessedAnswer < correctAnswer) {
                System.out.println("That's too low. Try again ...");
            } else if (guessedAnswer > correctAnswer) {
                System.out.println("That's too high. Try again ...");
            } else if (guessedAnswer == correctAnswer) {
                System.out.println("That's right! You guessed the correct number. Congradulations!");
                guessedCorrectAnswer = true;
            }
            prevGuessedAnswer = guessedAnswer;
        } while (guessedCorrectAnswer == false);
        
        if (scanner != null)
            scanner.close();
        
        System.out.println("Exiting program ...");
        System.exit(1);
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

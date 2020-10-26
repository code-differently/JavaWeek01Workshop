package com.codedifferently.part01;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        System.out.println("Please write your name ...");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        
        try {
            answer = normalizeString(answer);
            if ((answer.equalsIgnoreCase("Hakim")) || (answer.equalsIgnoreCase("Rasheeda"))) {
                System.out.printf("Hello, %s!%n", answer);
            }
            else {
                System.out.println("I don't know you.");
            }
        } catch(IllegalArgumentException iae) {
            System.out.println("Error: " + iae.getMessage());
        }
    }

    // Make sure the answer is valid
    private static String normalizeString(String answer) {
        answer = answer.toLowerCase();

        if (answer.length() <= 0) {
            throw new IllegalArgumentException("The string is empty.");
        }

        char[] letters = answer.toCharArray();
        for (char letter : letters) {
            if (Character.isLetter(letter) == false) {
                throw new IllegalArgumentException("One or more characters is not a letter.");            
            }
        }

        return answer;
    }
}
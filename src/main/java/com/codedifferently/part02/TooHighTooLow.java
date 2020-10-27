package com.codedifferently.part02;

import java.util.Scanner;

public class TooHighTooLow {

    public static void main(String[] args) {
        int a = 0;
        while (a < 100) {
            System.out.println(getRandomNumber(0, 10));
            a++;
        }
        int answer = getRandomNumber(0, 10);
        Prompter prompter = new Prompter(8);
        
        prompter.promptForGuess();
    }
    
    private static int getRandomNumber(int minNum, int maxNum) {
        return (int)(Math.random() * (maxNum - minNum + 1) + minNum);
    }
}

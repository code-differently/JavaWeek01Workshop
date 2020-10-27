package com.codedifferently.part02;

import java.util.Scanner;

public class TooHighTooLow {

    public static void main(String[] args) {
        System.out.println("Calculating random number between 0 and 10 ...");
        int loopCount = 0;
        while (loopCount <= 100) {
            System.out.println(getRandomNumber(0, 10));
            loopCount++;
        }
        int number = getRandomNumber(0, 10);
        System.out.println("Number chosen!");
        Prompter prompter = new Prompter(8);
        prompter.promptForGuess();
    }
    
    private static int getRandomNumber(int minNum, int maxNum) {
        return (int)(Math.random() * (maxNum - minNum + 1) + minNum);
    }
}

package com.codedifferently.part02;

public class TooHighTooLow {

    public static void main(String[] args) {
        System.out.println("Calculating random number between 0 and 10 ...");
        int loopCount = 0;
        while (loopCount <= 100) {
            System.out.println(getRandomNumber(0, 10));
            loopCount++;
        }
        int correctAnswer = getRandomNumber(0, 10);
        System.out.println("Number chosen!");
        Game game = new Game(correctAnswer);
        game.promptForGuess();
    }
    
    private static int getRandomNumber(int minNum, int maxNum) {
        return (int)(Math.random() * (maxNum - minNum + 1) + minNum);
    }
}

package com.codedifferently.part01;

// import java.io.Console;
import java.io.PrintStream;
import java.util.Scanner;

public class Greetings {
    
    public static void main(String[] args) {

        // Create Scanner object with reference name "scanner"
       Scanner scanner = new Scanner(System.in);

       // Print out the request for input
       System.out.println("Input your name ");

       // Wait for input and assign the input value to a variable named "name"
       String name = scanner.next();

       
       // Conditional block to determine what output will result from the input "name"
         // IF name is equal to hakim ignroing case OR
         // IF name is equal to rashida ignoring case
       if (name.equalsIgnoreCase("Hakim") || name.equalsIgnoreCase("Rashida")) {
           System.out.printf("Welcome %s! %n", name);

       // ELSE print "NON GREETING"
       } 
       else {
            System.out.println("I don't even know you, " + name);
        } 
    }
}

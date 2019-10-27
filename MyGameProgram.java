package com.kaa.edu;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class MyGameProgram {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int secretNumber = (int)(Math.random()*10);
            int numberOfTries = 5;
            int countOfTries = 0;
            System.out.println("Let's play 'Guess the number' game. " +
                    "I guess a number from 0 to 9 and you should guess it " +
                    "with NO MORE THAN 5 ATTEMPTS!");
            System.out.println("Try to guess the number now.");
            while (true) {
                try {
                String userInput = in.nextLine();
                System.out.println("You entered: " + userInput);
                countOfTries++;
                if (secretNumber == Integer.valueOf(userInput)) {
                    System.out.println("You win!");
                    System.out.println("It took for you "+countOfTries+" attempt(s) to guess the number.");
                    break;
                } else {
                    numberOfTries--;
                    if (numberOfTries > 0)
                    System.out.println("You didn't guessed the number. Try again! " +
                            "YOU HAVE "+numberOfTries+" ATTEMPTS LEFT.");
                    else {
                        System.out.printf("The number I guessed was: " + secretNumber);
                            break;
                    }
                }
            }
                catch(NumberFormatException e) {
                    System.out.println("Invalid number. Please try again.");
                }
        }
        }
    }
}


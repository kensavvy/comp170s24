//import java.io.FileNotFoundException;
//import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class A06 {
    public static void main(String[] args) {
        Random rand = new Random();
        // Get a random number between 0 and 99
        int randomNumber = rand.nextInt(100);
        // Connect a scanner to the keyboard
        Scanner sc = new Scanner(System.in);
        /**********************************************************************
         *                       WRITE YOUR CODE HERE                         *
         *********************************************************************/
        int guessNumber = -1;
        // initialize user guess
    
        while(guessNumber != randomNumber && guessNumber != -1) {
            System.out.println("Guess a number between 0 and 99. Enter -1 to quit: "); 
        // ask user to enter integer number or terminate program

            if(sc.hasNextInt()) {
                guessNumber = sc.nextInt();
            // read user guess

                if(guessNumber == -1) {
                    System.out.println("You have quit the game.");
                // user enters -1 to quit the game

                } else if(guessNumber < 0 || guessNumber > 99) {
                    System.out.println("You have guessed a number out of bounds. Please enter an integer from 0 to 99.");
                // user guesses a number that is not between 0 and 99

                } else if(guessNumber < randomNumber) {
                    System.out.println("You have guessed a number too small. Try again!");
                // user guesses a number that is smaller than the random number

                } else if(guessNumber > randomNumber) {
                    System.out.println("You have guessed a number too large. Try again!");
                // user guesses a number that is larger than the random number

                } else {
                    System.out.println("You have guessed the correct number! Hooray!");
                // user guesses the random number
                }

            } else {
                System.out.println("You have guessed an invalid input. Please enter an integer from 0 to 99.");
            // user guesses a non-integer input
            }
        }
        sc.close(); // Close the scanner
    } // method main
}

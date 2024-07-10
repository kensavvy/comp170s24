import java.io.FileNotFoundException;
import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class A06 {
    public static void main(String[] args) {
        Random rand = new Random();
        // connect a random number generator

        int randomNumber = rand.nextInt(100);
        // get a random number between 0 and 99

        Scanner sc = new Scanner(System.in);
        // connect a scanner to the keyboard

        int guessNumber = 0;
        // initialize user guess
    
        while(guessNumber != randomNumber && guessNumber != -1) {
            System.out.println("Guess a number between 0 and 99. Enter -1 to quit: "); 
        // ask user to enter integer number or terminate program

            if(sc.hasNextInt()) {
                guessNumber = sc.nextInt();
            // if user input is an integer, continue checking against requirements

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
                    System.out.println("You have guessed the correct number!");
                // whiler user input is an integer, if all other requirements fail, then user guesses the random number
                }
                
            } else {
                System.out.println("You have enetered an invalid input.");
                sc.nextLine();
            // if user input is not an integer, print error message, then prompt user to continue guessing (prevents infinite loop)
            }

        }

        sc.close(); // close the scanner
    }

} // method main

package GuessTheNumberGame;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfTries = 0;
        boolean hasGuessed = false;

        System.out.println("Welcome to Guess A Number Game!");
        System.out.println("Try to guess a number between " + lowerBound + " and " + upperBound);

        while (!hasGuessed) {
            int userGuess = getUserGuess(scanner);
            numberOfTries++;

            if (userGuess == targetNumber) {
                hasGuessed = true;
                System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + numberOfTries + " tries.");
            } else if (userGuess < targetNumber) {
                System.out.println("Try again. The number is greater than " + userGuess);
            } else {
                System.out.println("Try again. The number is less than " + userGuess);
            }
        }

        scanner.close();
    }

    private static int getUserGuess(Scanner scanner) {
        int userGuess = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print("Enter your guess: ");
                userGuess = Integer.parseInt(scanner.nextLine());
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return userGuess;
    }
}


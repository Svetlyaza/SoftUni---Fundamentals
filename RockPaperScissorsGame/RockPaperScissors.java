package RockPaperScissorsGame;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static int playerWins = 0;
    private static int pcWins = 0;
    private static int draws = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    clearConsole();
                    startGame(scanner);
                    break;
                case 2:
                    clearConsole();
                    displayStats();
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Exiting the game. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Rock, Paper, Scissors Game:");
        System.out.println("1. Start Game");
        System.out.println("2. Stats");
        System.out.println("3. Quit");
        System.out.print("Enter your choice: ");
    }

    private static int getUserChoice(Scanner scanner) {
        int choice = -1;

        while (choice < 1 || choice > 3) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        return choice;
    }

    private static void clearConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void startGame(Scanner scanner) {
        System.out.println("Let's play Rock, Paper, Scissors!");

        // Get player's choice
        System.out.print("Enter your choice (1: Rock, 2: Paper, 3: Scissors): ");
        int playerChoice = getUserChoice(scanner);

        // Get PC's choice
        int pcChoice = getRandomChoice();

        // Print choices
        printChoices(playerChoice, pcChoice);

        // Determine the winner and update counters
        determineWinner(playerChoice, pcChoice);
    }

    private static int getRandomChoice() {
        Random random = new Random();
        return random.nextInt(3) + 1; // 1: Rock, 2: Paper, 3: Scissors
    }

    private static void printChoices(int playerChoice, int pcChoice) {
        System.out.println("Player chose: " + getChoiceName(playerChoice));
        System.out.println("PC chose: " + getChoiceName(pcChoice));
    }

    private static String getChoiceName(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Unknown";
        }
    }

    private static void determineWinner(int playerChoice, int pcChoice) {
        if (playerChoice == pcChoice) {
            System.out.println("It's a draw!");
            draws++;
        } else if ((playerChoice == 1 && pcChoice == 3) ||
                (playerChoice == 2 && pcChoice == 1) ||
                (playerChoice == 3 && pcChoice == 2)) {
            System.out.println("You win!");
            playerWins++;
        } else {
            System.out.println("PC wins!");
            pcWins++;
        }
    }

    private static void displayStats() {
        System.out.println("Game Stats:");
        System.out.println("Player Wins: " + playerWins);
        System.out.println("PC Wins: " + pcWins);
        System.out.println("Draws: " + draws);
    }
}
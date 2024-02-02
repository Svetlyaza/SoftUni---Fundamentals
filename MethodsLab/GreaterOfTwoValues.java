package MethodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        getMaxOfType(command, sc);
    }

    private static void getMaxOfType(String command, Scanner sc) {
        switch (command) {
            case "int":
                int firstNumber = Integer.parseInt(sc.nextLine());
                int secondNumber = Integer.parseInt(sc.nextLine());
                System.out.println(getMax(firstNumber, secondNumber));
                break;
            case "char":
                char firstSymbol = sc.nextLine().charAt(0);
                char secondSymbol = sc.nextLine().charAt(0);
                System.out.println(getMax(firstSymbol, secondSymbol));
                break;
            case "string":
                String firstString = sc.nextLine();
                String secondString = sc.nextLine();
                System.out.println(getMax(firstString, secondString));
                break;
        }
    }

    public static int getMax (int firstNumber, int secondNumber) {

        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public static char getMax (char firstSymbol, char secondSymbol) {
        if (firstSymbol > secondSymbol) {
            return firstSymbol;
        } else {
            return secondSymbol;
        }
    }

    public static String getMax (String firstString, String secondString) {
        if (firstString.compareTo(secondString) >= 0) {
            return firstString;
        } else {
            return secondString;
        }
    }
}

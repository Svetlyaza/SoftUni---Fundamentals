package MethodsLab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputString = sc.nextLine();
        int counter = Integer.parseInt(sc.nextLine());

        System.out.println(buildString(inputString, counter));
    }

    private static String buildString(String inputString, int counter) {
        String newString = "";

        for (int i = 0; i < counter; i++) {
            newString += inputString;
        }
        return newString;
    }
}

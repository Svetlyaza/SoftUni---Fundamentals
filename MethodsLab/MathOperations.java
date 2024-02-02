package MethodsLab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        int b = Integer.parseInt(sc.nextLine());
        System.out.printf("%.0f",calculate(a, operator, b));

    }

    public static double calculate(int a, String operator, int b) {
        double result = 0.0;

        switch (operator) {
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }
        return result;
    }

}

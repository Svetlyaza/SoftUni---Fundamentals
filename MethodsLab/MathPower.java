package MethodsLab;

import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number = Double.parseDouble(sc.nextLine());
        int power = Integer.parseInt(sc.nextLine());

        double product = getPoweredProduct(number, power);
        System.out.printf("%.0f",product);

    }

    private static double getPoweredProduct(double number, int power) {
        return Math.pow(number, power);
    }
}

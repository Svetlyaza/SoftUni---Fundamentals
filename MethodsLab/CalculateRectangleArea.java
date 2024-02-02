package MethodsLab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double height = Double.parseDouble(sc.nextLine());
        double width = Double.parseDouble(sc.nextLine());
        double area = calculateRectangleArea(height, width);
        System.out.println(area);

    }

    public static double calculateRectangleArea (double height, double width) {
        return height * width;
    }
}

package ArraysExe;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        int rotations = Integer.parseInt(sc.nextLine());

        for (int rotation = 1; rotation <= rotations; rotation++) {
            String firstElement = array[0];
            for (int position = 0; position < array.length - 1; position++) {
                array[position] = array[position + 1];
            }
            array[array.length - 1] = firstElement;
        }
        for (String el : array) {
            System.out.print(el + " ");
        }
    }
}
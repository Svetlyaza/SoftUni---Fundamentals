package ArraysExe;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] currentRow = sc.nextLine().split(" ");
            String firstElement = currentRow[0];
            String secondElement = currentRow[1];

            if (i % 2 != 0) {
                firstArray[i-1] = firstElement;
                secondArray[i-1] = secondElement;
            } else {
                firstArray[i-1] = secondElement;
                secondArray[i-1] = firstElement;
            }
        }

        for (String el : firstArray) {
            System.out.print(el + " ");
        }
        System.out.println();
        for (String el : secondArray) {
            System.out.print(el + " ");
        }
    }
}

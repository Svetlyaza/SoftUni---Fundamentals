package ArraysExe;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] firstArray = sc.nextLine().split(" ");
        String[] secondArray = sc.nextLine().split(" ");

        for (String el2 : secondArray) {
            for (String el1 : firstArray) {
                if (el2.equals(el1)){
                    System.out.print(el2 + " ");
                }
            }
        }
    }
}

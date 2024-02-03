package MethodsMoreExe;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int n3 = Integer.parseInt(sc.nextLine());

        printSignOfProduct(n1, n2, n3);
    }

    public static void printSignOfProduct(int n1, int n2, int n3){
        int counter = 0;

        if (n1 == 0 || n2 == 0 || n3 == 0) {
            System.out.println("zero");
            return;
        }

        if (n1 < 0) counter++;
        if (n2 < 0) counter++;
        if (n3 < 0) counter++;

        if (counter % 2 != 0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }
}

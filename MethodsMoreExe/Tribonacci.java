package MethodsMoreExe;

import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= num; i++) {
            System.out.print(tribonacci(i) + " ");
        }
    }

    public static int tribonacci(int number) {
        if (number == 0) return 0;
        if (number == 1 || number == 2) return 1;

        return tribonacci(number - 1) + tribonacci(number - 2) + tribonacci(number - 3);
    }
}

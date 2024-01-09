package DTaVMoreExe;

import java.util.Arrays;
import java.util.Scanner;

public class FromLeftToRight {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linesNum = Integer.parseInt(sc.nextLine());

        for (int i =1; i <= linesNum; i++) {
            String input = sc.nextLine();
            String[] arr = input.split(" ");
            long firstNum = Long.parseLong(arr[0]);
            long secondNum = Long.parseLong(arr[1]);
            long sumOfDigits = 0;

            if (firstNum > secondNum) {
                firstNum = Math.abs(firstNum);

                while (firstNum > 0) {
                    sumOfDigits += firstNum % 10;
                    firstNum /= 10;
                }
            } else {
                secondNum = Math.abs(secondNum);

                while (secondNum > 0) {
                    sumOfDigits += secondNum % 10;
                    secondNum /= 10;
                }
            }
            System.out.println(sumOfDigits);
            Arrays.fill(arr, null);
        }
    }
}

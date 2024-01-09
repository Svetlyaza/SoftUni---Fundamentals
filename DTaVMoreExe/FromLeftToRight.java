package DTaVMoreExe;

import java.util.Arrays;
import java.util.Scanner;

public class FromLeftToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linesNum = Integer.parseInt(sc.nextLine());
        int firstNumSum = 0;
        int secondNumSum = 0;

        for (int i =1; i <= linesNum; i++) {
            String input = sc.nextLine();
            String[] arr = input.split(" ");

            for (int j = 0; j < arr[0].length(); j++) {
                char digitChar = arr[0].charAt(j);
                int digit = Character.getNumericValue(digitChar);
                firstNumSum += digit;
            }

            for (int k = 0; k < arr[1].length(); k++) {
                char digitChar = arr[1].charAt(k);
                int digit = Character.getNumericValue(digitChar);
                secondNumSum += digit;
            }

            System.out.println(Math.max(firstNumSum, secondNumSum));

            firstNumSum = 0;
            secondNumSum = 0;
            Arrays.fill(arr, null);
        }
    }
}

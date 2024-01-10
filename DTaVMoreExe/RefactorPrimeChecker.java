package DTaVMoreExe;

import java.util.Scanner;

public class RefactorPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int endRange = Integer.parseInt(scanner.nextLine());
        for (int currentNum = 2; currentNum <= endRange; currentNum++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor < currentNum; divisor++) {
                if (currentNum % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", currentNum, isPrime);
        }

    }
}

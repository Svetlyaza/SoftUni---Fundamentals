import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= number; i++) {
            int currentNumber = i;
            int sum = 0;
            while (currentNumber > 0) {
                sum += currentNumber % 10;
                currentNumber = currentNumber / 10;
            }
            boolean isSpecialNumber = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %s%n", i, (isSpecialNumber) ? "True" : "False");
        }
    }
}

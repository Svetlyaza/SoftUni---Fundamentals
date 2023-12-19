package BasicLab;

import java.util.Scanner;

public class MultiplicationTableV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int multiplication = Integer.parseInt(sc.nextLine());
        if (multiplication > 10) {
            System.out.printf("%d X %d = %d",number, multiplication, number * multiplication);
        } else {
            for (int i = multiplication; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", number, i, number * i);
            }
        }
    }
}

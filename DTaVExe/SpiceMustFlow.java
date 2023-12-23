package DTaVExe;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacity = Integer.parseInt(sc.nextLine());
        int collectedSpice = 0;
        int days = 0;
        while (capacity >= 100) {
            collectedSpice += capacity - 26;
            capacity -= 10;
            days++;
        }
        if (collectedSpice >= 26) {
            collectedSpice -= 26;
        }
        System.out.println(days);
        System.out.println(collectedSpice);
    }
}

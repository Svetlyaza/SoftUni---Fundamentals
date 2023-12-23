package DTaVExe;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        final int capacity = 255;
        int liters = 0;

        for (int i = 1; i <= n;i++) {
            int currentLiters = Integer.parseInt(sc.nextLine());
            liters += currentLiters;
            if (liters > capacity) {
                System.out.println("Insufficient capacity!");
                liters -= currentLiters;
            }
        }
        System.out.println(liters);
    }
}

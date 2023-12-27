package DTaVExe;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int highestSnow = Integer.MIN_VALUE, highestTime = Integer.MIN_VALUE, highestQuality = Integer.MIN_VALUE;
        double highestValue = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(sc.nextLine());
            int snowballTime = Integer.parseInt(sc.nextLine());
            int snowballQuality = Integer.parseInt(sc.nextLine());
            double snowballValue = Math.pow(((double)snowballSnow/snowballTime),snowballQuality);
            if (snowballValue > highestValue) {
                highestValue = snowballValue;
                highestSnow = snowballSnow;
                highestTime = snowballTime;
                highestQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",highestSnow, highestTime, highestValue, highestQuality);
    }
}

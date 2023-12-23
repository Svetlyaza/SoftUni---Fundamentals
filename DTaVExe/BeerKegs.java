package DTaVExe;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String biggerKeg = "";
        double biggestVolume = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            String model = sc.nextLine();
            double radius = Double.parseDouble(sc.nextLine());
            int height = Integer.parseInt(sc.nextLine());

            double volume = Math.PI * Math.pow (radius, 2) * height;

            if (volume > biggestVolume) {
                biggestVolume = volume;
                biggerKeg = model;
            }
        }
        System.out.println(biggerKeg);
    }
}

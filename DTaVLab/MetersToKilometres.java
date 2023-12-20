package DTaVLab;

import java.util.Scanner;

public class MetersToKilometres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double metres = Double.parseDouble(sc.nextLine());
        System.out.printf("%.2f",metres/1000);
    }
}

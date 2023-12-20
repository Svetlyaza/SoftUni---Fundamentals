package DTaVLab;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String city = sc.nextLine();
        int population = Integer.parseInt(sc.nextLine());
        int sqrMetres  = Integer.parseInt(sc.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", city, population, sqrMetres);
    }
}

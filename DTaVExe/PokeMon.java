package DTaVExe;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pokePower = Integer.parseInt(sc.nextLine());
        int distance = Integer.parseInt(sc.nextLine());
        int exhaustionFactor = Integer.parseInt(sc.nextLine());
        int counter = 0;
        int originalValue = pokePower;

        // N - poke power, M - distance, Y - exhaustionFactor
        // N - M >> N < M ,counter++
        // if N == original/2 (N/Y)
        while (pokePower >= distance) {
            if (pokePower == originalValue * 50 / 100) {
                pokePower/= exhaustionFactor;
            } else {
                pokePower -= distance;
                counter++;
            }
        }
        System.out.println(pokePower);
        System.out.println(counter);

    }
}

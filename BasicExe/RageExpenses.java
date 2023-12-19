package BasicExe;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int games = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());

        int headsetTrashed = games / 2;
        int mouseTrashed = games / 3;
        int keyboardTrashed = games / 6;
        int displayTrashed = keyboardTrashed / 2;

        double cost = headsetTrashed * headsetPrice + mouseTrashed * mousePrice + keyboardPrice * keyboardTrashed + displayTrashed *displayPrice;
        System.out.printf("Rage expenses: %.2f lv.",cost);
    }
}

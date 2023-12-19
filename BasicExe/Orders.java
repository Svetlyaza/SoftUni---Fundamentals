package BasicExe;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int orders = Integer.parseInt(sc.nextLine());
        double totalPrice = 0.0;

        for (int i = 1; i <= orders; i++) {
            double pricePerCapsule = Double.parseDouble(sc.nextLine());
            int days = Integer.parseInt(sc.nextLine());
            double capsulesCount = Double.parseDouble(sc.nextLine());

            double price = (days * capsulesCount) * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n",price);
            totalPrice += price;
        }
        System.out.printf("Total: $%.2f",totalPrice);
    }
}

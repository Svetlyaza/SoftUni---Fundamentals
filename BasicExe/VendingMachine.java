package BasicExe;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = 0.0;
        String input = sc.nextLine();

        while (!input.equals("Start")) {

            switch (input) {
                case "0.1":
                    money += 0.1;
                    break;
                case "0.2":
                    money += 0.2;
                    break;
                case "0.5":
                    money += 0.5;
                    break;
                case "1":
                    money += 1;
                    break;
                case "2":
                    money += 2;
                    break;
                default:
                    double currentCoin = Double.parseDouble(input);
                    System.out.printf("Cannot accept %.2f%n", currentCoin);
                    break;
            }

            input = sc.nextLine();

        }

        input = sc.nextLine();

        while (!input.equals("End")) {

            switch (input) {
                case "Nuts":
                    if (money >= 2.0) {
                        money -= 2.0;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (money >= 0.7) {
                        money -= 0.7;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (money >= 1.5) {
                        money -= 1.5;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (money >= 0.8) {
                        money -= 0.8;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (money >= 1.0) {
                        money -= 1.0;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            input = sc.nextLine();

        }

        System.out.printf("Change: %.2f", money);
    }
}

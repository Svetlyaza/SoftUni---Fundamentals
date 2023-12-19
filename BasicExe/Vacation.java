package BasicExe;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int groupQuantity = Integer.parseInt(sc.nextLine());
        String groupKind = sc.nextLine();
        String day = sc.nextLine();

        double pricePerPerson = 0.0;
        double totalPrice = 0.0;

     switch (groupKind) {
         case "Students":
             if (day.equals("Friday")) {
                 pricePerPerson = 8.45;
             } else if (day.equals("Saturday")) {
                 pricePerPerson = 9.80;
             } else if (day.equals("Sunday")) {
                 pricePerPerson = 10.46;
             }
             break;
         case "Business":
             if (day.equals("Friday")) {
                 pricePerPerson = 10.90;
             } else if (day.equals("Saturday")) {
                 pricePerPerson = 15.60;
             } else if (day.equals("Sunday")) {
                 pricePerPerson = 16;
             }
             break;
         case "Regular":
             if (day.equals("Friday")) {
                 pricePerPerson = 15;
             } else if (day.equals("Saturday")) {
                 pricePerPerson = 20;
             } else if (day.equals("Sunday")) {
                 pricePerPerson = 22.50;
             }
             break;
     }

        switch (groupKind) {
            case "Students":
                totalPrice = groupQuantity * pricePerPerson;
                if (groupQuantity >= 30) {
                    totalPrice -= totalPrice * 0.15;
                }
                break;
            case "Business":
                if (groupQuantity >= 100) {
                    groupQuantity -= 10;
                }
                totalPrice = groupQuantity * pricePerPerson;
                break;
            case "Regular":
                totalPrice = groupQuantity * pricePerPerson;
                if (groupQuantity >= 10 && groupQuantity <= 20) {
                    totalPrice -= totalPrice * 0.05;
                }
        }

        System.out.printf("Total price: %.2f",totalPrice);
    }
}

package BasicExe;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int studentsCount = Integer.parseInt(sc.nextLine());
        double pricePerLS = Double.parseDouble(sc.nextLine());
        double pricePerRobe = Double.parseDouble(sc.nextLine());
        double pricePerBelt = Double.parseDouble(sc.nextLine());
        int freeBelts = 0;
        int counter = 0;

        for (int i = 1; i <= studentsCount; i++) {
            counter++;
            if (counter == 6) {
                freeBelts++;
                counter = 0;
            }
        }

        double cost = pricePerLS * Math.ceil(studentsCount + (studentsCount* 0.10)) + pricePerRobe * studentsCount + pricePerBelt * (studentsCount - freeBelts);

        if (cost <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", cost);
        } else {
            System.out.printf("George Lucas will need %.2flv more.",cost - budget);
        }
    }
}

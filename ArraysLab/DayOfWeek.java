package ArraysLab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] week = {"Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int day = Integer.parseInt(sc.nextLine()) - 1;

        if (day >= 0 && day <= 6) {
            System.out.printf("%s",week[day]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
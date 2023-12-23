package DTaVExe;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int persons = Integer.parseInt(sc.nextLine());
        int capacity = Integer.parseInt(sc.nextLine());

        int courses = (int) Math.ceil((double)persons / capacity);
        System.out.println(courses);
    }
}

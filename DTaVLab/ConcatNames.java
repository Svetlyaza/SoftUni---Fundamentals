package DTaVLab;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String one = sc.nextLine();
        String two = sc.nextLine();
        String three = sc.nextLine();

        System.out.println(one + three + two);
    }
}

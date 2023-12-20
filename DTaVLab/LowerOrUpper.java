package DTaVLab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.nextLine().charAt(0);

        if (Character.isUpperCase(c)) {
            System.out.println("upper-case");
        } else if (Character.isLowerCase(c)) {
            System.out.println("lower-case");
        }
    }
}

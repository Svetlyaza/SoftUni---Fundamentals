package DTaVLab;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char one = sc.nextLine().charAt(0);
        char two = sc.nextLine().charAt(0);
        char three = sc.nextLine().charAt(0);
        String result = String.valueOf(one) + String.valueOf(two) + String.valueOf(three);

        System.out.println(result);
    }
}

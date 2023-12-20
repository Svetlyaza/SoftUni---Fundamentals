package DTaVLab;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char char1 = sc.nextLine().charAt(0);
        char char2 = sc.nextLine().charAt(0);
        char char3 = sc.nextLine().charAt(0);

        System.out.println(String.valueOf(char3) + " " + String.valueOf(char2) + " " + String.valueOf(char1));
    }
}

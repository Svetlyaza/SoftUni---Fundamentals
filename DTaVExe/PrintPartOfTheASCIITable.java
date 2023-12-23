package DTaVExe;

import java.util.Scanner;

public class PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());

        for (int i = start; i <= end; i++) {
            char currentChar = (char) i;
            System.out.print(currentChar + " ");
        }
    }
}

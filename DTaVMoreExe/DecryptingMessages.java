package DTaVMoreExe;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int key = sc.nextInt();
        int numOfLines = sc.nextInt();
        String word = "";

        for (int i = 0; i < numOfLines; i++) {
            char letter = sc.next().charAt(0);
            if (!Character.isAlphabetic(letter)) {
                continue;
            }
            letter += key;
            word += letter;

        }
        System.out.println(word);
    }
}
package BasicExe;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(password).reverse();
        String reversedPass = stringBuilder.toString();
        String input = "";
        boolean isCorrect = true;
        int counter = 0;

        while (true) {
            input = sc.nextLine();

            if (input.equals(reversedPass)) {
                break;
            } else {
                counter++;

            }

            if (counter == 4){
                isCorrect = false;
                System.out.printf("User %s blocked!",password);
                break;
            }
            System.out.println("Incorrect password. Try again.");

        }
        if (isCorrect) {
            System.out.printf("User %s logged in.",password);
        }
    }
}

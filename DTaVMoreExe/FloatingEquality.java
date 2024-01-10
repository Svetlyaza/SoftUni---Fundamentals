package DTaVMoreExe;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double firstNumber = Double.parseDouble(sc.nextLine());
        double secondNumber = Double.parseDouble(sc.nextLine());
        double eps = 0.000001;

        System.out.printf("%s",(Math.abs(firstNumber - secondNumber) < eps) ? "True" : "False");
    }
}

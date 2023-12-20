package DTaVLab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        BigDecimal sum = BigDecimal.ZERO;

        for (int i = 1; i <= n; i++) {
            BigDecimal currentNum = sc.nextBigDecimal();
            sum = sum.add(currentNum);
        }
        System.out.println(sum);
    }
}

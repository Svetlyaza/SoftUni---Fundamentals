package ArraysExe;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print(sum);
    }
}

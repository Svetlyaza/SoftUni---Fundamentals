package BasicLab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        minutes = minutes + 30;
        if (minutes >= 60){
            minutes -= 60;
            hours++;
        }
        if (hours >= 24) {
            hours -= 24;
        }
        System.out.printf("%d:%02d",hours,minutes);
    }
}

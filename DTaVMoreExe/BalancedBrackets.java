package DTaVMoreExe;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of lines
        int n = Integer.parseInt(scanner.nextLine());

        Stack<Character> stack = new Stack<>();

        // Process each line
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            if (!processLine(line, stack)) {
                System.out.println("UNBALANCED");
                return;
            }
        }

        // Check if there are any remaining opening brackets
        if (stack.isEmpty()) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }

    private static boolean processLine(String line, Stack<Character> stack) {
        for (char ch : line.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false; // Unbalanced
                }
            }
        }
        return true; // Balanced so far
    }
}

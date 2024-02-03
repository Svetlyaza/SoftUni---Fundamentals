package MethodsMoreExe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial array
        int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Process commands until "end" is received
        while (true) {
            String[] command = scanner.nextLine().split("\\s+");

            switch (command[0]) {
                case "exchange":
                    int index = Integer.parseInt(command[1]);
                    array = exchange(array, index);
                    break;
                case "max":
                    System.out.println(findMaxIndex(array, command[1]));
                    break;
                case "min":
                    System.out.println(findMinIndex(array, command[1]));
                    break;
                case "first":
                case "last":
                    int count = Integer.parseInt(command[1]);
                    String type = command[2];
                    printFirstOrLast(array, count, type);
                    break;
                case "end":
                    printArray(array);
                    return;
            }
        }
    }

    private static int[] exchange(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index");
            return array;
        }

        List<Integer> firstSubarray = new ArrayList<>();
        List<Integer> secondSubarray = new ArrayList<>();

        for (int i = 0; i <= index; i++) {
            secondSubarray.add(array[i]);
        }

        for (int i = index + 1; i < array.length; i++) {
            firstSubarray.add(array[i]);
        }

        firstSubarray.addAll(secondSubarray);

        return firstSubarray.stream().mapToInt(Integer::intValue).toArray();
    }

    private static String findMaxIndex(int[] array, String type) {
        int maxIndex = -1;
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            if ((type.equals("even") && currentElement % 2 == 0) ||
                    (type.equals("odd") && currentElement % 2 != 0)) {
                if (currentElement >= maxElement) {
                    maxElement = currentElement;
                    maxIndex = i;
                }
            }
        }

        return maxIndex == -1 ? "No matches" : String.valueOf(maxIndex);
    }

    private static String findMinIndex(int[] array, String type) {
        int minIndex = -1;
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            if ((type.equals("even") && currentElement % 2 == 0) ||
                    (type.equals("odd") && currentElement % 2 != 0)) {
                if (currentElement <= minElement) {
                    minElement = currentElement;
                    minIndex = i;
                }
            }
        }

        return minIndex == -1 ? "No matches" : String.valueOf(minIndex);
    }

    private static void printFirstOrLast(int[] array, int count, String type) {
        if (count < 0 || count > array.length) {
            System.out.println("Invalid count");
            return;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if ((type.equals("even") && array[i] % 2 == 0) ||
                    (type.equals("odd") && array[i] % 2 != 0)) {
                result.add(array[i]);

                if (result.size() == count) {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(result.toArray()));
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}

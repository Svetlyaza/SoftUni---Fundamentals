import java.util.*;

public class Beta {
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
                    printFirstOrLastEvenOrOdd(array, count, type, command[0]);
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
        
        // Once you understand the power of Lists, life becomes easier
        
        List<Integer> firstSubArray = new ArrayList<>();
        List<Integer> secondSubArray = new ArrayList<>();
        
        // You just put the data in two lists and then combine them...
        // If you want to use arrays it takes like 2 more loops I think
        for (int i = 0; i <= index; i++) {
            secondSubArray.add(array[i]);
        }

        for (int i = index + 1; i < array.length; i++) {
            firstSubArray.add(array[i]);
        }

        firstSubArray.addAll(secondSubArray);

        return firstSubArray.stream().mapToInt(Integer::intValue).toArray();
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
        
        // I made the method String type so I could use ternary operator more freely 
        // and needless to say you need to have your maxIndex starting with -1 for obvious reasons
        // Familiar logic is used in the findMinIndex Method
        
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

    private static void printFirstOrLastEvenOrOdd(int[] array, int count, String type, String command) {
        // A necessary check that shuts the method
        if (count < 0 || count > array.length) {
            System.out.println("Invalid count");
            return;
        }

        // I used List since it's easier to put it in array. I like to avoid arrays when possible
        List<Integer> result = new ArrayList<>();
        if (command.equals("first")) { // Loop for first evens or odds
            for (int element : array) {
                if ((type.equals("even") && element % 2 == 0) ||
                        (type.equals("odd") && element % 2 != 0)) {
                    result.add(element);

                    if (result.size() == count) {
                        break;
                    }
                }
            }
        } else { // That's the last loop for the last even or odd
            for (int element = array.length -1; element >= 0; element--) {
                if ((type.equals("even") && array[element] % 2 == 0) ||
                        (type.equals("odd") && array[element] % 2 != 0)) {
                    result.add(array[element]);

                    if (result.size() == count) {
                        break;
                    }
                }
            }
            
            // You gotta reverse the list again so it can print it the way judge wants... Motherf*****...
            Collections.reverse(result);
        }

        System.out.println(Arrays.toString(result.toArray()));
    }

    private static void printArray(int[] array) {
        // I noticed a lot of people don't use this... Dunno why
        System.out.println(Arrays.toString(array));
    }
}

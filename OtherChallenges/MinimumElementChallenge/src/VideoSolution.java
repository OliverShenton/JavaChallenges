import java.util.Arrays;
import java.util.Scanner;

public class VideoSolution {

    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);
    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas: ");
        String input = scanner.nextLine();

        String[] split = input.split(",");
        int[] values = new int[split.length];

        for (int i=0; i< split.length; i++) {
            values[i] = Integer.parseInt(split[i].trim());
        }

        return values;

    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }

        return min;

    }

}

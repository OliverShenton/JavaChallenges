import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);

    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numbers: ");
        String scannerInput = scanner.nextLine();
        String[] splitNumber = scannerInput.split(",");
        int[] values = new int[splitNumber.length];
        for (int i=0; i<splitNumber.length; i++) {
            values[i] = Integer.parseInt(splitNumber[i]);
        }
        return values;

    }

    private static int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

}

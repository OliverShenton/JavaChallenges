public class Main {

    public static void main(String[] args) {

        byte byteNumber = 100;
        short shortNumber = 200;
        int intNumber = 300;
        int sum = byteNumber + shortNumber + intNumber;
        long longNumber = 50000L + (10 * sum);

        System.out.println(longNumber);

    }

}

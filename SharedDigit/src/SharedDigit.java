public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }
        int firstNumberTens = 0;
        int firstNumberOnes = firstNumber % 10;
        int secondNumberTens = 0;
        int secondNumberOnes = secondNumber % 10;
        while (firstNumber != 0) {
            firstNumberTens = firstNumber % 10;
            firstNumber /= 10;
        }
        while (secondNumber != 0) {
            secondNumberTens = secondNumber % 10;
            secondNumber /= 10;
        }
        return firstNumberTens == secondNumberTens || firstNumberTens == secondNumberOnes || firstNumberOnes == secondNumberTens || firstNumberOnes == secondNumberOnes;
    }

}

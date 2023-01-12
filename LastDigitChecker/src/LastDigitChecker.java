public class LastDigitChecker {

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber < 10 || firstNumber > 1000 || secondNumber < 10 || secondNumber > 1000 || thirdNumber < 10 || thirdNumber > 1000) {
            return false;
        }
        int firstNumberLast = firstNumber % 10;
        int secondNumberLast = secondNumber % 10;
        int thirdNumberLast = thirdNumber % 10;
        return firstNumberLast == secondNumberLast || firstNumberLast == thirdNumberLast || secondNumberLast == thirdNumberLast;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

}

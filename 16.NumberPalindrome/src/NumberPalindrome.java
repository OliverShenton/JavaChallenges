public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        if (number < 0) number *= -1;
        int normalNumber = number;
        int reverseNumber = 0;
        int lastDigit;
        while (number > 0) {
            lastDigit = number % 10;
            number /= 10;
            reverseNumber *= 10;
            reverseNumber += lastDigit;
        }
        return reverseNumber == normalNumber;
    }

}

public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        int lastDigit;
        int reverseNumber = reverse(number);
        int digitCount = getDigitCount(number);
        while(digitCount > 0) {
            lastDigit = reverseNumber % 10;
            reverseNumber /= 10;
            digitCount -= 1;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }

    public static int reverse(int number) {
        int lastDigit;
        int reverseNumber = 0;
        if (number < 0) {
            number *= -1;
            while (number != 0) {
                lastDigit = number % 10;
                number /= 10;
                reverseNumber += lastDigit;
                reverseNumber *= 10;
            }
            reverseNumber /= 10;
            reverseNumber *= -1;
        } else {
            while (number != 0) {
                lastDigit = number % 10;
                number /= 10;
                reverseNumber += lastDigit;
                reverseNumber *= 10;
            }
            reverseNumber /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        int digitCount = 0;
        if (number < 0) {
            digitCount = -1;
        } else if (number == 0) {
            digitCount = 1;
        } else {
            while (number != 0) {
                digitCount += 1;
                number /= 10;
            }
        }
        return digitCount;
    }

}

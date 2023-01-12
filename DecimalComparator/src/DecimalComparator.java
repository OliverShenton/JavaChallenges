public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        double firstThousand = first * 1000;
        double secondThousand = second * 1000;
        int firstInt = (int)firstThousand;
        int secondInt = (int)secondThousand;
        return firstInt == secondInt;
    }

}

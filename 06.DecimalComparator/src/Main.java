public class Main {

    public static void main(String[] args) {

        DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);

    }

}

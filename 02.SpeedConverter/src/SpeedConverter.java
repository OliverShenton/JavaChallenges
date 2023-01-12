import static java.lang.Math.round;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometresPerHour) {
        if (kilometresPerHour < 0) {
            return -1;
        } else {
            double mph = kilometresPerHour / 1.609;
            return round(mph);
        }
    }

    public static void printConversion(double kilometresPerHour) {
        if (kilometresPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            double mph = kilometresPerHour / 1.609;
            System.out.println(kilometresPerHour + " km/h = " + round(mph) + " mi/h");
        }
    }

}

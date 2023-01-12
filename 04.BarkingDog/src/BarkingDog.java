public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay > 23 || hourOfDay < 0) {
            return false;
        } else return barking && hourOfDay < 8 || barking && hourOfDay > 22;
    }

}

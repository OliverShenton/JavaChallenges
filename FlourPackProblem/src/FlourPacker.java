public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigCountTotal = bigCount * 5;
        int totalWeight = bigCountTotal + smallCount;
        if (bigCount < 0 || smallCount < 0 || goal < 0 || bigCountTotal + smallCount < goal) {
            return false;
        }
        if (totalWeight > goal && smallCount >= goal % 5) {
            return true;
        } else if (bigCount == 0 && smallCount >= goal) {
            return true;
        } else return totalWeight == goal;
    }

}

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else
            return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int getDaysInMonth(int month, int year) {
        int jan = 31; int feb = 28; int mar = 31; int apr = 30; int may = 31; int jun = 30; int jul = 31; int aug = 31; int sep = 30; int oct = 31; int nov = 30; int dec = 31;
        if (month > 12 || month < 1 || year > 9999 || year < 1) {
            return -1;
        } else if (isLeapYear(year)) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    return 29;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
            }
        }
        return 28;
    }

}

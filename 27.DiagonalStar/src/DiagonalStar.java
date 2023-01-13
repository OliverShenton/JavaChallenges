public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) System.out.println("Invalid Value");
        int rowNumber;
        int columnNumber;
        int rowCurrent;
        rowNumber = columnNumber = number;
        for (int row=0; row<rowNumber; row++) {
            rowCurrent = row;
            for (int column=0; column<columnNumber; column++) {
                if (row == 0 || row == rowNumber - 1 || column == 0 || column == columnNumber - 1
                || row == column || column == rowNumber - rowCurrent - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}

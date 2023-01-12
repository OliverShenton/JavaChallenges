public class Printer {

    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel < -1 || tonerLevel > 100) tonerLevel = -1;
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount > 100 || tonerLevel + tonerAmount > 100) {
            return -1;
        } else {
            return tonerLevel += tonerAmount;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            System.out.println("Printing in duplex mode");
            pagesToPrint = (int) (pages + 1) / 2;
            pagesPrinted += pagesToPrint;
        } return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

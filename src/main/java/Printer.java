public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper() {
        return paper;
    }

    public int getToner() {
        return toner;
    }

    public void print(int pages, int copies){
        int sheets = pages * copies;
        if (sheets <= this.paper && sheets <= this.toner){
            this.paper -= sheets;
            this.toner -= sheets;
        }
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(500, 500);
    }

    @Test
    public void hasPaper(){
        assertEquals(500, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(500, printer.getToner());
    }

    @Test
    public void paperDecreases(){
        printer.print(5, 10);
        assertEquals(450, printer.getPaper());
    }

    @Test
    public void tonerDecreases(){
        printer.print(5, 10);
        assertEquals(450, printer.getToner());
    }

    @Test public void tooManyPages(){
        assertEquals("There is not enough paper or toner to print this.", printer.print(100, 10));
    }
}

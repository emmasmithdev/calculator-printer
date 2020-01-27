import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(25, calculator.add(10, 15));
    }

    @Test
    public void canSubtract(){
        assertEquals(5, calculator.subtract(15, 10));
    }

    @Test
    public void canMultiply(){
        assertEquals(30, calculator.multiply(6, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(33.33, calculator.divide(100, 3), 0.01);
    }
}

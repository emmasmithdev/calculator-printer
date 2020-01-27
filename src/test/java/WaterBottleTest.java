import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle bottle;

    @Before
    public void before() {
        bottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void volumeDecreases(){
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void fillBottle(){
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }
}


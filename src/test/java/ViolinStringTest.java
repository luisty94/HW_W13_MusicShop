import music_shop.ViolinString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinStringTest {

    ViolinString violinString;

    @Before
    public void before() {
        violinString = new ViolinString("Best", 5, 10);
    }

    @Test
    public void hasTitle() {
        assertEquals("Best", violinString.getQuality());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(5, violinString.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(10, violinString.getSellPrice());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(5, violinString.calculateMarkup());
    }
}

import music_shop.InstrumentType;
import music_shop.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before() {
        violin = new Violin("Stradivarius", 4, "Dark Brown", 500, 600);
    }

    @Test
    public void hasModel() {
        assertEquals("Stradivarius", violin.getModel());
    }


    @Test
    public void hasColour() {
        assertEquals("Dark Brown", violin.getColour());

    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.STRING, violin.getType());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(4, violin.getNumberStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Cat Meowing!", violin.play());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(500, violin.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(600, violin.getSellPrice());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(100, violin.calculateMarkup());
    }
}

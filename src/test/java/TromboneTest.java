import music_shop.InstrumentType;
import music_shop.Trombone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {

    Trombone trombone;

    @Before
    public void before() {
        trombone = new Trombone("Silver", 4, "Grey", 700, 800);
    }

    @Test
    public void hasMetal() {
        assertEquals("Silver", trombone.getMetal());
    }


    @Test
    public void hasColour() {
        assertEquals("Grey", trombone.getColour());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.WIND, trombone.getType());
    }

    @Test
    public void hasNumberOfValves() {
        assertEquals(4, trombone.getNumberValves());
    }

    @Test
    public void canPlay(){
        assertEquals("Ork Call!", trombone.play());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(700, trombone.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(800, trombone.getSellPrice());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(100, trombone.calculateMarkup());
    }
}

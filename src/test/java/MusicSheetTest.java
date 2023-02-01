import music_shop.MusicSheet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicSheetTest {
    MusicSheet musicSheet;

    @Before
    public void before(){
        musicSheet = new MusicSheet("Big", 2, 5);
    }

    @Test
    public void hasType(){
        assertEquals("Big",musicSheet.getType());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(2, musicSheet.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(5, musicSheet.getSellPrice());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(3, musicSheet.calculateMarkup());
    }
}

import behaviours.ISell;
import music_shop.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShopTest {

        Shop shop;
        ISell violin;
        ISell trombone;
        ISell musicSheet;
        ISell violinString;
        

        @Before
        public void before() {
                shop = new Shop("Moss Melody");
                trombone = new Trombone("Silver", 4, "Grey", 700, 800);
                violin = new Violin("Stradivarius", 4, "Dark Brown", 500, 600);
                musicSheet = new MusicSheet("Big", 2, 5);
                violinString = new ViolinString("Best", 5, 10);
        }

        @Test
        public void hasName() {
                assertEquals("Moss Melody", shop.getName());
                }

        @Test
        public void stockStartsEmpty() {
                assertEquals(0, shop.stockCount());
                }

        @Test
        public void canAddMusicSheetToStock() {
                shop.addToStock(musicSheet);
                assertEquals(1, shop.stockCount());
                }

        @Test
        public void canAddViolinStringToStock() {
                shop.addToStock(violinString);
                assertEquals(1, shop.stockCount());
                }

        @Test
        public void canAddTromboneToStock(){
                shop.addToStock(trombone);
                assertEquals(1, shop.stockCount());
        }

        @Test
        public void canRemoveItemFromStock() {
                shop.addToStock(musicSheet);
                shop.removeFromStock(musicSheet);
                assertEquals(0, shop.stockCount());
                }

        @Test
        public void canGetTotalPotentialProfit() {
                shop.addToStock(musicSheet);
                shop.addToStock(violinString);
                shop.addToStock(violin);
                shop.addToStock(trombone);
                assertEquals(208, shop.totalPotentialProfit());
                }

        @Test
        public void hasItemInShop() {
                shop.addToStock(trombone);
                shop.addToStock(musicSheet);
                boolean result = shop.itemInShop(new ArrayList<ISell>(shop.stock),trombone);
                assertTrue(result);
        }
}

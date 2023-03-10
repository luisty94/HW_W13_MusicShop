package music_shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    public ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return this.name;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeFromStock(ISell item) {
        this.stock.remove(item);
    }

    public int totalPotentialProfit() {
        int total = 0;
        for (ISell item : stock) {
            total += item.calculateMarkup();
        }
        return total;
    }

    public Boolean itemInShop(ArrayList<ISell> stock, ISell search_item) {
        for (ISell iSell : stock)
            if (iSell == search_item){
                return true;
            }
            return false;
    }
}

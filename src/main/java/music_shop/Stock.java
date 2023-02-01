package music_shop;

import behaviours.ISell;

public abstract class Stock implements ISell {
    protected int buyPrice;
    protected int sellPrice;

    public Stock(int buyPrice, int sellPrice){
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int getBuyPrice() {
        return this.buyPrice;
    }

    public int getSellPrice(){
        return this.sellPrice;
    }
}

package music_shop;

public class ViolinString extends Stock {
    String quality;

    public ViolinString(String quality, int buyPrice, int sellPrice){
        super(buyPrice, sellPrice);
        this.quality = quality;
    }

    public String getQuality(){
        return this.quality;
    }

    public int calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}

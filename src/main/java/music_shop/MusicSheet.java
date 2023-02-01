package music_shop;

public class MusicSheet extends Stock {
    String type;

    public MusicSheet(String type, int buyPrice, int sellPrice){
        super(buyPrice, sellPrice);
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public int calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}

package music_shop;

public class Trombone extends Instrument {
    private String metal;
    private int numberValves;

    public Trombone(String metal, int numberValves, String colour, int buyPrice, int sellPrice){
        super(colour, InstrumentType.WIND,buyPrice, sellPrice);
        this.metal = metal;
        this.numberValves = numberValves;
    }

    public String getMetal(){
        return this.metal;
    }

    public int getNumberValves(){
        return this.numberValves;
    }

    public String play() {
        return "Ork Call!";
    }

    @Override
    public int calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}

package music_shop;

public class Violin extends Instrument {
    private String model;
    private int numberStrings;

    public Violin (String model, int numberStrings, String colour, int buyPrice, int sellPrice){
        super(colour, InstrumentType.STRING, buyPrice, sellPrice);
        this.model=model;
        this.numberStrings=numberStrings;
    }

    public String getModel() {
        return this.model;
    }

    public int getNumberStrings(){
        return this.numberStrings;
    }

    public String play() {
        return "Cat Meowing!";
    }

    public int calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}

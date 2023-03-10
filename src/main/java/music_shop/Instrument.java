package music_shop;

import behaviours.IPlay;

public abstract class Instrument extends Stock implements IPlay {
    private String colour;
    private InstrumentType type;

    public Instrument (String colour, InstrumentType type, int buyPrice, int sellPrice){
        super(buyPrice, sellPrice);
        this.colour=colour;
        this.type=type;
    }

    public String getColour() {
        return this.colour;
    }

    public InstrumentType getType() {
        return this.type;
    }
}

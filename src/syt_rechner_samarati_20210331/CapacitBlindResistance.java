package syt_rechner_samarati_20210331;

public class CapacitBlindResistance extends Value{
    
    static final String NAME = "Kapazitiver Blindwiderstand XC";
    static final String[] UNIT = BlindResistance.UNIT;
    static final int DEFAULTINDEX = BlindResistance.DEFAULTINDEX;
    
    CapacitBlindResistance(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
    
}

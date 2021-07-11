package syt_rechner_samarati_20210331;

public class InductiveBlindResistance extends Value{
    
    static final String NAME = "Induktiver Blindwiderstand XL";
    static final String[] UNIT = BlindResistance.UNIT;
    static final int DEFAULTINDEX = BlindResistance.DEFAULTINDEX;
    
    InductiveBlindResistance(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
    
}

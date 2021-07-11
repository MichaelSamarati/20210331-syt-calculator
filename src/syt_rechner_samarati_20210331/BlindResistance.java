package syt_rechner_samarati_20210331;

public class BlindResistance extends Value{
    
    static final String NAME = "Blindwiderstand X";
    static final String[] UNIT = Resistance.UNIT;
    static final int DEFAULTINDEX = Resistance.DEFAULTINDEX;
    
    BlindResistance(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
}

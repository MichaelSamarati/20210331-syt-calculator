package syt_rechner_samarati_20210331;

public class InductiveBlindConductance extends Value{
    
    static final String NAME = "Induktiver Blindleitwert BL";
    static final String[] UNIT = BlindConductance.UNIT;
    static final int DEFAULTINDEX = BlindConductance.DEFAULTINDEX;
    
    InductiveBlindConductance(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
    
}

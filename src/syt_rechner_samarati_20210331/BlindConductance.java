package syt_rechner_samarati_20210331;

public class BlindConductance extends Value{
    
    static final String NAME = "Blindleitwert B";
    static final String[] UNIT = Conductance.UNIT;
    static final int DEFAULTINDEX = Conductance.DEFAULTINDEX;
    
    BlindConductance(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
    
}

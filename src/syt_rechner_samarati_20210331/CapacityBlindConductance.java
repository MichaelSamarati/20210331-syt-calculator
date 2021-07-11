package syt_rechner_samarati_20210331;

public class CapacityBlindConductance extends Value{
    
    static final String NAME = "Kapazitiver Blindleitwert BC";
    static final String[] UNIT = BlindConductance.UNIT;
    static final int DEFAULTINDEX = BlindConductance.DEFAULTINDEX;
    
    CapacityBlindConductance(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
    
}

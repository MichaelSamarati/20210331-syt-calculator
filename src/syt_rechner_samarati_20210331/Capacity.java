package syt_rechner_samarati_20210331;

public class Capacity extends Value{
    
    static final String NAME = "Kapazität C";
    static final String[] UNIT = new String[]{"C", "mC", "uC", "nC"};
    static final int DEFAULTINDEX = 2;
    
    Capacity(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
    
}

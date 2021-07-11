package syt_rechner_samarati_20210331;

public class Impedanz extends Value {
    
    static final String NAME = "Impedanz Z";
    static final String[] UNIT = Resistance.UNIT;
    static final int DEFAULTINDEX = Resistance.DEFAULTINDEX;
    
    Impedanz(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
    
    Impedanz(String s){
        super(s, UNIT, DEFAULTINDEX);
    }
    
}

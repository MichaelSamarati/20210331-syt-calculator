package syt_rechner_samarati_20210331;

public class Admittanz extends Value{
    
    static final String NAME = "Admittanz Y";
    static final String[] UNIT = Conductance.UNIT;
    static final int DEFAULTINDEX = Conductance.DEFAULTINDEX;
    
    Admittanz(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
    
    Admittanz(String s){
        super(s, UNIT, DEFAULTINDEX);
    }
    
}

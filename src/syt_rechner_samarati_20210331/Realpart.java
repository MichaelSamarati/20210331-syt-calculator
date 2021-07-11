package syt_rechner_samarati_20210331;

public class Realpart extends Value{
    
    static final String NAME = "Realteil";
    static final String[] UNIT = Value.DEFAULTUNIT;
    static final int DEFAULTINDEX = Value.DEFAULTINDEX;
    
    Realpart(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
    
    Realpart(String s){
        super(s, UNIT, DEFAULTINDEX);
    }
    
}
package syt_rechner_samarati_20210331;

public class Pointerlength extends Value{
    
    static final String NAME = "Betrag Z";
    static final String[] UNIT = Value.DEFAULTUNIT;
    static final int DEFAULTINDEX = Value.DEFAULTINDEX;

    Pointerlength(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
    
    Pointerlength(String s){
        super(s, UNIT, DEFAULTINDEX);
    }
}

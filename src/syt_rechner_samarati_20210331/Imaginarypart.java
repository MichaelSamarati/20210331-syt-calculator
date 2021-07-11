package syt_rechner_samarati_20210331;

public class Imaginarypart extends Value{
    
    static final String NAME = "Imaginärteil";
    static final String[] UNIT = Value.DEFAULTUNIT;
    static final int DEFAULTINDEX = Value.DEFAULTINDEX;
    
    Imaginarypart(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
    
    Imaginarypart(String s){
        super(s, UNIT, DEFAULTINDEX);
    }
}
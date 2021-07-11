package syt_rechner_samarati_20210331;

public class Frequency extends Value{
    
    static final String NAME = "Frequenz f";
    static final String[] UNIT = new String[]{"MHz", "kHz", "Hz", "mHz"};
    static final int DEFAULTINDEX = 2;
    
    Frequency(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
    
    
}

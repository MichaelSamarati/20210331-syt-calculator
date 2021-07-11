package syt_rechner_samarati_20210331;

public class Voltage extends Value{
    
    static final String NAME = "Spannung U";
    static final String[] UNIT = new String[]{"MV", "kV", "V", "mV", "uV"};
    static final int DEFAULTINDEX = 2;
    
    Voltage(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
    
    Voltage(String s){
        super(s, UNIT, DEFAULTINDEX);
    }
    
}
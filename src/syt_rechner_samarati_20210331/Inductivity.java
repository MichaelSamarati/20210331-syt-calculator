package syt_rechner_samarati_20210331;

public class Inductivity extends Value{
    
    static final String NAME = "Induktivität L";
    static final String[] UNIT = new String[]{"MH", "H", "mH", "uH"};
    static final int DEFAULTINDEX = 2;
    
    Inductivity(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
    
}

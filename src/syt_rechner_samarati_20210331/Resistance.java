package syt_rechner_samarati_20210331;

public class Resistance extends Value{
    
    static final String NAME = "Widerstand R";
    static final String[] UNIT = new String[]{"MOhm", "kOhm", "Ohm", "mOhm", "uOhm"};
    static final int DEFAULTINDEX = 2;
    
    Resistance(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
}

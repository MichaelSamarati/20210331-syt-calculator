package syt_rechner_samarati_20210331;

public class Angle extends Value{
    
    static final String NAME = "Winkel phi";
    static final String[] UNIT = new String[]{"GRAD", "RAD"};
    static final int DEFAULTINDEX = 0;
    
    Angle(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
    
    Angle(String s){
        super(s, UNIT, DEFAULTINDEX);
    }
    
}

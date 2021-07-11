package syt_rechner_samarati_20210331;

public class Conductance extends Value{
    
    static final String NAME = "Leitwert G";
    static final String[] UNIT = new String[]{"kS", "S", "mS", "uS"};
    static final int DEFAULTINDEX = 2;
    
    Conductance(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
    
}

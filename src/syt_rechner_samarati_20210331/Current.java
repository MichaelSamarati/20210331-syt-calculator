package syt_rechner_samarati_20210331;

public class Current extends Value{
    
    static final String NAME = "Strom I";
    static final String[] UNIT = new String[]{"MA", "kA", "A", "mA", "uA"};
    static final int DEFAULTINDEX = 3;
    
    Current(){
        super(NAME, UNIT, DEFAULTINDEX);
    }
    
    Current(String s){
        super(s, UNIT, DEFAULTINDEX);
    }
    
}

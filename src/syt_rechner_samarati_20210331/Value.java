package syt_rechner_samarati_20210331;

public class Value {
    
    String name;
    String[] unit;
    int unitindex;
    static final String[] DEFAULTUNIT = new String[]{"M", "k", " ", "m", "u"};
    static final int DEFAULTINDEX = 2;
    
    Value(String name, String[] unit, int unitindex){
        this.name = name;
        this.unit = unit;
        this.unitindex = unitindex;
    }  
}

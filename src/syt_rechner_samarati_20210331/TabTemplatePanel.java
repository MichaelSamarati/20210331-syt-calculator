package syt_rechner_samarati_20210331;

import java.awt.Color;
import javax.swing.JPanel;

public class TabTemplatePanel extends JPanel{
    
    String name;
    ValueTemplatePanel[] valuePanel;
    int default_selected_TextField;
    static int selected_TextField;
    CalculatorHandler calculatorHandler;

    TabTemplatePanel(String name, Color bg, int x, int y, CalculatorHandler calculatorHandler, Value v0, Value v1){
        initilze(name, bg, x, y, calculatorHandler, 2);
        
        valuePanel[0] = new ValueTemplatePanel(bg, x, v0, 0, this);
        valuePanel[0].setLocation(0, 0);
        this.add(valuePanel[0]);
        
        valuePanel[1] = new ValueTemplatePanel(bg, x, v1, 1, this);
        valuePanel[1].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[0]));
        this.add(valuePanel[1]); 
    }
   
    TabTemplatePanel(String name, Color bg, int x, int y, CalculatorHandler calculatorHandler, Value v0, Value v1, Value v2){
        initilze(name, bg, x, y, calculatorHandler, 3);
        
        valuePanel[0] = new ValueTemplatePanel(bg, x, v0, 0, this);
        valuePanel[0].setLocation(0, 0);
        this.add(valuePanel[0]);
        
        valuePanel[1] = new ValueTemplatePanel(bg, x, v1, 1, this);
        valuePanel[1].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[0]));
        this.add(valuePanel[1]); 
        
        valuePanel[2] = new ValueTemplatePanel(bg, x, v2, 2, this);
        valuePanel[2].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[1]));
        this.add(valuePanel[2]); 
    }
    
    TabTemplatePanel(String name, Color bg, int x, int y, CalculatorHandler calculatorHandler, Value v0, Value v1, Value v2, Value v3){
        initilze(name, bg, x, y, calculatorHandler, 4);
        
        valuePanel[0] = new ValueTemplatePanel(bg, x, v0, 0, this);
        valuePanel[0].setLocation(0, 0);
        this.add(valuePanel[0]);
        
        valuePanel[1] = new ValueTemplatePanel(bg, x, v1, 1, this);
        valuePanel[1].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[0]));
        this.add(valuePanel[1]); 
        
        valuePanel[2] = new ValueTemplatePanel(bg, x, v2, 2, this);
        valuePanel[2].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[1]));
        this.add(valuePanel[2]); 
        
        valuePanel[3] = new ValueTemplatePanel(bg, x, v3, 3, this);
        valuePanel[3].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[2]));
        this.add(valuePanel[3]); 
    }
    
    TabTemplatePanel(String name, Color bg, int x, int y, CalculatorHandler calculatorHandler, Value v0, Value v1, Value v2, Value v3, Value v4){
        initilze(name, bg, x, y, calculatorHandler, 5);
        
        valuePanel[0] = new ValueTemplatePanel(bg, x, v0, 0, this);
        valuePanel[0].setLocation(0, 0);
        this.add(valuePanel[0]);
        
        valuePanel[1] = new ValueTemplatePanel(bg, x, v1, 1, this);
        valuePanel[1].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[0]));
        this.add(valuePanel[1]); 
        
        valuePanel[2] = new ValueTemplatePanel(bg, x, v2, 2, this);
        valuePanel[2].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[1]));
        this.add(valuePanel[2]); 
        
        valuePanel[3] = new ValueTemplatePanel(bg, x, v3, 3, this);
        valuePanel[3].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[2]));
        this.add(valuePanel[3]); 
        
        valuePanel[4] = new ValueTemplatePanel(bg, x, v4, 4, this);
        valuePanel[4].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[3]));
        this.add(valuePanel[4]); 
    }
    
    TabTemplatePanel(String name, Color bg, int x, int y, CalculatorHandler calculatorHandler, Value v0, Value v1, Value v2, Value v3, Value v4, Value v5){
        initilze(name, bg, x, y, calculatorHandler, 6);
        
        valuePanel[0] = new ValueTemplatePanel(bg, x, v0, 0, this);
        valuePanel[0].setLocation(0, 0);
        this.add(valuePanel[0]);
        
        valuePanel[1] = new ValueTemplatePanel(bg, x, v1, 1, this);
        valuePanel[1].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[0]));
        this.add(valuePanel[1]); 
        
        valuePanel[2] = new ValueTemplatePanel(bg, x, v2, 2, this);
        valuePanel[2].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[1]));
        this.add(valuePanel[2]); 
        
        valuePanel[3] = new ValueTemplatePanel(bg, x, v3, 3, this);
        valuePanel[3].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[2]));
        this.add(valuePanel[3]); 
        
        valuePanel[4] = new ValueTemplatePanel(bg, x, v4, 4, this);
        valuePanel[4].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[3]));
        this.add(valuePanel[4]); 
        
        valuePanel[5] = new ValueTemplatePanel(bg, x, v5, 5, this);
        valuePanel[5].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[4]));
        this.add(valuePanel[5]);
    }
    
    TabTemplatePanel(String name, Color bg, int x, int y, CalculatorHandler calculatorHandler, Value v0, Value v1, Value v2, Value v3, Value v4, Value v5, Value v6){
        initilze(name, bg, x, y, calculatorHandler, 7);
        
        valuePanel[0] = new ValueTemplatePanel(bg, x, v0, 0, this);
        valuePanel[0].setLocation(0, 0);
        this.add(valuePanel[0]);
        
        valuePanel[1] = new ValueTemplatePanel(bg, x, v1, 1, this);
        valuePanel[1].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[0]));
        this.add(valuePanel[1]); 
        
        valuePanel[2] = new ValueTemplatePanel(bg, x, v2, 2, this);
        valuePanel[2].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[1]));
        this.add(valuePanel[2]); 
        
        valuePanel[3] = new ValueTemplatePanel(bg, x, v3, 3, this);
        valuePanel[3].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[2]));
        this.add(valuePanel[3]); 
        
        valuePanel[4] = new ValueTemplatePanel(bg, x, v4, 4, this);
        valuePanel[4].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[3]));
        this.add(valuePanel[4]); 
        
        valuePanel[5] = new ValueTemplatePanel(bg, x, v5, 5, this);
        valuePanel[5].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[4]));
        this.add(valuePanel[5]); 
        
        valuePanel[6] = new ValueTemplatePanel(bg, x, v6, 6, this);
        valuePanel[6].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[5]));
        this.add(valuePanel[6]);
    }
    
    TabTemplatePanel(String name, Color bg, int x, int y, CalculatorHandler calculatorHandler, Value v0, Value v1, Value v2, Value v3, Value v4, Value v5, Value v6, Value v7){
        initilze(name, bg, x, y, calculatorHandler, 8);
        
        valuePanel[0] = new ValueTemplatePanel(bg, x, v0, 0, this);
        valuePanel[0].setLocation(0, 0);
        this.add(valuePanel[0]);
        
        valuePanel[1] = new ValueTemplatePanel(bg, x, v1, 1, this);
        valuePanel[1].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[0]));
        this.add(valuePanel[1]); 
        
        valuePanel[2] = new ValueTemplatePanel(bg, x, v2, 2, this);
        valuePanel[2].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[1]));
        this.add(valuePanel[2]); 
        
        valuePanel[3] = new ValueTemplatePanel(bg, x, v3, 3, this);
        valuePanel[3].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[2]));
        this.add(valuePanel[3]); 
        
        valuePanel[4] = new ValueTemplatePanel(bg, x, v4, 4, this);
        valuePanel[4].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[3]));
        this.add(valuePanel[4]); 
        
        valuePanel[5] = new ValueTemplatePanel(bg, x, v5, 5, this);
        valuePanel[5].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[4]));
        this.add(valuePanel[5]); 
        
        valuePanel[6] = new ValueTemplatePanel(bg, x, v6, 6, this);
        valuePanel[6].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[5]));
        this.add(valuePanel[6]);
        
        valuePanel[7] = new ValueTemplatePanel(bg, x, v7, 7, this);
        valuePanel[7].setLocation(0, TabTemplatePanel.getYLocation(valuePanel[6]));
        this.add(valuePanel[7]);
    }
    
    private void initilze(String name, Color bg, int x, int y, CalculatorHandler calculatorHandler, int count){
        this.setBackground(bg);
        this.setSize(x, y);
        this.setLayout(null);
        this.name = name;
        this.calculatorHandler = calculatorHandler;
        this.default_selected_TextField = default_selected_TextField;
        this.selected_TextField = 0;
        valuePanel = new ValueTemplatePanel[count];
    }
    
    private static int getYLocation(JPanel panel){
        return (int) (panel.getLocation().getY()+panel.getHeight());
    }
    
    public ValueTemplatePanel getPanel(){
        return getPanel(selected_TextField);
    }
    
    public ValueTemplatePanel getPanel(int index){
        return valuePanel[index];
    }
   
    public void defaultSelectedTextField(){
        updateSelectedTextField(default_selected_TextField);
    }
    
    public void updateSelectedTextField(int textFieldIndex){
        selected_TextField = textFieldIndex;
        for(int i = 0; i<valuePanel.length; i++){
            getPanel(i).tf.setBackground(ValueTemplatePanel.TEXTFIELD_UNFOCUSED);         
        }
        getPanel().tf.setBackground(ValueTemplatePanel.TEXTFIELD_FOCUSED);
    }
    
}

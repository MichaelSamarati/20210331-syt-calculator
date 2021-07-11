package syt_rechner_samarati_20210331;

import java.awt.Color;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
    
    ResultPanel resultPanel;
    OptionPanel optionPanel;
    ButtonPanel buttonPanel;
    static final Color bg = new Color(0x52b6e8);
    
    MainPanel(int x, int y){
        this.setLayout(null);
        this.setSize(x, y);
        this.setBackground(bg);

        resultPanel = new ResultPanel(bg, x);
        resultPanel.setLocation(0, 0);
        
        optionPanel = new OptionPanel(bg, x);
        optionPanel.setLocation(0, resultPanel.getHeight());
        
        buttonPanel = new ButtonPanel(resultPanel, optionPanel, bg, x);
        buttonPanel.setLocation(0, resultPanel.getHeight()+optionPanel.getHeight());
        
        this.add(resultPanel);
        this.add(optionPanel);
        this.add(buttonPanel);
    }
    
}

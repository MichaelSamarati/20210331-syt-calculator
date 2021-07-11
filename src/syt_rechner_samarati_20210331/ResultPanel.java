package syt_rechner_samarati_20210331;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class ResultPanel extends JPanel{
    
    JScrollPane sp;
    JTextArea area;
    final static Font AREA_FONT = new Font("Arial", Font.PLAIN, 13);
    static final Color BORDER_COLOR = new Color(0xc925cf);
    
    ResultPanel(Color bg, int x){
        this.setBackground(bg);
        this.setSize(x,150);
        this.setLayout(null);
        
        area = new JTextArea(6,20);
        area.setLineWrap(true);
        area.setBounds(10, 10, this.getWidth()-20, this.getHeight()-20);
        area.setBorder(BorderFactory.createLineBorder(BORDER_COLOR, 5));
        area.setFont(AREA_FONT);
        sp = new JScrollPane(area, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setViewportView(area);
        sp.setBounds(10, 10, this.getWidth()-20, this.getHeight()-20);
        
        this.add(sp);
    }
   
}

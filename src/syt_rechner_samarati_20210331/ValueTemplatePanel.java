package syt_rechner_samarati_20210331;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ValueTemplatePanel extends JPanel{
    
    JLabel label;
    JTextField tf;
    JComboBox cb;
    TabTemplatePanel tp;
    final static Font LABEL_FONT = new Font("Arial", Font.BOLD, 14);
    final static Font TEXTFIELD_FONT = new Font("Arial", Font.PLAIN, 14);
    final static Font COMBOBOX_FONT = new Font("Arial", Font.PLAIN, 14);
    final static int X_MARGIN = 5;
    final static int Y_MARGIN = 5;
    final static Color TEXTFIELD_FOCUSED = Color.CYAN;
    final static Color TEXTFIELD_UNFOCUSED = Color.WHITE;
    final static Color TEXTFIELD_NOT_ENABLED = Color.BLACK;
    
    ValueTemplatePanel(Color bg, int x, Value value, int textFieldIndex, TabTemplatePanel tp){
        this.setBackground(bg);
        this.setSize(x, 55);
        this.setLayout(null);
        
        this.tp = tp;
        
        label = new JLabel();
        label.setSize(x-10, 15);
        label.setLocation(X_MARGIN, Y_MARGIN);
        label.setText(value.name);
        label.setFont(LABEL_FONT);
        this.add(label);
        
        tf = new JTextField();
        tf.setSize(180, 25);
        tf.setLocation(X_MARGIN, getYLocation(label));
        tf.setFont(TEXTFIELD_FONT);
        
        tf.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                tp.updateSelectedTextField(textFieldIndex);
                tf.setBackground(TEXTFIELD_FOCUSED);
                tp.selected_TextField = textFieldIndex;
            }
            
            @Override
            public void focusLost(FocusEvent e) {
                
            }
        });
        this.add(tf);
        
        if(value.unitindex>=0){
            cb = new JComboBox(value.unit);
            cb.setSize(100, 25);
            cb.setLocation(getXLocation(tf), getYLocation(label));
            cb.setFont(COMBOBOX_FONT);
            cb.setSelectedIndex(value.unitindex);
            this.add(cb);
        }  
    }
    
    private static int getYLocation(JComponent com){
        return (int) (com.getLocation().getY()+com.getHeight()+Y_MARGIN);
    }
    
    private static int getXLocation(JComponent com){
        return (int) (com.getLocation().getX()+com.getWidth()+X_MARGIN);
    }
   
}

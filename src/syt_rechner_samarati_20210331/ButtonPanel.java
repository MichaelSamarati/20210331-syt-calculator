package syt_rechner_samarati_20210331;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{
    
    ResultPanel rp;
    OptionPanel op;
    JButton zero;
    JButton one;
    JButton two;
    JButton three;
    JButton four;
    JButton five;
    JButton six;
    JButton seven;
    JButton eight;
    JButton nine;
    JButton minus;
    JButton point;
    JButton del;
    JButton clr;
    JButton enter;
    final int BUTTON_WITDH = 60;
    final int BUTTON_HEIGTH = 50;
    final int X_MARGIN = 8;
    final int Y_MARGIN = 8;
    static final Color BUTTON_BORDER_COLOR = ResultPanel.BORDER_COLOR;
    static final Color BUTTON_AREA_COLOR = new Color(0x36e874);

    ButtonPanel(ResultPanel rp, OptionPanel op, Color bg, int x){
        this.setBackground(bg);
        this.setLayout(null);
        this.setSize(x, Y_MARGIN*5+BUTTON_HEIGTH*5);
        
        this.rp = rp;
        this.op = op;
        
        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        minus = new JButton("-");
        point = new JButton(".");
        clr = new JButton("CLR");
        del = new JButton("DEL");
        enter = new JButton("ENTER");
 
        initilizeButton(seven, 0, 0);
        initilizeButton(eight, 0, 1);
        initilizeButton(nine, 0, 2);
        initilizeButton(four, 1, 0);
        initilizeButton(five, 1, 1);
        initilizeButton(six, 1, 2);
        initilizeButton(one, 2, 0);
        initilizeButton(two, 2, 1);
        initilizeButton(three, 2, 2);
        initilizeButton(minus, 3, 0);
        initilizeButton(zero, 3, 1);
        initilizeButton(point, 3, 2);
        
        initilizeButton(del, 1, 3);
        del.setSize(BUTTON_WITDH*2, BUTTON_HEIGTH);
        initilizeButton(clr, 2, 3);
        clr.setSize(BUTTON_WITDH*2, BUTTON_HEIGTH);
        initilizeButton(enter, 3, 3);
        enter.setSize(BUTTON_WITDH*2, BUTTON_HEIGTH);
    }
    
    private void initilizeButton(JButton button, int row, int col){
        this.add(button);
        button.setSize(BUTTON_WITDH, BUTTON_HEIGTH);
        button.setLocation(X_MARGIN*2+(X_MARGIN+BUTTON_WITDH)*col, Y_MARGIN*2+(Y_MARGIN+BUTTON_HEIGTH)*row);
        button.setBackground(BUTTON_AREA_COLOR);
        button.setBorder(BorderFactory.createLineBorder(BUTTON_BORDER_COLOR, 3));
        button.setForeground(Color.BLACK);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonActionperformed(button.getText());
            }
        });
    }
    
    private void buttonActionperformed(String s){
        if(s==enter.getText()){enter();}
        else if(s==clr.getText()){clr();}
        else if(s==del.getText()){del();}
        else{updateTextField(s);}
    }
    
    private void enter(){
        CalculatorHandler.calculation(op, rp);
    }
    
    private void clr(){
        for(int i = 0; i<op.tpane.getTabCount(); i++){
            for(int k = 0; k<op.getTabPanel(i).valuePanel.length; k++){
                op.getTabPanel(i).getPanel(k).tf.setText("");
            }
        }
    }
    
    private void del(){
        op.getTabPanel().getPanel().tf.setText("");
    }
    
    private void updateTextField(String s){
        op.getTabPanel().getPanel().tf.setText(op.getTabPanel().getPanel().tf.getText()+s);
    }
}

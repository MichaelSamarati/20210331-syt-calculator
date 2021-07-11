package syt_rechner_samarati_20210331;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class OptionPanel extends JPanel{
    
    JTabbedPane tpane;
    TabTemplatePanel uriPanel;
    TabTemplatePanel rgPanel;    
    TabTemplatePanel scheitelPanel;
    TabTemplatePanel xIPanel;
    TabTemplatePanel xCPanel;
    TabTemplatePanel bIPanel;
    TabTemplatePanel bCPanel;
    TabTemplatePanel xbPanel;
    TabTemplatePanel additionZPanel;
    TabTemplatePanel subtractionZPanel;
    TabTemplatePanel multiplicationZPanel;
    TabTemplatePanel divisionZPanel;
    TabTemplatePanel komplexNumberConverterPanel;
    TabTemplatePanel impedanzPanel;
    TabTemplatePanel admittanzPanel;
    TabTemplatePanel zyPanel;
    TabTemplatePanel apparentpowerPanel;
    TabTemplatePanel activepowerPanel;
    TabTemplatePanel blindpowerPanel;
    TabTemplatePanel powerfactorPanel;
    TabTemplatePanel[] tabpanels;
    Color[] bgpanel;
    
    OptionPanel(Color bg, int x){
        this.setBackground(bg);
        this.setSize(x, 400);
        this.setLayout(null);
        bgpanel = new Color[]{
            new Color(0xFF3333),
            new Color(0xFF7632),
            new Color(0xFFBA32),
            new Color(0xFFFE32),
            new Color(0xBBFE32),
            new Color(0x55FE32),       
            new Color(0x33FE54),  
            new Color(0x33FE98),  
            new Color(0x33FEDC),  
            new Color(0x33DEFE),  
            new Color(0x33BAFE),  
            new Color(0x3376FE),  
            new Color(0x3332FE),  
            new Color(0x7732FE),  
            new Color(0xBB32FE),  
            new Color(0xFF32FE),  
            new Color(0xFF32BA),  
            new Color(0xFF3276), 
            new Color(0xFF3232),
            new Color(0xDE3276),
            new Color(0xBA3276)
        };
        tpane = new JTabbedPane();
        tpane.setSize(this.getWidth()-20, this.getHeight()-10);
        tpane.setLocation(10, 0);
        tpane.setTabPlacement(JTabbedPane.LEFT);
        tpane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                getTabPanel().defaultSelectedTextField();
            }
        });
        tabpanels = new TabTemplatePanel[]{
            uriPanel = new TabTemplatePanel("URI", bgpanel[0], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerURI(), new Voltage(), new Current(), new Resistance()),
            rgPanel = new TabTemplatePanel("RG", bgpanel[1], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerRG(), new Resistance(), new Conductance()),
            scheitelPanel = new TabTemplatePanel("Scheitelwert", bgpanel[2], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerVertex(), new Effectivevalue(), new Vertexvalue()),
            xIPanel = new TabTemplatePanel("Ind. Blindwiderstand XL", bgpanel[3], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerXL(), new InductiveBlindResistance(), new Frequency(), new Inductivity()),
            xCPanel = new TabTemplatePanel("Kap. Blindwiderstand XC", bgpanel[4], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerXC(), new CapacitBlindResistance(), new Frequency(), new Capacity()),
            bIPanel = new TabTemplatePanel("Ind. Blindleitwert BL", bgpanel[5], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerBL(), new InductiveBlindConductance(), new Frequency(), new Inductivity()),
            bCPanel = new TabTemplatePanel("Kap. Blindleitwert BC", bgpanel[6], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerBC(), new CapacityBlindConductance(), new Frequency(), new Capacity()),
            xbPanel = new TabTemplatePanel("XB", bgpanel[7], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerXB(), new BlindResistance(), new BlindConductance()),
            additionZPanel = new TabTemplatePanel("Kom. Z. Addition", bgpanel[8], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerAdditionZ(), new Realpart("1."+Realpart.NAME), new Imaginarypart("1."+Imaginarypart.NAME), new Realpart("2."+Realpart.NAME), new Imaginarypart("2."+Imaginarypart.NAME), new Realpart("Gesamter "+Realpart.NAME), new Imaginarypart("Gesamter "+Imaginarypart.NAME)), 
            subtractionZPanel = new TabTemplatePanel("Kom. Z. Subtraktion", bgpanel[9], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerSubtractionZ(), new Realpart("1."+Realpart.NAME), new Imaginarypart("1."+Imaginarypart.NAME), new Realpart("2."+Realpart.NAME), new Imaginarypart("2."+Imaginarypart.NAME), new Realpart("Gesamter "+Realpart.NAME), new Imaginarypart("Gesamter "+Imaginarypart.NAME)),
            multiplicationZPanel = new TabTemplatePanel("Kom. Z. Multiplikation", bgpanel[10], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerMultiplicationZ(), new Pointerlength("1." + Pointerlength.NAME), new Angle("1."+Angle.NAME), new Pointerlength("2."+Pointerlength.NAME), new Angle("2."+Angle.NAME), new Pointerlength("Gesamter " + Pointerlength.NAME), new Angle("Gesamter "+Angle.NAME)),
            divisionZPanel = new TabTemplatePanel("Kom. Z. Division", bgpanel[11], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerDivisionZ(), new Pointerlength("1."+Pointerlength.NAME), new Angle("1."+Angle.NAME), new Pointerlength("2."+Pointerlength.NAME), new Angle("2."+Angle.NAME), new Pointerlength("Gesamter " + Pointerlength.NAME), new Angle("Gesamter "+Angle.NAME)),
            komplexNumberConverterPanel = new TabTemplatePanel("K.F. - P.F.", bgpanel[12], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerConverterZ(), new Realpart(), new Imaginarypart(), new Pointerlength(), new Angle()),
            impedanzPanel = new TabTemplatePanel("Impedanz Z", bgpanel[14], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerImpedanz(), new Impedanz(), new Angle(Angle.NAME+" von Z"), new Current("Scheitelstrom I"), new Angle(Angle.NAME + " von I"), new Voltage(), new Angle(Angle.NAME+" von U")),
            admittanzPanel = new TabTemplatePanel("Admittanz Y", bgpanel[15], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerAdmittanz(), new Admittanz(), new Angle(Angle.NAME+" von Y"), new Voltage("Scheitelspannung U"), new Angle(Angle.NAME + " von U"), new Current(), new Angle(Angle.NAME+" von I")),
            zyPanel = new TabTemplatePanel("ZY", bgpanel[16], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerZY(), new Pointerlength(), new Angle(Angle.NAME+" von Z"), new Pointerlength("Betrag Y"), new Angle(Angle.NAME+" von Y")),
            apparentpowerPanel = new TabTemplatePanel("Scheinleistung", bgpanel[17], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerApparentpower(), new ApparentPower(), new Voltage(), new Current()),
            activepowerPanel = new TabTemplatePanel("Wirkleistung", bgpanel[18], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerActivepower(), new ActivePower(), new Voltage(), new Current(), new Cosinus()),
            blindpowerPanel = new TabTemplatePanel("Blindleistung", bgpanel[19], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerBlindpower(), new BlindPower(), new Voltage(), new Current(), new Sinus()),
            powerfactorPanel = new TabTemplatePanel("Leistungsfaktor", bgpanel[20], tpane.getWidth(), tpane.getHeight(), new CalculatorHandlerPowerfactor(), new Powerfactor(), new ActivePower(), new ApparentPower())
        };
        
        //unsaubere Nachbesserung, weil man nicht überprüfen kann ob ein TextFeld enabled ist
        disableTextField(additionZPanel);
        disableTextField(subtractionZPanel);
        disableTextField(multiplicationZPanel);
        disableTextField(divisionZPanel);
        
        
        for(int i = 0; i<tabpanels.length; i++){
            tpane.addTab(tabpanels[i].name, tabpanels[i]);
        }   
        this.add(tpane);
    }
    
    public void disableTextField(TabTemplatePanel tp){
        tp.valuePanel[4].tf.setBackground(ValueTemplatePanel.TEXTFIELD_NOT_ENABLED);
        tp.valuePanel[4].tf.setEnabled(false);
        tp.valuePanel[5].tf.setBackground(ValueTemplatePanel.TEXTFIELD_NOT_ENABLED);
        tp.valuePanel[5].tf.setEnabled(false);
    }
        
    public TabTemplatePanel getTabPanel(){
        return getTabPanel(tpane.getSelectedIndex());
    }
    
    public TabTemplatePanel getTabPanel(int index){
        return tabpanels[index];
    }

}

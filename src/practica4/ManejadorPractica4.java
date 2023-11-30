package practica4;

import java.awt.*;
import java.awt.event.*;

public class ManejadorPractica4 implements AdjustmentListener, FocusListener {
    LaminaPractica4 laminaPractica4;

    String colores []={"negro","gris oscuro","gris","gris claro","blanco","magenta","azul","cian","verde","amarillo","naranja","rojo","rosa"};
    Color col[]={Color.BLACK,Color.DARK_GRAY,Color.GRAY,Color.LIGHT_GRAY,Color.WHITE,Color.MAGENTA,Color.BLUE,Color.CYAN,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED,Color.PINK};
    public ManejadorPractica4(LaminaPractica4 laminaPractica4) {
        this.laminaPractica4=laminaPractica4;

    }


    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        if(e.getSource()==laminaPractica4.scroll1 || e.getSource()==laminaPractica4.scroll2 || e.getSource()==laminaPractica4.scroll3){
            laminaPractica4.centro.setBackground(new Color(laminaPractica4.scroll1.getValue(),laminaPractica4.scroll2.getValue(),laminaPractica4.scroll3.getValue()));
            laminaPractica4.jTRojo.setText(String.valueOf(laminaPractica4.scroll1.getValue()));
            laminaPractica4.jTVerde.setText(String.valueOf(laminaPractica4.scroll2.getValue()));
            laminaPractica4.jTAzul.setText(String.valueOf(laminaPractica4.scroll3.getValue()));
        }
    }



    @Override
    public void focusGained(FocusEvent e) {
        laminaPractica4.jTRojo.selectAll();
        laminaPractica4.jTAzul.selectAll();
        laminaPractica4.jTVerde.selectAll();
    }

    @Override
    public void focusLost(FocusEvent e) {
        if(e.getSource()==laminaPractica4.jTRojo || e.getSource()==laminaPractica4.jTVerde || e.getSource()==laminaPractica4.jTAzul) {
            laminaPractica4.scroll1.setValue(Integer.parseInt(laminaPractica4.jTRojo.getText()));
            laminaPractica4.scroll2.setValue(Integer.parseInt(laminaPractica4.jTVerde.getText()));
            laminaPractica4.scroll3.setValue(Integer.parseInt(laminaPractica4.jTAzul.getText()));
            System.out.println(laminaPractica4.jTVerde.getText());
        }
    }
}

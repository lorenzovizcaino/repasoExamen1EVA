package practica1;

import javax.swing.*;

public class VentanaPractica1 extends JFrame {

    public VentanaPractica1(){
        setBounds(10,10,400,150);
        setTitle("Ejemplo de uso de JCheckBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaPractica1 laminaPractica1=new LaminaPractica1();
        add(laminaPractica1);
        setVisible(true);
    }
}

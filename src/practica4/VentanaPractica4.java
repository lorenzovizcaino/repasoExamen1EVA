package practica4;

import practica2.LaminaPractica2;

import javax.swing.*;

public class VentanaPractica4 extends JFrame {


    public VentanaPractica4(){
        setTitle("Colores");
        setBounds(10,10,500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaPractica4 laminaPractica4=new LaminaPractica4();
        add(laminaPractica4);
        setVisible(true);
    }
}

package practica2;

import practica1.LaminaPractica1;

import javax.swing.*;

public class VentanaPractica2 extends JFrame {

    public VentanaPractica2(){
        setBounds(10,10,400,400);
        setTitle("Practica 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaPractica2 laminaPractica2=new LaminaPractica2();
        add(laminaPractica2);
        setVisible(true);
    }
}

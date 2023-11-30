package practicaGraphics;

import practica4.LaminaPractica4;

import javax.swing.*;

public class VentanaPracticaGraphics extends JFrame {


    public VentanaPracticaGraphics(){
        setBounds(10,10,800,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Cuadrados");
        LaminaPracticaGraphics laminaPracticaGraphics=new LaminaPracticaGraphics();
        add(laminaPracticaGraphics);
        setVisible(true);
    }
}

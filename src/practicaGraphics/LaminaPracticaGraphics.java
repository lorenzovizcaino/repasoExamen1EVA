package practicaGraphics;

import javax.swing.*;
import java.awt.*;

public class LaminaPracticaGraphics extends JPanel {
    JLabel labelcoordenadaX1, labelcoordenadaX2,labelcoordenadaY1,labelcoordenadaY2;
    JTextField fieldcoordenadaX1, fieldcoordenadaX2,fieldcoordenadaY1,fieldcoordenadaY2;
    JTextArea area;
    JPanel panel,panelNorte,panelCentro, panelSur;
    JButton colorBorde, colorInterior, calcular, dibujar, limpiar;
    GBCConstrains gbc=new GBCConstrains();

    public LaminaPracticaGraphics(){
        setLayout(new GridBagLayout());
        panelNorte=new JPanel();
        panelNorte.setLayout(new GridLayout(2,3,30,10));
        labelcoordenadaX1=new JLabel("Coordenada X");
        labelcoordenadaX1.setHorizontalAlignment(JTextField.RIGHT);
        labelcoordenadaX2=new JLabel("Coordenada X");
        labelcoordenadaX2.setHorizontalAlignment(JTextField.RIGHT);
        labelcoordenadaY1=new JLabel("Coordenada Y");
        labelcoordenadaY1.setHorizontalAlignment(JTextField.RIGHT);
        labelcoordenadaY2=new JLabel("Coordenada Y");
        labelcoordenadaY2.setHorizontalAlignment(JTextField.RIGHT);
        fieldcoordenadaX1=new JTextField(5);
        fieldcoordenadaX2=new JTextField(5);
        fieldcoordenadaY1=new JTextField(5);
        fieldcoordenadaY2=new JTextField(5);
        colorBorde=new JButton("Color Borde");
        colorInterior=new JButton("Color Interior");
        panelNorte.add(labelcoordenadaX1);
        panelNorte.add(fieldcoordenadaX1);
        panelNorte.add(labelcoordenadaY1);
        panelNorte.add(fieldcoordenadaY1);
        panelNorte.add(colorBorde);
        panelNorte.add(labelcoordenadaX2);
        panelNorte.add(fieldcoordenadaX2);
        panelNorte.add(labelcoordenadaY2);
        panelNorte.add(fieldcoordenadaY2);
        panelNorte.add(colorInterior);
        panelCentro=new JPanel();
        panelCentro.setLayout(new GridLayout(1,2));
        area=new JTextArea();
        panel=new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panelCentro.add(area);
        panelCentro.add(panel);

        panelSur=new JPanel();
        panelSur.setLayout(new GridLayout(1,3,20,10));
        calcular=new JButton("Calcular");
        dibujar=new JButton("Dibujar");
        limpiar=new JButton("Limpiar");
        panelSur.add(calcular);
        panelSur.add(dibujar);
        panelSur.add(limpiar);






        add(panelNorte,gbc.Constrains(0,0,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(panelCentro,gbc.Constrains(0,1,1,4,1.0,1.0,GridBagConstraints.BOTH,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(panelSur,gbc.Constrains(0,5,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));












    }
}

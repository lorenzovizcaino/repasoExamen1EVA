package practica2;

import javax.swing.*;
import java.awt.*;

public class LaminaPractica2 extends JPanel {
    private JLabel labelNumerador1,labelNumerador2,labelDenominador1,labelDenominador2;
    protected JTextField fieldNumerador1,fieldNumerador2,fieldDenominador1,fieldDenominador2;
    protected JTextArea textArea;
    private ButtonGroup grupo;
    protected JRadioButton radioSuma,radioResta,radioMultiplicacion,radioDivision;
    private JButton calcular,limpiar;
    private JPanel operacion;
    private GBCConstrains constrains=new GBCConstrains();
    private Manejador manejador=new Manejador(this);;

    public LaminaPractica2(){
        setLayout(new GridBagLayout());
        labelNumerador1=new JLabel("Numerador 1");
        labelNumerador2=new JLabel("Numerador 2");
        labelDenominador1=new JLabel("Denominador 1");
        labelDenominador2=new JLabel("Denominador 2");
        fieldNumerador1=new JTextField(5);
        fieldNumerador2=new JTextField(5);
        fieldDenominador1=new JTextField(5);
        fieldDenominador2=new JTextField(5);
        textArea=new JTextArea(5,20);
        textArea.setBorder(BorderFactory.createTitledBorder("RESULTADOS"));
        grupo=new ButtonGroup();

        radioSuma=new JRadioButton("Suma");
        radioSuma.setSelected(true);
        radioResta=new JRadioButton("Resta");
        radioMultiplicacion=new JRadioButton("Multiplicacion");
        radioDivision=new JRadioButton("Division");

        grupo.add(radioSuma);
        grupo.add(radioResta);
        grupo.add(radioMultiplicacion);
        grupo.add(radioDivision);
        operacion=new JPanel();
        operacion.setLayout(new GridLayout(4,1));
        operacion.setBorder(BorderFactory.createTitledBorder("Operacion"));
        operacion.add(radioSuma);
        operacion.add(radioResta);
        operacion.add(radioMultiplicacion);
        operacion.add(radioDivision);
        calcular=new JButton("Calcular");
        limpiar=new JButton("Limpiar");


        add(labelNumerador1,constrains.Constrains(0,0,1,1,0.0,0.0,GridBagConstraints.NONE,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(fieldNumerador1,constrains.Constrains(1,0,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(labelDenominador1,constrains.Constrains(2,0,1,1,0.0,0.0,GridBagConstraints.NONE,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(fieldDenominador1,constrains.Constrains(3,0,1,1,1.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));

        add(labelNumerador2,constrains.Constrains(0,1,1,1,0.0,0.0,GridBagConstraints.NONE,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(fieldNumerador2,constrains.Constrains(1,1,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(labelDenominador2,constrains.Constrains(2,1,1,1,0.0,0.0,GridBagConstraints.NONE,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(fieldDenominador2,constrains.Constrains(3,1,1,1,0.0,0.0,GridBagConstraints.HORIZONTAL,GridBagConstraints.CENTER,new Insets(5,5,5,5)));

        add(textArea,constrains.Constrains(0,2,3,4,1.0,1.0,GridBagConstraints.BOTH,GridBagConstraints.CENTER,new Insets(5,5,5,5)));

        add(operacion,constrains.Constrains(3,2,1,4,0.0,0.0,GridBagConstraints.NONE,GridBagConstraints.CENTER,new Insets(5,5,5,5)));

        add(calcular,constrains.Constrains(2,6,1,1,0.0,0.0,GridBagConstraints.NONE,GridBagConstraints.CENTER,new Insets(5,5,5,5)));
        add(limpiar,constrains.Constrains(3,6,1,1,0.0,0.0,GridBagConstraints.NONE,GridBagConstraints.CENTER,new Insets(5,5,5,5)));

        limpiar.addActionListener(manejador);
        calcular.addActionListener(manejador);

    }


}

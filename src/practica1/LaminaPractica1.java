package practica1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LaminaPractica1 extends JPanel {

    private JLabel jlabel;
    private JTextField jTextField;
    private JCheckBox jCheckBox;
    private Font font=new Font("Verdana",Font.BOLD,15);

    public LaminaPractica1(){
        setLayout(new GridLayout(3,1));
        jlabel=new JLabel("Introduce un texto cualquiera");
        jlabel.setHorizontalAlignment(JLabel.CENTER);
        jlabel.setVerticalAlignment(JLabel.CENTER);

        jlabel.setFont(font);
        jTextField=new JTextField(20);
        jTextField.setFont(font);
        jCheckBox=new JCheckBox("Convertir el texto a mayusculas");
        jCheckBox.setFont(font);
        jCheckBox.setMnemonic('C');
        add(jlabel);
        add(jTextField);
        add(jCheckBox);

        jCheckBox.addActionListener(e->{
            if(jCheckBox.isSelected()){
                jTextField.setText(jTextField.getText().toUpperCase());
            }else{
                jTextField.setText(jTextField.getText().toLowerCase());
            }
        });
        jCheckBox.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar()=='C' || e.getKeyChar()=='c'){
                    if(jCheckBox.isSelected()){
                        jCheckBox.setSelected(false);
                        jTextField.setText(jTextField.getText().toLowerCase());
                    }else{
                        jCheckBox.setSelected(true);
                        jTextField.setText(jTextField.getText().toUpperCase());
                    }

                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

}

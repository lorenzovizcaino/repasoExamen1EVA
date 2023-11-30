package practica2;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manejador implements ActionListener {
    private LaminaPractica2 laminaPractica2;
    Racional2 num1, num2, resultado;


    public Manejador(LaminaPractica2 laminaPractica2) {
        this.laminaPractica2 = laminaPractica2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Limpiar") {
            laminaPractica2.fieldNumerador1.setText("");
            laminaPractica2.fieldNumerador2.setText("");
            laminaPractica2.fieldDenominador1.setText("");
            laminaPractica2.fieldDenominador2.setText("");
            laminaPractica2.textArea.setText("");
        }
        if (e.getActionCommand() == "Calcular") {
            try{
                num1 = new Racional2(Integer.parseInt(laminaPractica2.fieldNumerador1.getText()), Integer.parseInt(laminaPractica2.fieldDenominador1.getText()));
                num2 = new Racional2(Integer.parseInt(laminaPractica2.fieldNumerador2.getText()), Integer.parseInt(laminaPractica2.fieldDenominador2.getText()));
                resultado = new Racional2();
                if (laminaPractica2.radioSuma.isSelected()) {
                    resultado.sumar(num1, num2);
                    laminaPractica2.textArea.setText(laminaPractica2.textArea.getText() +
                            "\n" + num1.devolverNumerador() + " / " + num1.devolverDenominador() +
                            " + " + num2.devolverNumerador() + " / " + num2.devolverDenominador() +
                            " = " + resultado.devolverNumerador() + " / " + resultado.devolverDenominador());
                }
                if (laminaPractica2.radioResta.isSelected()) {
                    resultado.restar(num1, num2);
                    laminaPractica2.textArea.setText(laminaPractica2.textArea.getText() +
                            "\n" + num1.devolverNumerador() + " / " + num1.devolverDenominador() +
                            " - " + num2.devolverNumerador() + " / " + num2.devolverDenominador() +
                            " = " + resultado.devolverNumerador() + " / " + resultado.devolverDenominador());
                }
                if (laminaPractica2.radioMultiplicacion.isSelected()) {
                    resultado.multiplicar(num1, num2);
                    laminaPractica2.textArea.setText(laminaPractica2.textArea.getText() +
                            "\n" + num1.devolverNumerador() + " / " + num1.devolverDenominador() +
                            " * " + num2.devolverNumerador() + " / " + num2.devolverDenominador() +
                            " = " + resultado.devolverNumerador() + " / " + resultado.devolverDenominador());
                }
                if (laminaPractica2.radioDivision.isSelected()) {
                    resultado.dividir(num1, num2);
                    laminaPractica2.textArea.setText(laminaPractica2.textArea.getText() +
                            "\n" + num1.devolverNumerador() + " / " + num1.devolverDenominador() +
                            " / " + num2.devolverNumerador() + " / " + num2.devolverDenominador() +
                            " = " + resultado.devolverNumerador() + " / " + resultado.devolverDenominador());
                }
            }catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(laminaPractica2,"Has introducido un caracter no numerico o hay campos vacios","Error",JOptionPane.ERROR_MESSAGE);
            }


        }
    }


}

package practica4;



import javax.swing.*;
import java.awt.*;

public class LaminaPractica4 extends JPanel {

    JScrollBar scroll1,scroll2, scroll3;
    JButton botones [];
    JLabel jLRojo,jLVerde,jLAzul;
    JTextField jTRojo,jTVerde,jTAzul;
    JPanel oeste,sur,este,centro;

    ManejadorPractica4 manejadorPractica4;
    PanelBotonesColores panelBotonesColores;

    public LaminaPractica4(){
        setLayout(new BorderLayout());
        oeste=new JPanel();
        oeste.setLayout(new GridLayout(1,3));

        scroll1=new JScrollBar(JScrollBar.VERTICAL,0,1,0,254);
        scroll2=new JScrollBar(JScrollBar.VERTICAL,0,1,0,254);
        scroll3=new JScrollBar(JScrollBar.VERTICAL,0,1,0,254);
        oeste.add(scroll1);
        oeste.add(scroll2);
        oeste.add(scroll3);

        sur=CrearPanelSur();
        centro=new JPanel();
        centro.setBackground(Color.GRAY);
        panelBotonesColores=new PanelBotonesColores();






        add(oeste,BorderLayout.WEST);
        add(sur,BorderLayout.SOUTH);
        add(panelBotonesColores,BorderLayout.EAST);
        add(centro,BorderLayout.CENTER);
        manejadorPractica4=new ManejadorPractica4(this);

        scroll1.addAdjustmentListener(manejadorPractica4);
        scroll2.addAdjustmentListener(manejadorPractica4);
        scroll3.addAdjustmentListener(manejadorPractica4);
        jTAzul.addFocusListener(manejadorPractica4);
        jTRojo.addFocusListener(manejadorPractica4);
        jTVerde.addFocusListener(manejadorPractica4);





    }

    class PanelBotonesColores extends JPanel{

        String colores []={"negro","gris oscuro","gris","gris claro","blanco","magenta","azul","cian","verde","amarillo","naranja","rojo","rosa"};
        Color col[]={Color.BLACK,Color.DARK_GRAY,Color.GRAY,Color.LIGHT_GRAY,Color.WHITE,Color.MAGENTA,Color.BLUE,Color.CYAN,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED,Color.PINK};

        public PanelBotonesColores(){
            botones=new JButton[13];
            setLayout(new GridLayout(13,1));
            for(int i=0;i<13;i++){

                botones[i]=new JButton(colores[i]);
                if(i<3){
                    botones[i].setForeground(Color.WHITE);
                }
                botones[i].setBackground(col[i]);
                add(botones[i]);

                int finalI1 = i;
                botones[i].addActionListener(e -> {
                    if(e.getActionCommand()==colores[finalI1]){
                        int azul=col[finalI1].getBlue();
                        int rojo=col[finalI1].getRed();
                        int verde=col[finalI1].getGreen();
                        scroll1.setValue(rojo);
                        scroll2.setValue(verde);
                        scroll3.setValue(azul);


                    }
                });


            }
        }
    }



    private JPanel CrearPanelSur() {
        JPanel s=new JPanel();
        s.setLayout(new GridLayout(1,6));
        jLRojo=new JLabel("Rojo");
        jLVerde=new JLabel("Verde");
        jLAzul=new JLabel("Azul");

        jTRojo=new JTextField("0",5);
        jTVerde=new JTextField("0",5);
        jTAzul=new JTextField("0",5);
        s.add(jLRojo);
        s.add(jTRojo);
        s.add(jLVerde);
        s.add(jTVerde);
        s.add(jLAzul);
        s.add(jTAzul);



        return s;

    }

}



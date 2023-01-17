//Uso del drawLine para conectar las esquinas de un panel
import javax.swing.*;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int anchura = getWidth();//Anchura total
        int altura = getHeight();//Altura total

        //Dibujamos una linea de la esquina superior izquierda a la esquina inferior derecha
        //g.drawLine(0,0,anchura,altura);
        //Dibujamos una linea de la esquina inferior izquierda a la esquina superior derecha
        //g.drawLine(0,altura,anchura,0);
        g.drawLine(10,30,10,200);//1
        g.drawLine(50,90,50,200);//2
        g.drawLine(10,200,50,200);//3
        g.drawLine(10,30,50,30);//12
        g.drawLine(10,30,30,10);//18
        g.drawLine(30,10,70,10);
        g.drawLine(50,30,70,10);
        g.drawLine(50,90,150,200);
        g.drawLine(150,200,190,200);
        g.drawLine(190,200,190,30);
        g.drawLine(190,30,150,30);
        g.drawLine(150,30,150,140);
        g.drawLine(50,30,150,140);
    }
}

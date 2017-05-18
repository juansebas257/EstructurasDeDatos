package Pilas;

import Main.Bola;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;

/**
 *
 * @author Sebastian
 */
public class PanelPilas extends Canvas{
    
    ArrayList<Bola> bolas;
    Color color=Color.BLUE;
    boolean ejecutar=false;
    
    public PanelPilas(){
        bolas=new ArrayList();
        
        bolas.add(new Bola(50,50,50,50,color));
        
        // Clase en la que está el código a ejecutar 
        TimerTask timerTask = new TimerTask() {
            public void run() {
                if(ejecutar){
                // Aquí el código que queremos ejecutar. 
                bolas.get(0).setX(100);
                bolas.get(0).setY(100);
                repaint();
                System.out.println("hilo");
                }else{
                    ejecutar=true;
                }
            }
        };

        // Aquí se pone en marcha el timer cada segundo. 
        Timer timer = new Timer();
        // Dentro de 0 milisegundos avísame cada 1000 milisegundos 
        timer.scheduleAtFixedRate(timerTask, 0, 3000);
    }
    
    public void paint(Graphics g){
	g.setColor(bolas.get(0).getColor());
        g.fillOval(bolas.get(0).getX(),bolas.get(0).getY(),bolas.get(0).getWidth(),bolas.get(0).getHeight());
    }
    
}

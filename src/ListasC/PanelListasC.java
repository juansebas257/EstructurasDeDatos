package ListasC;

import Main.Bola;
import ListasC.NodoL.*;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JuanCamilo
 */
public class PanelListasC extends Canvas {

    NodoL ant, sig;
    int tamannio = 0;
    Graphics2D g2d;
    Color colorBola, colorTexto;
    boolean ejecutar = false;
    int diametro = 50;
    Font fuente;

    public PanelListasC() {
        sig = null;
        colorBola = Color.BLUE;
        colorTexto = Color.WHITE;
        fuente = new Font("Verdana", Font.BOLD, 18);
    }

    public void paint(Graphics g) {
        g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //RECORRIENDO LA PILA SI HAY AL MENOS 1 NODO...
        if (sig != null) {
            NodoL actual = sig;
            int posicionY = diametro;
            do {
                System.out.println(actual.getInfo() + "");
                g2d.setColor(colorTexto);
                g2d.fillOval((getWidth() / 2) - diametro - 2, posicionY - 2, diametro + 4, diametro + 4);
                g2d.setColor(colorBola);
                g2d.fillOval((getWidth() / 2) - diametro, posicionY, diametro, diametro);
                g2d.setColor(colorTexto);
                g2d.setFont(fuente);
                g2d.drawString(actual.getInfo() + "", (getWidth() / 2) - (diametro / 2) - 5, posicionY + (diametro / 2) + 5);
                actual = actual.getsig();
                posicionY += diametro;
            } while (actual != null);
        }

    }

    public void insertarPrimero(int numero) {
        NodoL nuevo = new NodoL();
        nuevo.Info = numero;
        NodoL raiz = null;
        if (raiz == null) {
            nuevo.sig = nuevo;
            nuevo.ant = nuevo;
            raiz = nuevo;
        } else {
            NodoL ultimo = raiz.ant;
            nuevo.sig = raiz;
            nuevo.ant = ultimo;
            raiz.ant = nuevo;
            ultimo.sig = nuevo;
            raiz = nuevo;
        }
        tamannio++;
        repaint();
    }
    
public int cantidad() {
        int cant = 0;
        if (!vacia()) {
            NodoL raiz = null;
            NodoL reco = raiz;
            do {
                cant++;
                reco = reco.sig;
            } while (reco != raiz);
        }
        return cant;
    }

    public void borrar(int pos) {
        if (pos <= cantidad()) {
            if (pos == 1) {
                if (cantidad() == 1) {
                    Object raiz = null;
                } else {
                    NodoL ultimo = raiz.ant;
                    NodoL raiz = null;
                    raiz = raiz.sig;
                    ultimo.sig = raiz;
                    raiz.ant = ultimo;
                }
            } else {
                NodoL raiz = null;
                NodoL reco = raiz;
                for (int f = 1; f <= pos - 1; f++) {
                    reco = reco.sig;
                }
                NodoL anterior = reco.ant;
                reco = reco.sig;
                anterior.sig = reco;
                reco.ant = anterior;
            }
        }

    }

    private boolean vacia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class raiz {

        private static NodoL ant;

        public raiz() {
        }
    }
}
package Pilas;

import Main.Bola;
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
 * @author Sebastian
 */
public class PanelPilas extends Canvas {

    Nodo primero;
    int tamannio = 0;
    Graphics2D g2d;
    Color colorBola, colorTexto;
    boolean ejecutar = false;
    int diametro = 50;
    Font fuente;

    public PanelPilas() {
        primero = null;
        colorBola = Color.BLUE;
        colorTexto = Color.WHITE;
        fuente = new Font("Verdana", Font.BOLD, 18);
    }

    public void paint(Graphics g) {
        g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //RECORRIENDO LA PILA SI HAY AL MENOS 1 NODO...
        if (primero != null) {
            Nodo actual = primero;
            int posicionY = diametro;
            do {
                System.out.println(actual.getDato() + "");
                g2d.setColor(colorTexto);
                g2d.fillOval((getWidth() / 2) - diametro - 2, posicionY - 2, diametro + 4, diametro + 4);
                g2d.setColor(colorBola);
                g2d.fillOval((getWidth() / 2) - diametro, posicionY, diametro, diametro);
                g2d.setColor(colorTexto);
                g2d.setFont(fuente);
                g2d.drawString(actual.getDato() + "", (getWidth() / 2) - (diametro / 2) - 5, posicionY + (diametro / 2) + 5);
                actual = actual.getSiguiente();
                posicionY += diametro;
            } while (actual != null);
        }

    }

    public void apilar(int numero) {
        Nodo nodo = new Nodo(numero, null);
        if (primero == null) {
            primero = nodo;
        } else {
            nodo.setSiguiente(primero);
            primero = nodo;
        }
        tamannio++;
        repaint();
    }

    public void desapilar(int numero) {
        Nodo actual = primero;
        Nodo anterior = primero;
        boolean encontrado = false;
        if (primero != null) {
            do {
                if (actual.getDato() == numero) {
                    encontrado = true;
                    //se encontro el nodo, ahora se desapila...
                    if (anterior == primero) {
                        primero = primero.getSiguiente();
                    } else {
                        anterior.setSiguiente(actual.getSiguiente());
                    }
                }
                anterior = actual;
                actual = actual.getSiguiente();
            } while (actual != null);
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró el nodo con el dato: " + numero);
        }
        repaint();
    }

}

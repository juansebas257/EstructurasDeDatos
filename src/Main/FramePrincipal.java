/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import ArbolesBTS.PanelArbolesPanel;
import Colas.PanelColas;
import ListasC.PanelListasC;
import ListasDE.PanelListasDE;
import ListasE.PanelListasE;
import Pilas.PanelPilas;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Sebastian
 */
public class FramePrincipal extends JFrame {

    JButton bAgregar, bEliminar;
    JTextArea area;
    JTextField field;
    JTabbedPane tabs;
    PanelPilas panelPilas;

    public FramePrincipal() {
        panelPilas = new PanelPilas();
        tabs = new JTabbedPane();
        tabs.add("Pilas", panelPilas);
        tabs.add("Colas", new PanelColas());
        tabs.add("Listas Enlazadas", new PanelListasE());
        tabs.add("Listas Doblemente Enlazadas", new PanelListasDE());
        tabs.add("Listas Circulares", new PanelListasC());
        tabs.add("Árboles BTS", new PanelArbolesPanel());

        bAgregar = new JButton("Agregar");
        bAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                botonAgregar();
            }
        });

        bEliminar = new JButton("Eliminar");
        bEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                botonEliminar();
            }
        });

        field = new JTextField(30);

        setLayout(new BorderLayout());

        JPanel pBotones = new JPanel();
        pBotones.add(bAgregar);
        pBotones.add(bEliminar);
        pBotones.add(field);

        add(tabs, BorderLayout.CENTER);
        //add(new JPanel(),BorderLayout.CENTER);
        add(pBotones, BorderLayout.SOUTH);

        setSize(600, 500);
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void botonAgregar() {
        try {
            int numero = Integer.parseInt(field.getText());
            int pestannia = tabs.getSelectedIndex();

            switch (pestannia) {
                //PESTAÑA PILAS...
                case 0:
                    panelPilas.apilar(numero);
                    break;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un número");
        }
    }

    private void botonEliminar() {
        try {
            int numero = Integer.parseInt(field.getText());
            int pestannia = tabs.getSelectedIndex();

            switch (pestannia) {
                //PESTAÑA PILAS...
                case 0:
                    panelPilas.desapilar(numero);
                    break;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un número");
        }
    }

}

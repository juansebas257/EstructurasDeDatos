/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import ArbolesBTS.PanelArboles;
import Colas.PanelColas;
import ListasC.PanelListasC;
import ListasDE.PanelListasDE;
import ListasE.PanelListasE;
import Pilas.PanelPilas;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author Sebastian
 */
public class FramePrincipal extends JFrame {

    JButton bAgregar, bEliminar;
    JTextField field;

    public FramePrincipal() {

        JTabbedPane tabs = new JTabbedPane();
        tabs.add("Pilas", new PanelPilas());
        tabs.add("Colas", new PanelColas());
        tabs.add("Listas Enlazadas", new PanelListasE());
        tabs.add("Listas Doblemente Enlazadas", new PanelListasDE());
        tabs.add("Listas Circulares", new PanelListasC());
        tabs.add("Árboles BTS", new PanelArboles());

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
        
        field=new JTextField(30);
        
        setLayout(new BorderLayout());
        
        JPanel pBotones=new JPanel();
        pBotones.add(bAgregar);
        pBotones.add(bEliminar);
        pBotones.add(field);
        
        add(tabs,BorderLayout.NORTH);
        add(new JPanel(),BorderLayout.CENTER);
        add(pBotones,BorderLayout.SOUTH);
        
        setSize(600,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
    }

    private void botonAgregar() {
        
    }

    private void botonEliminar() {
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpersonal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author jean
 */
public class Menu implements ActionListener {
    JFrame ventana;
    JMenu o1,o2;
    JMenuItem i1,i2;
    JMenuBar menu;
    public Menu(){
        this.CrearMenu();
        this.CrearVentana();
    }
    public void CrearMenu(){        
        menu = new JMenuBar();
        o1 = new JMenu("Opción 1");
        o2 = new JMenu("Opción 2");
        i1 = new JMenuItem("Sub opción 1");
        i2 = new JMenuItem("Sub opción 2");
        
        menu.add(o1);
        menu.add(o2);
        o1.add(i1);
        o2.add(i2);
        
        i2.addActionListener(this);
    }    
    public void CrearVentana(){
        ventana = new JFrame("Formulario con Menú");
        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.setSize(300,300);
        ventana.setVisible(true);
        ventana.setJMenuBar(menu);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==i2){
            this.ventana.setSize(700,200);
        }
    }
}

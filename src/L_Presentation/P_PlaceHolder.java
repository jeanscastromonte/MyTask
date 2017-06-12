/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_Presentation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author JEANCARLOS
 */
public class P_PlaceHolder extends JTextField {
//=============================================================================================================================
    //<editor-fold defaultstate="collapsed" desc="Public Attributes">

    private String PlaceHolderText;
    private Color phColor = new Color(0, 0, 0);
    private Dimension d = new Dimension(200, 35);
    private boolean Flag = true;

    //</editor-fold>
//=============================================================================================================================
    //<editor-fold defaultstate="collapsed" desc="Public Propertys">
    public String getPlaceHolderText() {
        return PlaceHolderText;
    }

    public void setPlaceHolderText(String PlaceHolderText) {
        this.PlaceHolderText = PlaceHolderText;
    }

    public Color getPhColor() {
        return phColor;
    }

    public void setPhColor(Color phColor) {
        this.phColor = phColor;
    }

    //</editor-fold>
//=============================================================================================================================
    //<editor-fold defaultstate="collapsed" desc="Public Constructor">
    public P_PlaceHolder() {
        super();
        setSize(d);
        setPreferredSize(d);
        setVisible(true);
        setMargin(new Insets(0, 0, 0, 0));
        getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                Flag = ((getText().length() > 0)) ? false : true;
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                Flag = false;
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
    }
    //</editor-fold>
//=============================================================================================================================
    //<editor-fold defaultstate="collapsed" desc="Public Methods">

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //color de placeholder
        g.setColor(new Color(phColor.getRed(), phColor.getGreen(), phColor.getBlue(), 90));
        //dibuja texto
        g.drawString((Flag) ? PlaceHolderText : "", (getMargin().left + 7), (getSize().height) / 2 + getFont().getSize() / 2);
    }
    //</editor-fold>
//=============================================================================================================================
}

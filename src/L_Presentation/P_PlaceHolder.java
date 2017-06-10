/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_Presentation;

import javax.swing.JTextField;

/**
 *
 * @author JEANCARLOS
 */
public class P_PlaceHolder {
//=============================================================================================================================
    //<editor-fold defaultstate="collapsed" desc="Public Attributes">
    public static final String ColorInit = "#818181";    
    public static final String ColorFinish = "#000000";
    //</editor-fold>
//=============================================================================================================================
    //<editor-fold defaultstate="collapsed" desc="Public Methods">
    public void InitPlaceHolder(JTextField JTextField, String Message){
        JTextField.setText(Message);
        JTextField.setForeground(java.awt.Color.decode(ColorInit));
    }
    
    public void FinishPlaceHolder(JTextField JTextField, String Message){
        if(JTextField.getText().equals(Message)){
            JTextField.setText("");
            JTextField.setForeground(java.awt.Color.decode(ColorFinish));
        }
    }
    //</editor-fold>
//=============================================================================================================================
}

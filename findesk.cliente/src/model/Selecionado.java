/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author ld_si
 */
public class Selecionado implements MouseListener {
    private JLabel marcado = null;

    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel label = (JLabel) e.getSource();
        if(marcado != null && marcado != label){
            marcado.setForeground(Color.black);
        }
        if(label.getForeground() != Color.red){
            label.setForeground(Color.red);
            marcado = label;
        }else{
            label.setForeground(Color.black);
            marcado.setForeground(Color.black);
            marcado = null;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    public JLabel getMarcado(){
        return this.marcado;
    }

    
}

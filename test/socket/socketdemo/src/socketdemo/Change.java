/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketdemo;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

/**
 *
 * @author ld_si
 */
public class Change implements ChangeListener{

    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
       //To change body of generated methods, choose Tools | Templates.
       System.out.println("Valor antigo: "+oldValue+"\nmudanca de valor para: " + newValue+"\nvariavel observada: "+observable.toString());
    }
    
}

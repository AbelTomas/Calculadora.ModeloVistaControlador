/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoramodelovistacontrolador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lolo
 */
public class Controlador implements ActionListener{
    private Vista v;
    private Modelo m;

    public Controlador() {
        v= new Vista(this);
        m=new Modelo(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Pulsado el boton :"+ae.getActionCommand());
        
    }
}

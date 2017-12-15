/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoramodelovistacontrolador;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

/**
 *
 * @author Abel
 */
public class Vista extends Frame{
    private Controlador c;
    private Button[] botones=new Button[16];
    private Panel p;

    public Vista(Controlador c) {
        this.c=c;
        p=new Panel(new GridLayout(4,4));
        TextField texto=new TextField();
        this.add(texto,BorderLayout.NORTH);
        this.add(p);
        crearBotones(); 
        aniadirEscuchador();
        aniadirALaVentana();
        this.setBounds(50,50, 300, 300);
        this.setVisible(true);        
    } 

    private void aniadirEscuchador() {
        for (int i = 0; i < botones.length; i++) {
            botones[i].addActionListener(c);
        }
    }

    private void aniadirALaVentana() {
        for (int i = 0; i < botones.length; i++) {
            p.add(botones[i]);
        }
    }

    private void crearBotones() {
        int i;
        for (i = 0; i <= 9; i++) {
            botones[i]=new Button(""+i);
        }
        botones[i]=new Button("+");
        i++;
        botones[i]=new Button("-");
        i++;
        botones[i]=new Button("/");
        i++;
        botones[i]=new Button("*");
        i++;
        botones[i]=new Button("=");
        i++;
        botones[i]=new Button("BORRAR");
        i++;
    }
}

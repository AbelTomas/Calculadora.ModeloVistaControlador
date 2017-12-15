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

    public Vista() {
        Panel p=new Panel(new GridLayout(4,4));
        TextField texto=new TextField();
        this.add(texto,BorderLayout.NORTH);
        this.add(p);
        
        for (int i = 0; i <= 9; i++) {
            p.add(new Button(""+i));
        }
        
        p.add(new Button("-"));
        p.add(new Button("/"));
        p.add(new Button("*"));
        p.add(new Button("+"));
        p.add(new Button("="));
        p.add(new Button("BORRAR"));
        this.setBounds(50,50, 300, 300);
        this.setVisible(true);        
    } 
}

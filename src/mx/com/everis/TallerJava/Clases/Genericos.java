/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.everis.TallerJava.Clases;

import java.util.Vector;

/**
 *
 * @author Berserker
 */
public class Genericos {
    public static void main(String[] args) {
        Vector elementos = new Vector();
        elementos.add(10.5f);
        elementos.add("11");
        
        for (int i = 0; i < elementos.size(); i++) {
            Float valorTmp = (Float) elementos.get(i);
            //Float valorTmp = Float.parseFloat(elementos.get(i).toString());
            System.out.println(valorTmp);            
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.everis.TallerJava.MiGenerico;

/**
 *
 * @author Berserker
 */
public class TestGenerico {
    public static void main(String[] args) {
        //MiGenerico<String> generico = new MiGenerico<String>("Gera");
        MiGenerico<Persona> generico2 = new MiGenerico<Persona>(new Persona());
        generico2.print();
    }
    
}

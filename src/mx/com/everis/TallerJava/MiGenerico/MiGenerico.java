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
public class MiGenerico<T> {
    
    public T valor;
    
    public MiGenerico(T valor){
        this.valor = valor;
        System.out.println(valor);
    }
    
    public void print(){
        System.out.println("Valor : "+this.valor);
    }
}

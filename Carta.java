/**
 * Created by Raul on 1/2/17.
 */
package Miniludoteca;

import java.awt.Image;


public class Carta {
    protected int valor;
    protected Image imagen;

    public Carta (int i){
        this.setValor(i);
    }

    public void setValor(int i){
        this.valor = i;
    }

    public int getValor(){
        return this.valor;
    }

    public Carta getCarta(Carta c){
        return c;
    }

    public Carta Mostrar(Carta c){
        return c;
    }
}
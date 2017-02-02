package Miniludoteca;

/**
 * Created by Raul on 1/2/17.
 */
import java.util.ArrayList;
import java.util.Collections;

public class BarajaEspañola extends Baraja{

    public BarajaEspañola(){
        CartaEspañola[] baraja = new CartaEspañola[40];
        int contador = 0 ;
        for(CartaEspañola.Palo palo: CartaEspañola.Palo.values()){
            for(int valor =1;valor <= 10; valor++){
                baraja[contador]=new CartaEspañola(palo,valor);
                contador++;
            }
        }
    }

    @Override
    public void Mezclar(){
        ArrayList <CartaEspañola> aux = new ArrayList<>();
        for(int i=0; i<this.baraja.length; i++) {
            aux.add((CartaEspañola)baraja[i]);
        }
        Collections.shuffle(aux);
        for(int j=0; j<aux.size();j++){
            this.baraja[j]=aux.get(j);
        }

    }



}

package Miniludoteca;

/**
 * Created by Raul on 2/2/17.
 */
import java.util.Collections;
import java.util.ArrayList;


public class BarajaFrancesa extends Baraja {

    public BarajaFrancesa(){
        CartaFrancesa[] baraja = new CartaFrancesa[104];
        int contador =0;
        for(int i=0;i<2;i++){
            for(CartaFrancesa.Palo palo : CartaFrancesa.Palo.values()){
                for(int valor = 1;valor<13;valor++){
                    baraja[contador]= new CartaFrancesa(palo,valor);
                    contador++;
                }
            }
        }
    }

    @Override
    public void Mezclar(){
        ArrayList <CartaFrancesa> aux = new ArrayList<CartaFrancesa>();
        for(int i=0;i<this.baraja.length;i++){
            aux.add((CartaFrancesa)baraja[i]);
        }
        Collections.shuffle(aux);
        for(int i=0;i<aux.size();i++){
            this.baraja[i]=aux.get(i);
        }
    }

}

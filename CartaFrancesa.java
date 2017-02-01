package Miniludoteca;

/**
 * Created by Raul on 1/2/17.
 */
public class CartaFrancesa extends Carta{
    private enum Palo{CORAZONES,TREBOLES,PICAS,DIAMANTES};
    private final Palo palo;

    public CartaFrancesa(Palo p, int i){
        super(i);
        this.palo = p;
    }

    public void setValor(int nv){
        super.valor = nv;
    }

    // public void ocultar(){}       **Imagino que es una opcion grafica.


    public String getPaloString(){
        switch(palo){
            case CORAZONES:     return "Corazones";
            case TREBOLES:      return "Treboles";
            case PICAS:         return "Picas";
            case DIAMANTES: default:     return "Diamantes";
        }

    }

    public String getValorString(){
        switch ( valor ) {
            case 1:   return "As";
            case 2:   return "2";
            case 3:   return "3";
            case 4:   return "4";
            case 5:   return "5";
            case 6:   return "6";
            case 7:   return "7";
            case 8:   return "8";
            case 9:   return "9";
            case 10:   return "10";
            case 11:   return "Jota";
            case 12:   return "Reina";
            case 13:
            default:  return "Rey";
        }
    }

    @Override
    public String toString(){
        return getValorString() + "de" + getPaloString();
    }
}


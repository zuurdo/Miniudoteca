package Miniludoteca;

/**
 * Created by Raul on 1/2/17.
 */
public abstract class Baraja {
    public int usadas;
    public Carta [] baraja;

    public Baraja(){

    }

    public Carta[] getBaraja(){
        return baraja;
    }
    public int getUsadas(){
        return usadas;
    }

    public void setUsadas(int u){
        this.usadas = u;
    }

    public abstract void Mezclar ();

    public Carta proximaCarta(){
        Carta aux = null;
        if(this.usadas < baraja.length){
            int i = this.usadas;
            aux = baraja[i];
            this.usadas++;
        }else{
            throw new java.lang.IllegalStateException("No quedan cartas en la baraja");
        }
        return aux;
    }

    public boolean quedanCartas(){
        return this.baraja.length>0;
    }


}

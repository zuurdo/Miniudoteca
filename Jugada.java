package Miniludoteca;

/**
 * Created by Raul on 2/2/17.
 */
public class Jugada {
    protected Baraja baraja;
    protected int apuesta;
    protected Jugador jugador;

    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }
    public int getApuesta(){
        return apuesta;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setGanador(Jugador j){}

    public abstract void jugarBanca();

    public abstract void jugarJugador();

}

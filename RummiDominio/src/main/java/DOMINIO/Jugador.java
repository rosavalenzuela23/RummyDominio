
package DOMINIO;
import java.util.*;

/**
 * 
 */
public class Jugador {

    /**
     * Default constructor
     */
    public Jugador() {
    }

    /**
     * 
     */
    private Mazo mazo;

    /**
     * 
     */
    private boolean esPrimerTurno;

    /**
     * 
     */
    private ColorFicha fichasColor;

    /**
     * 
     */
    public void verificarCartasEnMazo() {
        // TODO implement here
    }

    /**
     * 
     */
    public void agregarFichaAMazo(Ficha ficha) {
        // TODO implement here
        this.mazo.agregarFichaAMazo(ficha);
    }

    /**
     * 
     */
    public void esPrimerTurno() {
        // TODO implement here
        this.cambiarEstadoJugador();
    }

    /**
     * 
     */
    public void cambiarEstadoJugador() {
        // TODO implement here
        this.esPrimerTurno = true;
        
    }

    public boolean isEsPrimerTurno() {
        return esPrimerTurno;
    }
    
}
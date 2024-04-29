
package DOMINIO;

import java.io.Serializable;

/**
 * 
 */
public class Jugador implements Serializable {

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

    public void verificarCartasEnMazo() {    
    }

    /**
     * 
     * @param ficha
     */
    public void agregarFichaAMazo(Ficha ficha) {
        this.mazo.agregarFichaAMazo(ficha);
    }

    /**
     * 
     */
    public boolean esPrimerTurno() {
        return true;
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

    public Mazo getMazo() {
        return mazo;
    }

    public void setMazo(Mazo mazo) {
        this.mazo = mazo;
    }
    
    
}
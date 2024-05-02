
package DOMINIO;

import interaces.LogicaJugador;
import java.io.Serializable;

/**
 * 
 */
public class Jugador implements Serializable, LogicaJugador {

    private boolean primerTurno = true;
    
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
     * @return regresa un boolean para saber si es el primer turno
     */
    @Override
    public boolean esPrimerTurno() {
        return this.primerTurno;
    }

    /**
     * 
     */
    public void cambiarEstadoJugador() {
        // TODO implement here
        this.esPrimerTurno = false;
        
    }

    public Mazo getMazo() {
        return mazo;
    }

    public void setMazo(Mazo mazo) {
        this.mazo = mazo;
    }
    
}
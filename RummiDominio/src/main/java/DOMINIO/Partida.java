
package DOMINIO;

import java.util.*;

/**
 * 
 */
public class Partida {

    /**
     * Default constructor
     */
    public Partida() {
    }

    /**
     * 
     */
    private Tablero tablero;

    /**
     * 
     */
    private Pila pila;

    /**
     * 
     */
    private List<Jugador> jugadores;

    /**
     * 
     */
    public void pasarTurno() {
        // TODO implement here
    }

    /**
     * 
     */
    public void verificaMovimientosHechos() {
        // TODO implement here
    }

    /**
     * 
     */
    public void terminarJuego() {
        // TODO implement here
    }

    /**
     * 
     */
    public void validarConfiguracion() {
        // TODO implement here
    }

    /**
     * 
     */
    public void validarFichasExistentesPozo() {
        // TODO implement here
       Jugador  jugador = this.jugadores.get(0);
       
       if(jugador.isEsPrimerTurno() == false){
           this.pila.validarFichasExistentesPozo(jugador);
       }else{
           this.terminarTurno();
       }
       
        
       
    }

    /**
     * 
     */
    public void terminarTurno() {
        // TODO implement here
        
    }

}
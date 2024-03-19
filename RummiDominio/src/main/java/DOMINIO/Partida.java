
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

    public void validarConjuntos(){
        Jugador jugador = this.jugadores.get(0);
        this.tablero.validarConjuntos(jugador);
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

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Pila getPila() {
        return pila;
    }

    public void setPila(Pila pila) {
        this.pila = pila;
    }

    
}
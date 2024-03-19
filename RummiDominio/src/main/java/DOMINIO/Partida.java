
package DOMINIO;

import exceptions.DominioException;
import java.util.List;

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
        this.tablero.validarConjuntos();
    }
    /**
     * 
     * @throws DominioException
     */
    public void validarFichasExistentesPozo() throws DominioException {
       Jugador  jugador = this.jugadores.get(0);
       if (jugador.isEsPrimerTurno() == false) {
           this.pila.validarFichasExistentesPozo(jugador);
       } else {
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

    @Override
    public String toString() {
        return "Partida{" + "tablero=" + tablero + ", pila=" + pila + ", jugadores=" + jugadores + '}';
    }
}
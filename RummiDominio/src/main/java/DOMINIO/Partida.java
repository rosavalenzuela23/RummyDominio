
package DOMINIO;

import exceptions.DominioException;
import java.util.List;

/**
 * 
 */
public class Partida {

    private static Partida instancia;
    private Tablero tablero;
    private Pila pila;
    private List<Jugador> jugadores;
    
    
    /**
     * Constructor privado
     */
    private Partida() {
        this.tablero = Tablero.obtenerInstancia();
        this.pila = Pila.obtenerInstancia();
    }
    
    /**
     * Método singlenton que obtine la instancia de la partida creada
     * @return la instancia de la Partida
     */
    public static Partida obtenerInstancia(){
        if(Partida.instancia == null){
            Partida.instancia =  new Partida();
        }
        
        return Partida.instancia;
    }
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
       
    }
    /**
     * 
     * @throws DominioException
     */
    public void validarFichasExistentesPozo() throws DominioException {
    }
      
    /**
     *Método que cambia el turno del jugador actual que se encuentra jugando. 
     */
    public void terminarTurno() {
                    
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

package DOMINIO;

import arqui.util.PartidaSnapshot;
import exceptions.DominioException;
import interaces.Blackboard;
import interaces.LogicaPartida;
import interaces.LogicaTablero;
import interaces.Observer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Partida implements Blackboard, LogicaPartida, Cloneable{

    private Observer subscriptor;
    private static Partida instancia;
    private Tablero tablero;
    private Pila pila;
    private List<Jugador> jugadores;
    private int numeroJugador;
    
    
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
     * Método para hacer una copia de la partida
     * @return
     * @throws CloneNotSupportedException 
     */
    @Override
     public Object clone() throws CloneNotSupportedException {
        Partida copia = (Partida) super.clone(); // Clonación superficial

        // Clonación profunda
        copia.tablero = (Tablero) this.tablero.clone(); 
        copia.pila = (Pila) this.pila.clone();
        copia.jugadores = new ArrayList<>(); 
        for (Jugador jugador : this.jugadores) {
            copia.jugadores.add((Jugador) jugador.clone());
        }

        return copia;
    }
     
    /**
     * Método para obtener el jugador actual de la partida
     * @return 
     */
    public Jugador obtenerJugador(){
        return jugadores.get(numeroJugador);
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
    
    @Override
    public void terminarJuego() {
        // TODO implement here
        System.out.println("El juego se ha terminado");
    }


    
    public void guardarPartida(){
        
       PartidaSnapshot.obtenerInstancia().guardarPartida(Partida.obtenerInstancia());
    }
    
    public void restuararPartida(){
        
        instancia = PartidaSnapshot.obtenerInstancia().restaurarPartida();
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
    @Override
    public void terminarTurno() {
        if(numeroJugador == jugadores.size() - 1){
            numeroJugador = 0;
        }else{
            numeroJugador =+ 1;
        }
        
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

    @Override
    public void actualizarDatos(LogicaTablero lt) {
        this.tablero = (Tablero) lt;
        this.update();
    }
    
    @Override
    public void actualizarMensajeError(String mensajeError) {
        System.out.println(mensajeError);
    }

    @Override
    public void actualizarDatos() {
        this.update();
    }
    
    @Override
    public void actualizarDatos(LogicaPartida lp) {
        
    }
    
    public void subscribir(Observer subscriptor) {
        this.subscriptor = subscriptor;
    }
    
    public void update(){
        this.subscriptor.notificar();
    }
    
}
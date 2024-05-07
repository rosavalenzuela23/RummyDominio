/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMINIO;

import exceptions.DominioException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Pila {

    private static Pila instancia;
    private List<Ficha> fichas;
    
    /**
     * Default constructor
     */
    private Pila() {
        this.fichas = new ArrayList<>();
    }
    
    /**
     * Método singleton que regresa la instancia de la pila en la partida
     * @return la instancia de la Pila
     */
    public static Pila obtenerInstancia(){
        if(Pila.instancia == null){
            Pila.instancia = new Pila();
        }
        return Pila.instancia;
    }

    /**
     * 
     */
    public void tomarFicha() {
        // TODO implement here
    }

    /**
     * 
     */
    public void pasarTurno() {
        // TODO implement here
    }
    /**
     * 
     * @param jugador
     * @throws DominioException
     */
    public void validarFichasExistentesPozo(Jugador jugador) throws DominioException {
        if (fichas == null || fichas.isEmpty()) {
            throw new DominioException("La lista de fichas está vacía o nula.");
        }
        System.out.println("La lista de fichas existe y no está vacía.");
        this.obtenerFicha(jugador);
    }    

    /**
     * 
     * @param jugador 
     */
    public void obtenerFicha(Jugador jugador) {
//        jugador.agregarFichaAMazo(this.fichas.getLast());
//        this.fichas.removeLast();
    }

    public List<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }
    
    

}
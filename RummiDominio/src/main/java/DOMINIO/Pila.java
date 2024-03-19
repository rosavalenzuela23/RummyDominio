/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMINIO;

import java.util.*;

/**
 * 
 */
public class Pila {

    /**
     * Default constructor
     */
    public Pila() {
    }

    /**
     * 
     */
    private List<Ficha> fichas;


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
     */
    public void validarFichasExistentesPozo(Jugador jugador) {
        // TODO implement here
         try {
            
            if (fichas == null || fichas.isEmpty()) {
                
                throw new RuntimeException("La lista de fichas está vacía o nula.");
            } else {
                
                System.out.println("La lista de fichas existe y no está vacía.");
                this.obtenerFicha(jugador);
            }
        } catch (Exception e) {
           
            System.out.println("Error: " + e.getMessage());
        }
    }

    

    /**
     * 
     * @return 
     */
    public void obtenerFicha(Jugador jugador) {
        
        jugador.agregarFichaAMazo(this.fichas.getLast());
        this.fichas.removeLast();
    }

}
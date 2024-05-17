/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMINIO;

import exceptions.PozoFichasInexistentesException;
import interaces.LogicaPila;
import interaces.PilaDTO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Pila implements Serializable, LogicaPila, PilaDTO, Cloneable {

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
     *
     * @return la instancia de la Pila
     */
    public static Pila obtenerInstancia() {
        if (Pila.instancia == null) {
            Pila.instancia = new Pila();
        }
        return Pila.instancia;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Pila copia = new Pila(); //Clonación superficial

        // Clonación profunda
        for (Ficha ficha : this.fichas) {
            Ficha fichaClonada = (Ficha) ficha.clone();
            copia.fichas.add(fichaClonada);
        }
        return copia;
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
     */
    @Override
    public boolean validarFichasExistentesPozo() throws PozoFichasInexistentesException {
        if (fichas == null || fichas.isEmpty()) {
            throw new PozoFichasInexistentesException("La lista de fichas está vacía o nula.");
        }
        System.out.println("La lista de fichas existe y no está vacía.");
        return true;
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

    /**
     * Obtiene la ultima ficha de la lista de fichas.
     *
     * @return
     */
    @Override
    public Ficha obtenerFicha() {
        return fichas.removeLast();
    }

}

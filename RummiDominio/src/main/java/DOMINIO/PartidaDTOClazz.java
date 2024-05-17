/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMINIO;

import interaces.PilaDTO;
import interaces.TableroDTO;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author natsu
 */
public class PartidaDTOClazz implements Serializable {

    public TableroDTO tablero;
    public PilaDTO pila;
    public List<Jugador> jugadores;

    public PartidaDTOClazz(Partida partida) {

        this.pila = (PilaDTO) partida.getPila();

        this.jugadores = partida.getJugadores();

        this.tablero = partida.getTablero();

    }

    public TableroDTO getTablero() {
        return tablero;
    }

    public void setTablero(TableroDTO tablero) {
        this.tablero = tablero;
    }

    public PilaDTO getPila() {
        return pila;
    }

    public void setPila(PilaDTO pila) {
        this.pila = pila;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

}

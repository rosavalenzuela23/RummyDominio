package DOMINIO;

import interaces.JugadorDTO;
import interaces.LogicaJugador;
import java.io.Serializable;

/**
 *
 */
public class Jugador implements LogicaJugador, Cloneable, Serializable, JugadorDTO {

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
    private boolean esPrimerTurno = true;

    /**
     *
     */
    private ColorFicha fichasColor;

    /**
     * Método para hacer una copia de los jugadores
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Jugador copia = (Jugador) super.clone(); //Clonación superficial

        //Clonación profunda
        copia.mazo = (Mazo) this.mazo.clone();

        return copia;
    }

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
        return this.esPrimerTurno;
    }

    public boolean tieneFichas() {
        return this.mazo.getFichas().isEmpty();
    }

    /**
     *
     */
    public void cambiarEstadoJugador() {
        // TODO implement here
        this.esPrimerTurno = false;

    }

    @Override
    public Mazo getMazo() {
        return mazo;
    }

    @Override
    public void setMazo(Mazo mazo) {
        this.mazo = mazo;
    }

    public void setTurno(boolean estado) {
        this.esPrimerTurno = estado;
    }

    @Override
    public boolean isEsPrimerTurno() {
        return esPrimerTurno;
    }

    @Override
    public void setEsPrimerTurno(boolean esPrimerTurno) {
        this.esPrimerTurno = esPrimerTurno;
    }

    @Override
    public ColorFicha getFichasColor() {
        return fichasColor;
    }

    @Override
    public void setFichasColor(ColorFicha fichasColor) {
        this.fichasColor = fichasColor;
    }

}

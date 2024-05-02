
package DOMINIO;

import interaces.LogicaMazo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Mazo implements Serializable, LogicaMazo {

    /**
     * 
     */
    private List<Ficha> fichas;
    
    /**
     * Default constructor
     */
    public Mazo() {
        this.fichas = new ArrayList<>();
    }

    public void tieneFichas() {
        // TODO implement here
    }

    /**
     * 
     * @param ficha la ficha que se va a eliminar del mazo
     */
    public void agregarFichaAMazo(Ficha ficha) {
        this.fichas.add(ficha);
    }

    public List<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }

    @Override
    public String toString() {
        return "Mazo{" + "fichas=" + fichas + '}';
    }

    @Override
    public void eliminarFichasJugador(Ficha ficha) {
        fichas.remove(ficha);
    }
    
}
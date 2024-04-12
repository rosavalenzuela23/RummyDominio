
package DOMINIO;

import java.util.*;

/**
 * 
 */
public class Mazo {

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
}
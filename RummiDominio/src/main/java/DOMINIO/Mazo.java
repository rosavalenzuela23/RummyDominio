
package DOMINIO;

import java.util.*;

/**
 * 
 */
public class Mazo {

    /**
     * Default constructor
     */
    public Mazo() {
        this.fichas = new ArrayList<>();
    }

    /**
     * 
     */
    private List<Ficha> fichas;

    /**
     * 
     */
    public void tieneFichas() {
        // TODO implement here
    }

    /**
     * 
     */
    public void agregarFichaAMazo(Ficha ficha) {
        // TODO implement here
        this.fichas.add(ficha);
    }

    public List<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }

    
}
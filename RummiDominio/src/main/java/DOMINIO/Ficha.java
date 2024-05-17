package DOMINIO;

import java.io.Serializable;

/**
 *
 */
public class Ficha implements Cloneable, Serializable {

    /**
     * Default constructor
     */
    public Ficha() {
    }

    /**
     * Método para hacer una copia de las fichas
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

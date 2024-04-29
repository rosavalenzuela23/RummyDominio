
package DOMINIO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Tablero implements Serializable {

    private static Tablero instancia;
    private List<Conjunto> conjuntos;
    
    /**
     * Default constructor
     */
    private Tablero() {
        this.conjuntos = new ArrayList<>();
    }

    /**
     * Método singlenton que regresa la instancia del tablero
     * @return el tablero instanciado 
     */
    public static Tablero obtenerInstancia(){
        if(Tablero.instancia == null){
            Tablero.instancia = new Tablero();
        }
        return Tablero.instancia;
    }
    
    /**
     * 
     */
    public void realizarMovimiento() {
        // TODO implement here    
    }

    /**
     * 
     */
    public void verificarMovimientosCorrectos() {
        // TODO implement here
    }
    
    /**
     * 
     */
    public void validarConjuntos() {
        // TODO implement here
        
    }
}
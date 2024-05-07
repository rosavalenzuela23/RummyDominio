
package DOMINIO;

import interaces.LogicaConjunto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import interaces.LogicaTablero;

/**
 * 
 */
public class Tablero implements Serializable, LogicaTablero{

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
     * @return 
     */
    @Override
    public List<Conjunto> validarConjuntos() {
        
        for (LogicaConjunto conjunto : obtenerLogicasConjuntos()) {
            conjunto.validarConjunto();
        }
        return this.conjuntos;
    }

    private List<LogicaConjunto> obtenerLogicasConjuntos(){
        
        List<LogicaConjunto> lc = new ArrayList<>();
        for (LogicaConjunto logicaConjunto : this.conjuntos) {
            lc.add(logicaConjunto);
        }
     
        return lc;
    }
    
    @Override
    public void eliminarConjunto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void desmarcarConjuntos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
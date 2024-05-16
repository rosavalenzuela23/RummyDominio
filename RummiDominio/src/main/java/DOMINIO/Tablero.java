
package DOMINIO;

import exceptions.ConjuntoNoValidoException;
import exceptions.PuntosNoValidosException;
import interaces.LogicaConjunto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import interaces.LogicaTablero;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 */
public class Tablero implements Serializable, LogicaTablero, Cloneable{

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
     * Método para hacer una copia del tablero
     * @return
     * @throws CloneNotSupportedException 
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Tablero copia = new Tablero(); //Clonación superficial
        
        //Clonación profunda
        for (Conjunto conjunto : this.conjuntos) {
            copia.conjuntos.add((Conjunto) conjunto.clone());
        }
        return copia;
    }
    
    public void setConjuntos(List<Conjunto> conjuntos){
        this.conjuntos = conjuntos;
    }
    
    public List<Conjunto> getConjuntos(){
        return this.conjuntos;
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
     * @throws exceptions.ConjuntoNoValidoException 
     */
    @Override
    public List<Conjunto> validarConjuntos() throws ConjuntoNoValidoException {
        
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
        List<LogicaConjunto> conjuntosMarcados = new ArrayList<>();
        for (LogicaConjunto conjuntoMarcado : obtenerConjuntosMarcados()) {
            conjuntoMarcado.desmarcarConjunto();
        }
    }

    private List<Conjunto> obtenerConjuntosMarcados() {
        List<Conjunto> conjuntosMarcados = new ArrayList<>();
        for (Conjunto conjunto : conjuntos) {
            if(!conjunto.isMarcado()){
                conjuntosMarcados.add(conjunto);
            }
        }
        return conjuntosMarcados;
    }

    @Override
    public boolean validar30Puntos() throws PuntosNoValidosException{
       
       List<LogicaConjunto> lcLista = new ArrayList<>();
        for (LogicaConjunto logicaConjunto : obtenerConjuntosMarcados()) {
            logicaConjunto.validar30Puntos();
        }
       return true;
    }
}
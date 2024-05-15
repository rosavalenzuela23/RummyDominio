
package DOMINIO;

import interaces.LogicaConjunto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import interaces.LogicaTablero;

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
        for (LogicaConjunto logicaConjunto : obtenerConjuntosMarcados()) {
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
        System.out.println("estan desmarcados los conjuntos");
    }

    private List<Conjunto> obtenerConjuntosMarcados() {
        List<Conjunto> conjuntosMarcados = new ArrayList<>();
        for (Conjunto conjunto : conjuntos) {
            if(conjunto.isMarcado()){
                conjuntosMarcados.add(conjunto);
            }
        }
        return conjuntosMarcados;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMINIO;

import interaces.LogicaConjunto;
import java.io.Serializable;
import java.util.List;

/**
 * 
 */
public abstract class Conjunto implements Serializable, LogicaConjunto{

    /**
     * Default constructor
     */
    public Conjunto() {
    }

    /**
     * 
     */
    private List<Ficha> fichas;

    public List<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }
    
    /**
     * Método que valida sí el conjunto es igual o mayor de 30 puntos en la sumatoria de las fichas
     * @return true en caso de completar 30 puntos o más, false caso contrario
     */
    public boolean validar30Puntos(){
        return true;
    }
    
    /**
     * Método abstracto validarConjuntos() el cual es implementado por la clase ConjuntoGrupo o ConjuntoSecuencia
     * @return return true en caso de ser valido el conjunto, return false caso contrario 
     */
    public abstract boolean validarConjunto();

    @Override
    public void verificarColoresFicha() {

    }

    @Override
    public void agregarFicha() {

    }

    @Override
    public void verificarColorFicha() {

    }

}
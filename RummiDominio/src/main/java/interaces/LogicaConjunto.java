/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interaces;

import DOMINIO.Conjunto;
import java.util.List;
import exceptions.ConjuntoNoValidoException;
import exceptions.PuntosNoValidosException;
/**
 *
 * @author natsu
 */
public interface LogicaConjunto {

    public Conjunto verificarColoresFicha();

    public void agregarFicha();

    public Conjunto verificarColorFicha();

    public boolean validarConjunto() throws ConjuntoNoValidoException;

    public boolean validar30Puntos() throws PuntosNoValidosException;
    
    public void desmarcarConjunto();

}

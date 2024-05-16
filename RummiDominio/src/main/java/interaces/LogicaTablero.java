/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interaces;

import DOMINIO.Conjunto;
import exceptions.ConjuntoNoValidoException;
import exceptions.PuntosNoValidosException;
import java.util.List;

/**
 *
 * @author natsu
 */
public interface LogicaTablero {

    public void eliminarConjunto(Conjunto cojunto);

    public List<Conjunto> validarConjuntos() throws ConjuntoNoValidoException;

    public void desmarcarConjuntos();

    public boolean validar30Puntos() throws PuntosNoValidosException;
}

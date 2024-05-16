/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interaces;

import DOMINIO.Conjunto;
import DOMINIO.Ficha;
import java.util.Map;
import java.util.List;
import exceptions.ConjuntoNoValidoException;
import exceptions.PuntosNoValidosException;

/**
 *
 * @author natsu
 */
public interface LogicaConjunto {

    public Conjunto agregarFicha(Ficha ficha, boolean delante);

    public Conjunto verificarColorFicha();

    public boolean validarConjunto() throws ConjuntoNoValidoException;

    public boolean validar30Puntos() throws PuntosNoValidosException;

    public void desmarcarConjunto();

    public List<List<Ficha>> dividir(Map<String, Integer> periodo);

}

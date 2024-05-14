/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interaces;

import DOMINIO.Conjunto;

/**
 *
 * @author natsu
 */
public interface LogicaConjunto {

    public Conjunto verificarColoresFicha();

    public void agregarFicha();

    public Conjunto verificarColorFicha();

    public boolean validarConjunto();

    public boolean validar30Puntos();

}

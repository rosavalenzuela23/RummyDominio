/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arqui.util;

import DOMINIO.Conjunto;

/**
 *
 * @author natsu
 */
public class DividirConjuntoDatos {

    private Conjunto conjunto;
    private int[] rango;

    public DividirConjuntoDatos() {
    }

    public DividirConjuntoDatos(Conjunto c, int[] rango) {
        this.conjunto = c;
        this.rango = rango;
    }

    public Conjunto getConjunto() {
        return conjunto;
    }

    public void setConjunto(Conjunto conjunto) {
        this.conjunto = conjunto;
    }

    public int[] getRango() {
        return rango;
    }

    public void setRango(int[] rango) {
        this.rango = rango;
    }

}

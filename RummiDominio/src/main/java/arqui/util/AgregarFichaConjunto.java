/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arqui.util;

import DOMINIO.Conjunto;
import DOMINIO.Ficha;

/**
 *
 * @author natsu
 */
public class AgregarFichaConjunto {

    private Ficha ficha;
    private Conjunto conjunto;
    private boolean delante;

    public AgregarFichaConjunto() {
    }

    public AgregarFichaConjunto(Ficha ficha, Conjunto conjunto, boolean delante) {
        this.ficha = ficha;
        this.conjunto = conjunto;
        this.delante = delante;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public Conjunto getConjunto() {
        return conjunto;
    }

    public void setConjunto(Conjunto conjunto) {
        this.conjunto = conjunto;
    }

    public boolean isDelante() {
        return delante;
    }

    public void setDelante(boolean delante) {
        this.delante = delante;
    }

}

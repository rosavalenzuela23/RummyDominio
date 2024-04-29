/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMINIO;

import java.awt.Color;
import java.io.Serializable;

/**
 * 
 */
public class ColorFicha implements Serializable {

    private GrupoFicha grupoFicha;
    private Color color;
    
    /**
     * Default constructor
     */
    public ColorFicha() {
    }

    public GrupoFicha getGrupoFicha() {
        return grupoFicha;
    }

    public void setGrupoFicha(GrupoFicha grupoFicha) {
        this.grupoFicha = grupoFicha;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorFicha{" + "grupoFicha=" + grupoFicha + ", color=" + color + '}';
    }
}

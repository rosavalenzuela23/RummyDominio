/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arqui.util;

import java.io.Serializable;

/**
 *
 * @author natsu
 * @param <T>
 */
public class Datos<T> implements Serializable {

    private T datos;
    private String mensaje;

    public Datos() {
    }

    public Datos(T datos, String mensaje) {
        this.datos = datos;
        this.mensaje = mensaje;
    }

    public void setDatos(T d) {
        this.datos = d;
    }

    public T getDatos() {
        return this.datos;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}

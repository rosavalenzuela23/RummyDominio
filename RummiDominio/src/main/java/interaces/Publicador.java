/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interaces;

/**
 *
 * @author natsu
 */
public interface Publicador {

    public void agregarObservador(Observador observador);

    public void notificar();

}

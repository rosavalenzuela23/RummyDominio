/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interaces;

/**
 *
 * @author natsu
 */
public interface Blackboard {
    
    public void actualizarDatos();
    public void actualizarDatos(LogicaTablero lt);
    public void actualizarMensajeError(String mensajeError);
    
}

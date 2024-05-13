
package interaces;

/**
 *
 * @author natsu
 */
public interface Blackboard {
    
    public void actualizarDatos();
    public void actualizarDatos(LogicaTablero lt);
    public void actualizarMensajeError(String mensajeError);
    public void actualizarDatos(LogicaPartida lp);
    
}

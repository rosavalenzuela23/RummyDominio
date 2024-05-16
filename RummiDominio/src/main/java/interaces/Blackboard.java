package interaces;

import DOMINIO.Conjunto;

/**
 *
 * @author natsu
 */
public interface Blackboard {

    public void actualizarDatos();

    public void actualizarDatos(LogicaTablero lt);

    public void actualizarMensajeError(String mensajeError);

    public void actualizarDatos(LogicaPartida lp);

    public void actualizarDatos(String s);

    public void actualizarDatos(Conjunto conjunto, String sig);

    public String obtenerMensaje();

    public LogicaMazo obtenerLogicaMazoJugadorActual();

    public LogicaJugador obtenerLogicaJugadorActual();

    public LogicaTablero obtenerLogicaTablero();

    public String obtenerMensajeError();

    public boolean hayMensajeError();

}


package arqui.util;
import DOMINIO.Partida;
/**
 *
 * @author 
 */
public class PartidaSnapshot {
    
    private static PartidaSnapshot instancia; 

    private Partida partidaCopia;

   
    private PartidaSnapshot() {
        this.partidaCopia = null; 
    }

  
    public static PartidaSnapshot obtenerInstancia() {
        if (instancia == null) {
            instancia = new PartidaSnapshot(); 
        }
        return instancia;
    }
    
    public void  guardarPartida(Partida partida) {
        try {
            this.partidaCopia = (Partida) partida.clone(); 
        } catch (CloneNotSupportedException e) {
            // Manejar la excepción si ocurre
            e.printStackTrace(); // Opcional: imprimir el error
            
        }
    }
    
    public Partida restaurarPartida(){
        
        return this.partidaCopia;
    }
}
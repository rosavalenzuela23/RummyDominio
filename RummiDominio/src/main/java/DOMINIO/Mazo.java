
package DOMINIO;

import interaces.LogicaMazo;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Mazo implements LogicaMazo, Cloneable {

    /**
     * 
     */
    private List<Ficha> fichas;
    
    /**
     * Default constructor
     */
    public Mazo() {
        this.fichas = new ArrayList<>();
    }

     @Override
    public Object clone() throws CloneNotSupportedException {
        Mazo copia = (Mazo) super.clone(); // Clonación superficial

        // Clonación profunda
        copia.fichas = new ArrayList<>(); //Lista para guardar las fichas clonadas
        for (Ficha ficha : this.fichas) {
            Ficha fichaClonada = (Ficha) ficha.clone(); //Clonar la ficha
            copia.fichas.add(fichaClonada); 
        }

        return copia;
    }
    
    /**
     * Método que comprueba sí el mazo del jugador tiene fichas
     * @return true si tiene fichas, false caso contrario
     */
    public boolean tieneFichas() {
        // TODO implement here
        return !this.fichas.isEmpty();
    }

    /**
     * 
     * @param ficha la ficha que se va a eliminar del mazo
     */
    public void agregarFichaAMazo(Ficha ficha) {
        this.fichas.add(ficha);
    }

    public List<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }

    @Override
    public String toString() {
        return "Mazo{" + "fichas=" + fichas + '}';
    }

    @Override
    public void eliminarFichasJugador(Ficha ficha) {
        fichas.remove(ficha);
    }
    
}

package DOMINIO;

/**
 * 
 */
public class ConjuntoSecuencia extends Conjunto{

    /**
     * Default constructor
     */
    public ConjuntoSecuencia() {
        super();
    }

    /**
     * Método verificarBienArmado() el cual contiene la lógica para veirifcar que el conjunto de tipo
     * secuencia, no esta vacío, contiene 3 fichas o más, o es una secuencia de fichas correcta
     * @return true esta bien armado, false caso contrario
     */
    public boolean verificarBienArmado() {
        return true;
        
    }

    /**
     * Método validarConjuntos() que verifica si la secuencia de fichas es válido
     * @return true es válido, false caso contrario
     */
    @Override
    public boolean validarConjunto() {
        return true;
       
    }

}
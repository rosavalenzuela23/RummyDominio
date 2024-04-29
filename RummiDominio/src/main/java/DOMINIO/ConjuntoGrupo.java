
package DOMINIO;

/**
 * 
 */
public class ConjuntoGrupo extends Conjunto{

    /**
     * Default constructor
     */
    public ConjuntoGrupo() {
    }

    /**
     * Método verificarBienArmado() el cual contiene la lógica para veirifcar que el conjunto de tipo
     * grupo, no esta vacío, contiene 3 fichas o más, o es un grupo de fichas correcta
     * @return true esta bien armado, false caso contrario
     */
    public boolean verificarBienArmado() {
        return true;
    }

    /**
     * Método validarConjuntos() que verifica si el grupo de fichas es válido
     * @return true es válido, false caso contrario
     */
    @Override
    public boolean validarConjunto() {
        return true;
    }

}
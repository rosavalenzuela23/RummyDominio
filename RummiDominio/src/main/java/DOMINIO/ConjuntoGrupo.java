package DOMINIO;
import exceptions.ConjuntoNoValidoException;
import java.util.List;

/**
 *
 */
public class ConjuntoGrupo extends Conjunto implements Cloneable {

    /**
     * Default constructor
     */
    public ConjuntoGrupo() {
        super();
    }

    public ConjuntoGrupo(Conjunto conjunto) {
        super(conjunto);
    }

    public ConjuntoGrupo(List<Ficha> fichas) {
        super(fichas);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ConjuntoGrupo clonado = (ConjuntoGrupo) super.clone();

        return clonado;
    }

    /**
     * Método verificarBienArmado() el cual contiene la lógica para veirifcar
     * que el conjunto de tipo grupo, no esta vacío, contiene 3 fichas o más, o
     * es un grupo de fichas correcta
     *
     * @return true esta bien armado, false caso contrario
     */
    public boolean verificarBienArmado() {
        return true;
    }

    /**
     * Método validarConjuntos() que verifica si el grupo de fichas es válido
     *
     * @param conjunto el conjutno a validar sí esta bien armado
     * @return true es válido, false caso contrario
     */
    @Override
    public boolean validarConjunto() throws ConjuntoNoValidoException{
        List<Ficha> fichas = super.getFichas();

        //El conjunto esta vacío o el conjunto es de un size menor al permitido
        if (fichas.isEmpty() || fichas.size() < 2) {
            throw new ConjuntoNoValidoException("conjunto no valido");
        }

        int valorActual = 0;
        int valorSiguiente = 0;

        //Veirificación en caso de que la primera ficha sea númerica o sea comodin
        if (fichas.get(0) instanceof FichaNumerica) {

            valorActual = ((FichaNumerica) fichas.get(0)).getNumero();

        } else if (fichas.get(0) instanceof Comodin) {

            valorActual = ((FichaNumerica) fichas.get(1)).getNumero();

        }

        //Verificación en caso de que alguna ficha sea comodín o sea númerica
        for (int i = 1; i < fichas.size(); i++) {

            if (fichas.get(i) instanceof FichaNumerica) {

                valorSiguiente = ((FichaNumerica) fichas.get(i)).getNumero();

            } else if (fichas.get(i) instanceof Comodin) {
                valorSiguiente = valorActual;
            }

            if (valorSiguiente != valorActual) {

                throw new ConjuntoNoValidoException("conjunto no valido");
            }

            valorActual = valorSiguiente; // Mover el valor actual al siguiente número
        }

        return true;

    }

}

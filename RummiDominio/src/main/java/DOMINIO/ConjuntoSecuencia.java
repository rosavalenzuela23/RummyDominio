package DOMINIO;

import java.util.List;

/**
 *
 */
public class ConjuntoSecuencia extends Conjunto {

    /**
     * Default constructor
     */
    public ConjuntoSecuencia() {
        super();
    }

    public ConjuntoSecuencia(Conjunto conjunto) {
        super(conjunto);
    }

    public ConjuntoSecuencia(List<Ficha> fichas) {
        super(fichas);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ConjuntoSecuencia clonado = (ConjuntoSecuencia) super.clone();

        return clonado;
    }

    /**
     * Método verificarBienArmado() el cual contiene la lógica para veirifcar
     * que el conjunto de tipo secuencia, no esta vacío, contiene 3 fichas o
     * más, o es una secuencia de fichas correcta
     *
     * @return true esta bien armado, false caso contrario
     */
    public boolean verificarBienArmado() {
        return true;

    }

    /**
     * Método validarConjuntos() que verifica si la secuencia de fichas es
     * válido
     *
     * @return true es válido, false caso contrario
     */
    @Override
    public boolean validarConjunto() {

        List<Ficha> fichas = super.getFichas();

        //El conjutno esta vacío o el conjunto es de un size menor al permitido
        if (fichas.isEmpty() || fichas.size() < 2) {
            return false;
        }

        int valorActual = 0;
        int valorSiguiente = 0;

        //Veirificación en caso de que la primera ficha sea númerica o sea comodin
        if (fichas.get(0) instanceof FichaNumerica) {

            valorActual = ((FichaNumerica) fichas.get(0)).getNumero();

        } else if (fichas.get(0) instanceof Comodin) {

            valorActual = ((FichaNumerica) fichas.get(1)).getNumero() - 1;

        }

        //Verificación en caso de que alguna ficha sea comodín o sea númerica
        for (int i = 1; i < fichas.size(); i++) {

            if (fichas.get(i) instanceof FichaNumerica) {

                valorSiguiente = ((FichaNumerica) fichas.get(i)).getNumero();

            } else if (fichas.get(i) instanceof Comodin) {
                valorSiguiente = valorActual + 1;
            }

            if (valorSiguiente != valorActual + 1) {

                return false;
            }

            valorActual = valorSiguiente; // Mover el valor actual al siguiente número
        }

        return true;

    }

}

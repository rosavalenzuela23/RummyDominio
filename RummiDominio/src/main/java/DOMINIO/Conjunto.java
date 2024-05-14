/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMINIO;

import interaces.ConjuntoDTO;
import interaces.LogicaConjunto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public abstract class Conjunto implements LogicaConjunto, ConjuntoDTO {

    /**
     * Default constructor
     */
    public Conjunto() {
    }

    public Conjunto(Conjunto conjunto) {
        this.fichas = conjunto.getFichas();
    }

    public Conjunto(List<Ficha> fichas) {
        this.fichas = fichas;
    }

    /**
     *
     */
    private List<Ficha> fichas;

    /**
     * Método para hacer una copia del conjunto
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        Conjunto conjuntoClonado = (Conjunto) super.clone(); //Clonación superficial

        // Clonación profunda
        conjuntoClonado.fichas = new ArrayList<>(); //Lista para guardar las fichas clonadas
        for (Ficha ficha : this.fichas) {
            Ficha fichaClonada = (Ficha) ficha.clone(); // Clonar la ficha
            conjuntoClonado.fichas.add(fichaClonada);
        }

        return conjuntoClonado;
    }

    @Override
    public List<Ficha> getFichas() {
        return fichas;
    }

    @Override
    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }

    /**
     * Método que valida sí el conjunto es igual o mayor de 30 puntos en la
     * sumatoria de las fichas
     *
     * @return true en caso de completar 30 puntos o más, false caso contrario
     */
    @Override
    public boolean validar30Puntos() {
        return true;
    }

    /**
     * Método abstracto validarConjuntos() el cual es implementado por la clase
     * ConjuntoGrupo o ConjuntoSecuencia
     *
     * @param conjunto El conjunto a validar si esta bien armado
     * @return return true en caso de ser valido el conjunto, return false caso
     * contrario
     */
    @Override
    public abstract boolean validarConjunto();

    @Override
    public Conjunto verificarColoresFicha() {
        return null;
    }

    @Override
    public void agregarFicha() {

    }

    @Override
    public Conjunto verificarColorFicha() {

        FichaNumerica fichaAnterior = null;
        for (Ficha ficha : fichas) {

            if (ficha.getClass() != FichaNumerica.class) {
                continue;
            }

            if (fichaAnterior == null) {
                fichaAnterior = (FichaNumerica) ficha;
                continue;
            }

            FichaNumerica numerica = (FichaNumerica) ficha;
            if (!numerica.getGrupoFicha().equals(fichaAnterior.getGrupoFicha())) {
                return new ConjuntoGrupo(this);
            }

        }

        return new ConjuntoSecuencia(this);
    }

}

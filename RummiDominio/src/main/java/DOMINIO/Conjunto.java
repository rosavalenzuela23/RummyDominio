/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMINIO;

import interaces.ConjuntoDTO;
import interaces.LogicaConjunto;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import exceptions.ConjuntoNoValidoException;
import exceptions.PuntosNoValidosException;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 */
public abstract class Conjunto implements LogicaConjunto, ConjuntoDTO, Serializable {

    private List<Ficha> fichas;
    private boolean marcado;

    /**
     * Default constructor
     */
    public Conjunto() {
        this.marcado = true;
    }

    public Conjunto(Conjunto conjunto) {
        this();
        this.fichas = new ArrayList(conjunto.getFichas());
    }

    public Conjunto(List<Ficha> fichas) {
        this();
        this.fichas = new ArrayList(fichas);
    }

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

    public boolean isMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }

    /**
     * Método que valida sí el conjunto es igual o mayor de 30 puntos en la
     * sumatoria de las fichas
     *
     * @return true en caso de completar 30 puntos o más, false caso contrario
     * @throws exceptions.PuntosNoValidosException
     */
    @Override
    public boolean validar30Puntos() throws PuntosNoValidosException {
        int sumaPuntos = 0;

        for (Ficha ficha : fichas) {
            if (ficha instanceof FichaNumerica) {
                FichaNumerica fichaNumerica = (FichaNumerica) ficha;
                sumaPuntos += fichaNumerica.getNumero();
            }
        }

        boolean puntosValidos = sumaPuntos >= 30;

        if (!puntosValidos) {
            throw new PuntosNoValidosException("puntos no validos");
        }

        return puntosValidos;
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
    public abstract boolean validarConjunto() throws ConjuntoNoValidoException;

    @Override
    public Conjunto agregarFicha(Ficha ficha, boolean delante) {

        if (delante) {
            fichas.addFirst(ficha);
        } else {
            fichas.addLast(ficha);
        }

        return this.verificarColorFicha();
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

    @Override
    public void desmarcarConjunto() {
        this.marcado = false;
    }

    @Override
    public List<List<Ficha>> dividir(Map<String, Integer> periodo) {
        int inicio = periodo.get("inicio");
        int termino = periodo.get("final");
        List<List<Ficha>> conjuntos = new LinkedList();

        List<Ficha> conjunto1 = new ArrayList(), conjunto2 = new ArrayList();

        for (int i = 0; i < this.fichas.size(); i++) {

            if (i >= inicio && i < termino) {
                conjunto1.add(this.fichas.get(i));
            } else {
                conjunto2.add(this.fichas.get(i));
            }

        }

        conjuntos.add(conjunto1);
        conjuntos.add(conjunto2);

        return conjuntos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.fichas);
        hash = 43 * hash + (this.marcado ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        final Conjunto other = (Conjunto) obj;
        if (this.marcado != other.marcado) {
            return false;
        }
        return Objects.equals(this.fichas, other.fichas);
    }

}

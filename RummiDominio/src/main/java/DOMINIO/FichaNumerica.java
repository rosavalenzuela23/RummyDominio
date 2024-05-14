package DOMINIO;

import interaces.FichaDTO;
import java.util.Objects;

/**
 *
 */
public class FichaNumerica extends Ficha implements FichaDTO {

    /**
     * Default constructor
     */
    public FichaNumerica() {
    }

    /**
     *
     */
    private byte numero;

    /**
     *
     */
    private GrupoFicha grupoFicha;

    public FichaNumerica(byte numero) {
        super();
        this.numero = numero;
    }

    @Override
    public byte getNumero() {
        return numero;
    }

    @Override
    public void setNumero(byte numero) {
        this.numero = numero;
    }

    @Override
    public GrupoFicha getGrupoFicha() {
        return grupoFicha;
    }

    @Override
    public void setGrupoFicha(GrupoFicha grupoFicha) {
        this.grupoFicha = grupoFicha;
    }

    @Override
    public String toString() {
        return "FichaNumerica{" + "numero=" + numero + ", grupoFicha=" + grupoFicha + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.numero;
        hash = 19 * hash + Objects.hashCode(this.grupoFicha);
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FichaNumerica other = (FichaNumerica) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.grupoFicha == other.grupoFicha;
    }

}

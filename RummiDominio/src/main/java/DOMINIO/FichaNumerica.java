
package DOMINIO;

/**
 * 
 */
public class FichaNumerica extends Ficha {

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

    public byte getNumero() {
        return numero;
    }

    public void setNumero(byte numero) {
        this.numero = numero;
    }

    public GrupoFicha getGrupoFicha() {
        return grupoFicha;
    }

    public void setGrupoFicha(GrupoFicha grupoFicha) {
        this.grupoFicha = grupoFicha;
    }

    @Override
    public String toString() {
        return "FichaNumerica{" + "numero=" + numero + ", grupoFicha=" + grupoFicha + '}';
    }
}

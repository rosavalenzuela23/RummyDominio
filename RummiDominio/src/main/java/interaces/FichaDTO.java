/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interaces;

import DOMINIO.GrupoFicha;

/**
 *
 * @author natsu
 */
public interface FichaDTO {

    public byte getNumero();

    public void setNumero(byte numero);

    public GrupoFicha getGrupoFicha();

    public void setGrupoFicha(GrupoFicha grupoFicha);

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interaces;

import DOMINIO.ColorFicha;
import DOMINIO.Mazo;

/**
 *
 * @author natsu
 */
public interface JugadorDTO {

    public Mazo getMazo();

    public void setMazo(Mazo mazo);

    public boolean isEsPrimerTurno();

    public void setEsPrimerTurno(boolean esPrimerTurno);

    public ColorFicha getFichasColor();

    public void setFichasColor(ColorFicha fichasColor);

}

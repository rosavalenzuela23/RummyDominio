/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.arqui.rummidominio;
import DOMINIO.Partida;
import DOMINIO.Jugador;
import DOMINIO.*;
import exceptions.DominioException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author natsu
 */
public class RummiDominio {

    public static void main(String[] args) {
        
//        Pila pila = new Pila();
//        FichaNumerica ficha1 = new FichaNumerica();
//        byte numero1 = 18;
//        ficha1.setNumero(numero1);
//        FichaNumerica ficha2 = new FichaNumerica();
//        byte numero2 = 23;
//        ficha2.setNumero(numero2);
//        FichaNumerica ficha3 = new FichaNumerica();
//        byte numero3 = 30;
//        ficha3.setNumero(numero3);
//        
//        List<Ficha> fichasPila = new ArrayList<>();
//        fichasPila.add(ficha1);
//        fichasPila.add(ficha2);
//        fichasPila.add(ficha3);
//        
//        pila.setFichas(fichasPila);
//        
//        Partida partidaPrueba = new Partida();
//        Jugador jugador1 = new Jugador();
//        Jugador jugador2 = new Jugador();
//        Jugador jugador3 = new Jugador();
//        Jugador jugador4 = new Jugador();
//        
//        List<Jugador> jugadores = new ArrayList<>();
//        
//        jugadores.add(jugador1);
//        jugadores.add(jugador2);
//        jugadores.add(jugador3);
//        jugadores.add(jugador4);
//        partidaPrueba.setJugadores(jugadores);
//        partidaPrueba.setPila(pila);
//        
//        Mazo mazoParaJugador1 = new Mazo();
//        jugador1.setMazo(mazoParaJugador1);
//        try {
//            partidaPrueba.validarFichasExistentesPozo();
//        } catch (DominioException ex) {
//            Logger.getLogger(RummiDominio.class.getName()).log(Level.SEVERE, null, ex);
//        }
        FichaNumerica fichanumerica1 = new FichaNumerica();
        fichanumerica1.setNumero((byte)4);
        FichaNumerica fichanumerica2 = new FichaNumerica();
        fichanumerica2.setNumero((byte)9);
        Comodin fichaComodin= new Comodin();
        FichaNumerica fichanumerica3 = new FichaNumerica();
        fichanumerica3.setNumero((byte)4);
        
        List<Ficha> fichas = new ArrayList<>();
        
        fichas.add(fichanumerica1);
        fichas.add(fichanumerica2);
        fichas.add(fichaComodin);
        fichas.add(fichanumerica3);
        
        Conjunto conjuntoPrueba = new ConjuntoGrupo();
        
        conjuntoPrueba.setFichas(fichas);
        
//        conjuntoPrueba.validarConjunto();
        
    }
}

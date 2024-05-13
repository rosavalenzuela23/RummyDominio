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
        
//        FichaNumerica fichanumerica1 = new FichaNumerica();
//        fichanumerica1.setNumero((byte)4);
//        FichaNumerica fichanumerica2 = new FichaNumerica();
//        fichanumerica2.setNumero((byte)5);
//        Comodin fichaComodin= new Comodin();
//        FichaNumerica fichanumerica3 = new FichaNumerica();
//        fichanumerica3.setNumero((byte)5);
//        
//        List<Ficha> fichas = new ArrayList<>();
//        
//        fichas.add(fichanumerica1);
//        fichas.add(fichanumerica2);
//        fichas.add(fichaComodin);
//        fichas.add(fichanumerica3);
//        
//        Conjunto conjuntoPrueba = new ConjuntoGrupo();
//        
//        conjuntoPrueba.setFichas(fichas);
//        
//        conjuntoPrueba.validarConjunto();
        
        //Pruebas para verificar sí se crean copias de toda la partida
        Jugador jugadorPrueba1 = new Jugador();
        Jugador juegadorPrueba2 = new Jugador();
        Mazo mazo1 = new Mazo();
        Mazo mazo2 = new Mazo();
        jugadorPrueba1.setTurno(true);
        juegadorPrueba2.setTurno(true);
        jugadorPrueba1.setMazo(mazo1);
        juegadorPrueba2.setMazo(mazo2);
        List<Jugador> jugadoresdentropartida = new ArrayList<>();
        jugadoresdentropartida.add(jugadorPrueba1);
        jugadoresdentropartida.add(juegadorPrueba2);
        
        //agregación de fichas a un conjunto y de un conjunto al tablero
        FichaNumerica fichanumerica1 = new FichaNumerica();
        fichanumerica1.setNumero((byte)4);
        FichaNumerica fichanumerica2 = new FichaNumerica();
        fichanumerica2.setNumero((byte)5);
        Comodin fichaComodin= new Comodin();
        FichaNumerica fichanumerica3 = new FichaNumerica();
        fichanumerica3.setNumero((byte)5);
        
        List<Ficha> fichas = new ArrayList<>();
        
        fichas.add(fichanumerica1);
        fichas.add(fichanumerica2);
        fichas.add(fichaComodin);
        fichas.add(fichanumerica3);
        
        Conjunto conjuntoPrueba = new ConjuntoGrupo();
        
        conjuntoPrueba.setFichas(fichas);
        
        List<Conjunto> conjuntosDentroTablero = new ArrayList<>();
        conjuntosDentroTablero.add(conjuntoPrueba);
        Tablero.obtenerInstancia().setConjuntos(conjuntosDentroTablero);
        
        //Agregación de fihcas dentro de la pila
        FichaNumerica fichanumerica4 = new FichaNumerica();
        fichanumerica4.setNumero((byte)8);
        FichaNumerica fichanumerica5 = new FichaNumerica();
        fichanumerica5.setNumero((byte)9);
        Comodin fichaComodin2= new Comodin();
        FichaNumerica fichanumerica6 = new FichaNumerica();
        fichanumerica6.setNumero((byte)10);
        List<Ficha> fichasDentroPila = new ArrayList<>();
        
        fichasDentroPila.add(fichanumerica4);
        fichasDentroPila.add(fichanumerica5);
        fichasDentroPila.add(fichaComodin2);
        fichasDentroPila.add(fichanumerica6);
        Pila.obtenerInstancia().setFichas(fichasDentroPila);
        
        Partida.obtenerInstancia().setJugadores(jugadoresdentropartida);
        Partida.obtenerInstancia().setTablero(Tablero.obtenerInstancia());
        Partida.obtenerInstancia().setPila(Pila.obtenerInstancia());
        
        Partida.obtenerInstancia().getJugadores();
        
        Partida.obtenerInstancia().guardarPartida();
        
        //Modificaciones a la partida para veirficar que se hagan copias
        Partida.obtenerInstancia().getJugadores().get(0).setTurno(false);
        Partida.obtenerInstancia().getPila().getFichas().removeLast();
        FichaNumerica fichanumerica7 = new FichaNumerica();
        fichanumerica7.setNumero((byte)30);
        Partida.obtenerInstancia().getTablero().getConjuntos().get(0).getFichas().add(fichanumerica7);
        
        Partida.obtenerInstancia();
        
        Partida.obtenerInstancia().restuararPartida();
        
        Partida.obtenerInstancia();
    }
}

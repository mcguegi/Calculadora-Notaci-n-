/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Familiaguerrero
 */
public class PilaOperador {

    NodoOperador p;

    PilaOperador() {
        p = null;
    }

    public void insertarPila(char x) {
        NodoOperador n;
        n = new NodoOperador(x);
        n.sig = p;
        p = n;
    }


    public char retirarPila() {
        char t = p.info;
        p = p.sig;
        return t;
    }


    public char topePila() {
        return p.info;
    }

    public boolean estaVacia() {
        return !(p != null);
    }
}

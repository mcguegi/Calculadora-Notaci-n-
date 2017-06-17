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
public class PilaNumeros {

    NodoNumero p;

    PilaNumeros() {
        p = null;
    }


    public void insertarPila(Float x) {
        NodoNumero n;
        n = new NodoNumero(x);
        n.sig = p;
        p = n;
    }


    public Float retirarPila() {
        Float t = p.info;
        p = p.sig;
        return t;
    }


    public Float topePila() {
        return p.info;
    }



    public boolean estaVacia() {
        return !(p != null);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Familiaguerrero
 */
public class Convertidor {
    //Clase que convierte una operacion en notacion posfijo

    PilaOperador pila = new PilaOperador();
    String operador;
    char[] cadena;
    String[] posfijo;
    int i = 0;
    int j = 0;

    //Cambia la cadena por un arreglo de caracteres
    public char[] operacionToArray(String operacion) {
        cadena = operacion.toCharArray();
        return cadena;
    }

    public int evaluarPrioridad(char topePila, char cadena) {
        System.out.println(topePila);
        System.out.println(cadena);
        int temp = 1;
        if (null != Character.toString(topePila)) {
            switch (Character.toString(topePila)) {
                case "+":
                    if (null != Character.toString(cadena)) {
                        switch (Character.toString(cadena)) {
                            case "+":
                                temp = 1;
                                break;
                            case "-":
                                temp = 1;
                                break;
                            case "*":
                                temp = 0;
                                break;
                            case "/":
                                temp = 0;
                                break;
                            case "^":
                                temp = 0;
                                break;
                            case ")":
                                temp = 1;
                                break;
                            case "(":
                                temp = 0;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case "-":
                    if (null != Character.toString(cadena)) {
                        switch (Character.toString(cadena)) {
                            case "+":
                                temp = 1;
                                break;
                            case "-":
                                temp = 1;
                                break;
                            case "*":
                                temp = 0;
                                break;
                            case "/":
                                temp = 0;
                                break;
                            case "^":
                                temp = 0;
                                break;
                            case ")":
                                temp = 1;
                                break;
                            case "(":
                                temp = 0;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case "*":
                    if (null != Character.toString(cadena)) {
                        switch (Character.toString(cadena)) {
                            case "+":
                                temp = 1;
                                break;
                            case "-":
                                temp = 1;
                                break;
                            case "*":
                                temp = 1;
                                break;
                            case "/":
                                temp = 1;
                                break;
                            case "^":
                                temp = 0;
                                break;
                            case ")":
                                temp = 1;
                                break;
                            case "(":
                                temp = 0;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case "/":
                    if (null != Character.toString(cadena)) {
                        switch (Character.toString(cadena)) {
                            case "+":
                                temp = 1;
                                break;
                            case "-":
                                temp = 1;
                                break;
                            case "*":
                                temp = 1;
                                break;
                            case "/":
                                temp = 1;
                                break;
                            case "^":
                                temp = 0;
                                break;
                            case ")":
                                temp = 1;
                                break;
                            case "(":
                                temp = 0;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case "^":
                    if (null != Character.toString(cadena)) {
                        switch (Character.toString(cadena)) {
                            case "+":
                                temp = 1;
                                break;
                            case "-":
                                temp = 1;
                                break;
                            case "*":
                                temp = 1;
                                break;
                            case "/":
                                temp = 1;
                                break;
                            case "^":
                                temp = 1;
                                break;
                            case ")":
                                temp = 1;
                                break;
                            case "(":
                                temp = 0;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case "(":
                    if (null != Character.toString(cadena)) {
                        switch (Character.toString(cadena)) {
                            case "+":
                                temp = 0;
                                break;
                            case "-":
                                temp = 0;
                                break;
                            case "*":
                                temp = 0;
                                break;
                            case "/":
                                temp = 0;
                                break;
                            case "^":
                                temp = 0;
                                break;
                            case ")":
                                temp = 2;
                                break;
                            case "(":
                                temp = 0;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println(temp);
        return temp;
    }

    //Evalua si es u operador

    public static boolean esOperador(String letra) {
        if (letra.equals("=") || letra.equals("^") || letra.equals("/") || letra.equals("*") || letra.equals("+") || letra.equals("-") || letra.equals("(") || letra.equals(")")) {
            return true;
        }
        return false;
    }

    // Convertir a posfijo  

    public String[] convertir(char[] cadena) {

        PilaOperador pila = new PilaOperador();
        String operador = "";

        i = 0;
        j = 0;

        posfijo = new String[cadena.length];
        while (i < cadena.length) {
            if (!esOperador(Character.toString(cadena[i]))) {
                posfijo[j] = "";
                while (!esOperador(Character.toString(cadena[i]))) {
                    posfijo[j] = posfijo[j] + cadena[i] + "";
                    i++;
                    if (i == cadena.length) {
                        break;
                    }

                }
                j++;
            } else if (esOperador(Character.toString(cadena[i]))) {
                if (pila.estaVacia()) {
                    pila.insertarPila(cadena[i]);
                    i++;
                } else if (evaluarPrioridad(pila.topePila(), cadena[i]) == 0) {
                    pila.insertarPila(cadena[i]);
                    i++;
                } else if (evaluarPrioridad(pila.topePila(), cadena[i]) == 1) {
                    posfijo[j] = Character.toString(pila.retirarPila());
                    j++;
                } else if (evaluarPrioridad(pila.topePila(), cadena[i]) == 2) {
                    pila.retirarPila();
                    i++;
                }
            }
        }
        if (i == cadena.length) {
            while (!pila.estaVacia()) {
                posfijo[j] = Character.toString(pila.retirarPila());
                j++;
            }
        }
        return posfijo;
    }
}

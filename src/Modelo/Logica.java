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
public class Logica {
    int i =0;
    Float x;
    PilaNumeros pila ;
    
    public static boolean esOperador(String letra) {
        if (letra.equals("=") || letra.equals("^") || letra.equals("/") || letra.equals("*") || letra.equals("+") || letra.equals("-") || letra.equals("(") || letra.equals(")")) {
            return true;
        }else{
            return false;
        }
    }
     
    public String calcular(String[] posfijo){
       
        i=0;
        pila = new PilaNumeros();
        String salida;
        while(i< posfijo.length){
                if(posfijo[i]== null){
                    break;
                } else if(!esOperador(posfijo[i])){
                   pila.insertarPila(Float.parseFloat(posfijo[i]));
                   System.out.println(pila.topePila());
               } else if (esOperador(posfijo[i])){
                   float a= pila.retirarPila();
                   float b= pila.retirarPila();
                   switch(posfijo[i]){
                       case "+": x = a+b; break;
                       case "-": x = b-a; break;
                       case "/": x = b/a; break;
                       case "*": x= b*a; break;
                       case "^": x = (float) Math.pow(b, a); break;
                   }
                   pila.insertarPila(x);
               }
               i++;
        }
        if(Float.isInfinite(pila.topePila())){
            salida = "No hay division por 0";
        }else{
        salida= ""+ pila.topePila();
        }
        return salida;
    }
}

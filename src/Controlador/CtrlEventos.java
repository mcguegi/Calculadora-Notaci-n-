/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Logica;
import Modelo.Convertidor;

/**
 *
 * @author Familiaguerrero
 */
public class CtrlEventos {
    Convertidor convertidor =new Convertidor();
    Logica calculador = new Logica();
    
    public String btnUno(String operacion){
        if(operacion == null){
            return "1";
        }else{ 
        operacion = operacion + "1";
        return operacion;
        }
    }
    public String btnDos(String operacion){
        if(operacion == null){
            return "2";
        }else{ 
        operacion = operacion + "2";
        return operacion;
        }
    }
    public String btnTres(String operacion){
        if(operacion == null){
            return "3";
        }else{ 
        operacion = operacion + "3";
        return operacion;
        }
    }
    public String btnCuatro(String operacion){
        if(operacion == null){
            return "4";
        }else{ 
        operacion = operacion + "4";
        return operacion;
        }
    }
    public String btnCinco(String operacion){
        if(operacion == null){
            return "5";
        }else{ 
        operacion = operacion + "5";
        return operacion;
        }
    }
    public String btnSeis(String operacion){
        if(operacion == null){
            return "6";
        }else{ 
        operacion = operacion + "6";
        return operacion;
        }
    }
    public String btnSiete(String operacion){
        if(operacion == null){
            return "7";
        }else{ 
        operacion = operacion + "7";
        return operacion;
        }
    }
    public String btnOcho(String operacion){
        if(operacion == null){
            return "8";
        }else{ 
        operacion = operacion + "8";
        return operacion;
        }
    }
    public String btnNueve(String operacion){
        if(operacion == null){
            return "9";
        }else{ 
        operacion = operacion + "9";
        return operacion;
        }
    }
    public String btnCero(String operacion){
        if(operacion == null){
            return "0";
        }else{ 
        operacion = operacion + "0";
        return operacion;
        }
    }
    public String btnPunto(String operacion){
        if(operacion == null){
            return "0.";
        }else{ 
        operacion = operacion + ".";
        return operacion;
        }
    }
    public String btnSuma(String operacion){
        if(operacion == null){
            return "0+";
        }else{ 
        operacion = operacion + "+";
        return operacion;
        }
    }
    public String btnResta(String operacion){
        if(operacion == null){
            return "0-";
        }else{ 
        operacion = operacion + "-";
        return operacion;
        }
    }
    public String btnMulti(String operacion){
        if(operacion == null){
            return "0*";
        }else{ 
        operacion = operacion + "*";
        return operacion;
        }
    }
    public String btnElevado(String operacion){
        if(operacion == null){
            return "0^";
        }else{ 
        operacion = operacion + "^";
        return operacion;
        }
    }
    public String btnDivi(String operacion){
        if(operacion == null){
            return "0/";
        }else{ 
        operacion = operacion + "/";
        return operacion;
        }
    }
    public String btnAbierto(String operacion){
        if(operacion == null){
            return "(";
        }else{ 
        operacion = operacion + "(";
        return operacion;
        }
    }
     public String btnCerrado(String operacion){
        if(operacion == null){
            return ")";
        }else{ 
        operacion = operacion + ")";
        return operacion;
        }
    }
     public String[] btnIgual(String operacion){
        char[] cadena = operacion.toCharArray();
        String posfijo="";
        String resultado="";
        String[] salida = new String[2];
        
        String[] cadenaPosfijo =convertidor.convertir(cadena);
        for(int j=0; j<cadena.length;j++){
        //System.out.println(cadenaPosfijo[j]);
        if(cadenaPosfijo[j]!= null){
         posfijo= posfijo + cadenaPosfijo[j];
        }
        resultado= calculador.calcular(cadenaPosfijo);
        salida[0]= posfijo;
        salida[1]= resultado;
    }
     return salida ;    
}
}
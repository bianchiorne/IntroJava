/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej13;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int resultado =   suma(10,10);
        System.out.println(resultado);
        
        saludoPersonalizado("chiquito");
        
        Scanner leer = new Scanner (System.in);
        
        String nombre = leer.next();
        saludoPersonalizado(nombre);
        saludoPersonalizado(leer.next());
    }
    
    public static int suma(int a, int b){
        int resultado = a +b;
        
        
        return resultado;
    }
    
    public static void saludoPersonalizado(String nombre){
        System.out.println("Hola" + nombre + " como estas?");
    }
}

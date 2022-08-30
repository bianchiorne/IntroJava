/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package Ej03;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        String frase = read.nextLine();
       
        System.out.println("La frase ingresada en letras minusculas es " +frase.toLowerCase());
        System.out.println("La frase ingresada en letras mayusculas es " +frase.toUpperCase());
    }
    
}

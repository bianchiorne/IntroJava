/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Ej04;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       double gradosC, gradosF;
        System.out.println("Ingrese los grados centigrados para mostrar su equivalente en Fahrenheit");
        gradosC = leer.nextDouble();
        
        gradosF= 32+(9*gradosC/5);
        
        System.out.println(gradosC+"C es igual a " + gradosF + "F");
        
       
    }
    
}

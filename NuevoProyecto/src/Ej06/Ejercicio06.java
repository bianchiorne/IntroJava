/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package Ej06;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero para conocer si es par o impar");
        int num = leer.nextInt();
        
        if (num % 2==0){
            System.out.println("El numero ingresado es PAR");
            
        } else {
            System.out.println("El numero ingresado es IMPAR    ");
        }
    }
    
}

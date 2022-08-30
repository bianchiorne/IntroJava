/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java..
 */
package Ej07;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
     String frase = leer.nextLine();
     String frase2="Eureka";
     
     if (frase.equals(frase2)){
         System.out.println("La palabra ingresada es correcta");
               
    }else{
         System.out.println("La palabra ingresada es incorrecta");
     }
    }
    
}

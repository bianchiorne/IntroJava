/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package Ej05;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        System.out.println("El doble del numero ingresado es " + num*2);
        System.out.println("El triple del numero ingresado es " + num*3);
        System.out.println("La raiz cuadrada del numero ingresado es " + Math.sqrt(num));
                
                

        
      
    }
    
}

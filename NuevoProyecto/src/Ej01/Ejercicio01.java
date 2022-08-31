/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package Ej01;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int suma, num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = leer.nextInt();

        suma = num1 + num2;

        System.out.println("La suma de los dos numeros ingresados es " + suma);

    }

}

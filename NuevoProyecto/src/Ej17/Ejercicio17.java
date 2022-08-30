/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Ej17;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese el tamano del vector a rellenar");
        num = leer.nextInt();

        int[] vector = new int[num];

        for (int i = 0; i < num; i++) {
            vector[i] = (int) (Math.random() * 100 + 1);
            System.out.println(vector[i]);
        }

        //me falta contabilizar los ditigos de los numeros
       
    }
    

}



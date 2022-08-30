/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package Ej16;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       int num;
       System.out.println("Ingrese el tamano del vector a rellenar");
        num = leer.nextInt();
        
        int  [ ] vector = new int [num];
   
        for (int i = 0; i<num; i++) {
            vector[i] = (int) (Math.random()*5+1);
            System.out.println(vector[i]);
        }
            
        System.out.println("Ingrese el  numero a buscar");
        int num2 = leer.nextInt();
        
         int contador=0;
        for (int i = 0; i < vector.length; i++) {
            if (num2==vector[i]){
                System.out.println("El numero se encuentra en la posicion" + i);
                contador ++;
                
            }
        }
        if (contador>1){
            System.out.println("El numero se encuentra repetido");
        }
        }
       
    }
  



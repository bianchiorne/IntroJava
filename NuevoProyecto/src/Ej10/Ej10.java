/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package Ej10;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int val, suma, num;
       
        System.out.println("Ingrese un valor");
        val=leer.nextInt();
         
        suma=0;
        
        
        while (suma<= val){
            System.out.println("Ingrese un numero");
             num=leer.nextInt();
             suma=suma+num;
        }
        System.out.println("La suma de los numeros ingresados es  " + suma +  " supera el limite inicial ingresado");
    }
    
}

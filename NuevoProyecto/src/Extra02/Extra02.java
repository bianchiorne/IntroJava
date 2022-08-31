/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package Extra02;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int A, B, C, D, aux;
       A=23;
       B=10;
       C=6;
       D=15;
       
        System.out.println("Los valores iniciales son:");
        System.out.println("A=" +A);
        System.out.println("B=" +B);
        System.out.println("C=" +C);
        System.out.println("D=" +D);
        
        aux = B;
        B= C;
        C=A;
        A=D;
        D=aux;
        
        System.out.println("Los valores finales son");
        System.out.println("A=" +A);
        System.out.println("B=" +B);
        System.out.println("C=" +C);
        System.out.println("D=" +D);
 
                
        
               
    }
    
}

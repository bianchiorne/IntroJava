/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package Extra04;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer= new Scanner (System.in);
        System.out.println("Ingresa un numero del 1 al 10");
        int num = leer.nextInt();
        
      
        switch (num) {
            case 1:
                System.out.println("El numero ingresado es equivalente al I en numeros romanos");
                break;
            case 2:
                System.out.println("El numero ingresado es equivalente al II en numeros romanos");
                break;
            case 3:
                System.out.println("El numero ingresado es equivalente al III en numeros romanos");
                break;
            case 4:
                System.out.println("El numero ingresado es equivalente al IV en numeros romanos");
                break;
            case 5:
                System.out.println("El numero ingresado es equivalente al V en numeros romanos");
                break;
            case 6:
                System.out.println("El numero ingresado es equivalente al VI en numeros romanos");
                break;
            case 7:
                System.out.println("El numero ingresado es equivalente al VII en numeros romanos");
                break;
            case 8:
                System.out.println("El numero ingresado es equivalente al VIII en numeros romanos");
                break;
            case 9:
                System.out.println("El numero ingresado es equivalente al IX en numeros romanos");
                break;
            case 10:
                System.out.println("El numero ingresado es equivalente al X en numeros romanos");
                break;
            default:
                System.out.println("Debes ingresar un numero del 1 al 10");

        }
    }
    
}

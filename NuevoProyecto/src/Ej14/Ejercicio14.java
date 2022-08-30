/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package Ej14;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir");
        double cantidad=leer.nextDouble();
        System.out.println("Ingrese la moneda a la que quiere convertir");
        String moneda=leer.next();
       
        conversor(cantidad,moneda);

    }
    
    public static void conversor(double cantidad, String moneda) {
        double resultado = 0;
        boolean correcto = true;
        switch (moneda) {
            case "libras":
                resultado = cantidad * 0.86;
                break;
            case "dolares":
                resultado = cantidad * 1.28611;
                break;
            case "yenes":
                resultado = cantidad * 129.852;
                break;
            default:
                System.out.println("El tipo de moneda es incorrecto");
               correcto=false;
        }
        
        
        if(correcto){
            System.out.println(cantidad+ " euros en " +moneda+ " son " +resultado);

        }
        }   
    
    }


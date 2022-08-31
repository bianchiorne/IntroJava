/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej11;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
            System.out.println("Ingrese un numero");
            int num1=leer.nextInt();
            int  num2=leer.nextInt();
            
            System.out.println("MENU");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("5.- Salir");
             
            double suma, resta, division, multiplicacion;
            suma = num1+num2;
            resta = num1-num2;
            multiplicacion= num1*num2;
            division= num1/num2;
            
            String respuesta="S";
            
        do {

            System.out.println("Ingrese la opcion que desea realizar");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma de los numeros ingresados es: " + suma);
                    break;
                case 2:
                    System.out.println("La resta de los numeros ingresados es: " + resta);
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros ingresados es: " + multiplicacion);
                    break;
                case 4:
                    System.out.println("La division de los numeros ingresados es: " + division);
                    break;
                case 5:
                    leer.nextLine();
                    System.out.println("¿Esta seguro que desea salir del programa? (S/N)");
                    respuesta = leer.nextLine();
                    break;
                default:
                    System.out.println("Solo numeros del 1 al 5");
            }

        } while (respuesta.equals("N"));
                    
                    
                    
                
            
    }

}

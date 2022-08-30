/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra06;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double estatura, total, totalEstatura, promedio, promedioEstatura;
        int contador1 = 0;
        int contador2 = 0;
        total = 0;
        totalEstatura = 0;

        String respuesta = "n";

        do {
            System.out.println("Ingrese la estatura");
            estatura = leer.nextDouble();
            total = total + estatura;
            contador1++;
            leer.nextLine();
            System.out.println("Desea ingresar otra estatura?");
            respuesta = leer.nextLine();

            if (estatura < 1.60) {
                totalEstatura = totalEstatura + estatura;
                contador2++;
            }
        } while (respuesta.equals("s"));

        promedio = total / contador1;
        promedioEstatura = totalEstatura / contador2;

        System.out.println("El promedio general de las estaturas ingresadas es de: " + promedio);
        System.out.println("El promedio de las estaturas que se encuentran por debajo de 1,60 es de: " + promedioEstatura);
    }


}

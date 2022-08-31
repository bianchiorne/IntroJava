/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package Extra01;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        double hora, min, seg, dia;
        
        System.out.println("Ingrese la cantidad de minutos para calcular su equivalente a horas y dias");
        min = leer.nextDouble();
        
       dia=(min /60)/24;
       hora=min/60;
       
        System.out.println(min + " equivale a " + hora + " horas  y a " + dia + " dias");
       
       
        
    }
    
}

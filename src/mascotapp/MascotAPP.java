/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import mascotapp.entidades.Mascota;
import mascotapp.servicios.SerivicioMascota;




/**
 *
 * @author Usuario
 */
public class MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SerivicioMascota sm = new SerivicioMascota();
        
        Mascota m1 = sm.crearMascota();
        
        System.out.println(m1.toString());
    
        
        
    }
    
}

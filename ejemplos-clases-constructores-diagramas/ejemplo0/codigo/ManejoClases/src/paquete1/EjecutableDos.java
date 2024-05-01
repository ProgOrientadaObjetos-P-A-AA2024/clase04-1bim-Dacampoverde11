/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author utpl
 */
public class EjecutableDos {
    
    public static void main (String[] args){
        Computadora personal = new Computadora(24);
        personal.establecerTipoProcesador("R1");
        
        System.out.printf("%s - %.2f",
                personal.obtenerTipoProcesador(), 
                personal.obtenerMemoria());
    }
    
}

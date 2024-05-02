/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        
        Scanner sc = new Scanner (System.in);
        sc.useLocale(Locale.US);
        String nombre, ciudad;
        int numD, numE;
        
        System.out.print("Ingrese el nombre del Hospital 1: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese la ciudad del Hospital 1: ");
        ciudad = sc.nextLine();
        System.out.print("Ingrese la cantidad de doctores 1: ");
        numD = sc.nextInt();
        System.out.print("Ingrese la cantidad de enfermeros 1: ");
        numE = sc.nextInt();
         sc.nextLine();
         

        Hospital h1 = new Hospital(nombre, ciudad, numD, numE);

        System.out.print("\nIngrese el nombre del Hospital 2: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese la ciudad del Hospital 2: ");
        ciudad = sc.nextLine();
        System.out.print("Ingrese la cantidad de doctores 2: ");
        numD = sc.nextInt();
        System.out.print("Ingrese la cantidad de enfermeros 2: ");
        numE = sc.nextInt();
        sc.nextLine();
        
        Hospital h2 = new Hospital(nombre, ciudad, numD, numE);
        
        
        
        
       
        
        System.out.printf("%s\n", h1);
        System.out.printf("%s\n", h2);
        
          System.out.printf("HOSPITAL 1\n"
                  + "========\n%s\n",
                h1.toString());
          
          System.out.printf("HOSPITAL 2\n"
                  + "========\n%s\n",
                h2.toString());
    }
}

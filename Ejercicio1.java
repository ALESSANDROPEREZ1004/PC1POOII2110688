/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author Alumno
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       import java.util.Scanner;
       
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese un número final para los kilómetros por hora mayor a 60KPH: ");
            int finalKPH = input.nextInt();
            
            if (finalKPH <= 60 || finalKPH % 10 != 0) {
                System.out.println("Programa finalizado, usted debe ingresar un valor múltiplo de 10 mayor a 60KPH");
                System.exit(0);
            }
            
            System.out.println("KPH\t\tMPH");
            for (int kph = 60; kph <= finalKPH; kph += 10) {
                double mph = kph * 0.6214;
                System.out.printf("%d\t\t%.1f\n", kph, mph);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Ingrese un valor válido.");
        } finally {
            input.close();
        }
    }
}

 
        
    }


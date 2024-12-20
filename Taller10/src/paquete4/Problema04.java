/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] datos = new double[2][2];
        int fueraDeRango = 0;

       
        
        for (int i = 0; i < datos.length ; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("Ingrese un número para posición [%d][%d]: ",
                        i,j);
                double valor = entrada.nextDouble();

                if (valor >= 1000 && valor <= 1199) {
                    datos[i][j] = valor; 
                } else {
                    datos[i][j] = 10;   
                    fueraDeRango++;     
                }
            }
        }

      
        System.out.println("\nContenido del arreglo:");
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.println(datos[i][j] + " ");
            }
           
        }

        
        System.out.println("\nCantidad de valores fuera de rango: " + fueraDeRango);
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorIngresado;
        int[][] arreglo1 = new int[2][5];
        int suma = 0;
        String[] nombresEstudiante = {"Jessica Cole", "Robert Wallace"};
        String reporte = "";
        
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
            }
        }
        
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                System.out.printf("Ingrese numero de ventas que realizo"
                        + "[%d][%d]:",
                        i, j);
                valorIngresado = entrada.nextInt();
                arreglo1[i][j] = valorIngresado;
                suma = suma + valorIngresado;
            }
            System.out.println("");
            
        }
        
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
            }
            System.out.printf("%sVendedor(a) %s\n",reporte,
                    nombresEstudiante[i]);
        }
         System.out.printf("%sHa realizado un total de %d en ventas.\n", 
                 reporte,
                 suma);

    }
}

    


package paquete7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Usuario Win11
 */
public class Problema07 {

    public static void main(String[] args) {
        // TODO code application logic here
        double[][] dato1 = {{0, 2, 0}, {1, 0, 0}};
        double[][] dato2 = {{0, 0, 0}, {0, 0, 0}};
        double[][] dato3 = new double[3][3];
        double valor1;
        double valor2;
        String cadena = "";

        for (int fila = 0; fila < dato1.length; fila++) {
            for (int col = 0; col < dato1[fila].length; col++) {
                valor1 = dato1[fila][col];
                valor2 = dato2[fila][col];
                dato3[fila][col] = valor1 + valor2;
                if (dato3[fila][col] == 0) {
                    System.out.printf("%sNulo\n", cadena);
                    {

                    }
                }
            }
        }
        for (int fila = 0; fila < dato1.length; fila++) {
            for (int col = 0; col < dato1[fila].length; col++) {
                System.out.printf("%s", cadena);
            }
            {

            }
        }
    }

}

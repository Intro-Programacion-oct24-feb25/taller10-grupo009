/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {
    public static void main(String[] args) {
        
        String[][] estudiantes = {
            {"Sarah Ward", "Philip Payne"},
            {"Carrie Burton", "Lauren Rice"},
            {"Emma Escobar", "Lori Flores"},
            {"Steven West", "Toni Martin"}
        };
        String nombre;
          
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                nombre = estudiantes[i][j];
                char primeraLetra = nombre.charAt(0); 

              
                if (primeraLetra == 'S' || primeraLetra == 'P' || primeraLetra == 'T') {
                    System.out.printf("%s%n", nombre); 
                }
            }
        }
    }
}

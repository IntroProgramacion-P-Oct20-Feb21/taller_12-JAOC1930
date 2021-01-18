/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] resultado = new double[4][2];
        double x;
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 2; col++) {
                x = datos[fila][col];
                resultado[fila][col] = factoriales(x);
                System.out.printf("El factorial de: %.2f es: %.2f\n",
                        datos[fila][col], factoriales(x));
            }
        }
    }

    public static double factoriales(double valor) {
        if (valor <= 1) {
            return 1;
        } else {
            return valor * factoriales(valor - 1);
        }
        
    }
    
}

/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author munoz
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc =new Scanner (System.in);
         int C;
         System.out.println("Ingrese cuantos grados hace");
         C=sc.nextInt();
         System.out.println("la temperatura fahrenheit seria " +( 32 + (9 * C / 5)) + "F" );
       
    }
    
}

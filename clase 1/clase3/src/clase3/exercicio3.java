/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author munoz
 */
public class exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner (System.in);
        String frase;
        System.out.println("Ingrese una frase ");
        frase =sc.nextLine();
        System.out.println("FRASE EN MAYUSCA ES: " + frase.toUpperCase());
        System.out.println("frase en minuscula: " + frase.toLowerCase());
    }
    
}

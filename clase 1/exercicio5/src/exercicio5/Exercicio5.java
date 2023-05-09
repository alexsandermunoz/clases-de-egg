/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 */
package exercicio5;

import java.util.Scanner;

/**
 *
 * @author munoz
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner (System.in);
        int num;
        System.out.println("ingrese un numero");
        num=sc.nextInt();
        System.out.println("es doble del numero es "+ num*2);
        System.out.println("es triple del numero es "+ num*3);
        System.out.println("la raiz cuadrada del numero es "+ Math.sqrt(num));
    }
    
}

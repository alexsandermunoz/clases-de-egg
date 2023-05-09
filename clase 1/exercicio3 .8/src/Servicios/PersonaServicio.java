/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;


import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author meli
 */
public class PersonaServicio {
    
    public boolean esMayorDeEdad(Persona persona){
        
        return persona.getEdad() >= 18;
      
    }
    
    public  Persona crearPersona(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre ");
        
        String nombre = leer.next();
        
        System.out.println("Ingrese la edad ");
        
        byte edad = leer.nextByte();
        
        System.out.println("Ingrese el sexo (M, H, O) ");
        
        char sexo = leer.next().toUpperCase().charAt(0);
        
        while(sexo != 'M' && sexo != 'H' && sexo != 'O'){
            
            System.out.println("El valor ingresado es incorrecto, intente nuevamente(M, H, O)");
            
            sexo = leer.next().toUpperCase().charAt(0);
            
            
       }
        
        System.out.println("Ingrese el peso(kg)");
        
        double peso = leer.nextDouble();
        
        System.out.println("Ingrese la altura(m)");
        
        double altura = leer.nextDouble();
        
        Persona persona = new Persona(edad, sexo, peso, altura, nombre);
        
        return persona;
        
     }
    
    public int calcularIMC(Persona persona){
        
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        
        if(imc < 20.0){
            
            return -1;
        }
        
        else if(imc>= 20.0 && imc<= 25.0){
            
            return 0;
        }
        
        else{
            
            return 1;
        }
    
    }
    
}
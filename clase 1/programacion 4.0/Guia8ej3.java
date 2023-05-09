/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej3;

import entidades.Persona;

import servicios.PersonaServicio;
/**
 *
 * @author meli
 */
public class Guia8ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     PersonaServicio personaServicio = new PersonaServicio();
     
     Persona p1 = personaServicio.crearPersona();
     
     Persona p2 = personaServicio.crearPersona();
     
     Persona p3 = personaServicio.crearPersona();
     
     Persona p4 = personaServicio.crearPersona();
     
     mostrar(p1, personaServicio);
     
     mostrar(p2, personaServicio);
     
     mostrar(p3, personaServicio);
     
     mostrar(p4, personaServicio);
     
     double[] imcs = new double[4];
     
     imcs[0]= personaServicio.calcularIMC(p1);
     
     imcs[1]= personaServicio.calcularIMC(p2);
     
     imcs[2]= personaServicio.calcularIMC(p3);
     
     imcs[3]= personaServicio.calcularIMC(p4);
     
     mostrarPorcentajeIMC(imcs);
     
     boolean[] mayores = new boolean [4];
     
    mayores[0]= personaServicio.esMayorDeEdad(p1);
    
    mayores[1]= personaServicio.esMayorDeEdad(p2);
    
    mayores[2]= personaServicio.esMayorDeEdad(p3);
    
    mayores[3]= personaServicio.esMayorDeEdad(p4);
    
    mostrarPorcentajeMayores(mayores);
    
    }
    
    private static void mostrar(Persona persona, PersonaServicio servicio){
        
        System.out.println(persona.getNombre() + " es mayor de edad " + servicio.esMayorDeEdad(persona));
        
        System.out.println(persona.getNombre() + " IMC: " + servicio.calcularIMC(persona));
    }
    
    private static void mostrarPorcentajeIMC(double[] imcs){
        
        int pesoBajo = 0;
        
        int pesoIdeal = 0;
        
        int sobrePeso= 0;
        
        for(int i = 0; i < imcs.length; i++){
            
            if(imcs[i] == -1){
                
                pesoBajo++;
            }
            
            else if(imcs[i] == 0){
                
                pesoIdeal++;
            }
            
            else{
                
                sobrePeso++;
            }
        }
        
        double porcentajePesoBajo = pesoBajo * 100 / imcs.length;
        
        double porcentajePesoIdeal = pesoIdeal * 100 / imcs.length;
        
        double porcentajeSobrePeso = sobrePeso * 100 / imcs.length;
        
        System.out.println("Porcentaje peso bajo " + porcentajePesoBajo);
        
        System.out.println("Porcentaje peso ideal " + porcentajePesoIdeal);
        
        System.out.println("Porcentaje sobrepeso " + porcentajeSobrePeso);
    
    }

    private static void mostrarPorcentajeMayores(boolean[] mayores) {
        
     int esMenor = 0;
        
        int esMayor = 0;
        
         for(int i = 0; i < mayores.length; i++){
            
            if(mayores[i] == true){
                
                esMayor++;
            }
            
            else{
                
                esMenor++;
            }
            
         }
            
             int porcentajeMayor = esMayor * 100 / mayores.length;
        
       int porcentajeMenor = esMenor * 100 / mayores.length;
       
      System.out.println("Porcentaje de menores de edad " + porcentajeMenor+"%");
        
        System.out.println("Porcentaje de mayores de edad " + porcentajeMayor + "%");
    }
    
}

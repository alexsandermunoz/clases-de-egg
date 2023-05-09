/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author munoz
 */
public class Perona {
    
    public String nombre;
    public int edad;
    public String nacionalidad;
    public int fecha;

    public Perona(String nombre, int edad, String nacinalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.fecha = fecha;
    }

  /*  public Perona() {
      
    }
     public void EntradaDatos() {
         Scanner leer = new Scanner(System.in);
        
         System.out.println("ingrese nombre");
        nombre = leer.nextLine();
         
         System.out.println("ingrese edad");
         edad = leer.nextInt();
         
         System.out.println("ingrese nacionalidad");
         nacionalidad = leer.next();
         
         System.out.println("ingrese fecha");
         fecha = leer.nextInt()
         
         
     }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getFecha() {
        return fecha;
    }
        public void muestra() {
           
             System.out.println("nombre " + nombre);
              System.out.println("edad " + edad);
               System.out.println("nacionalidad " + nacionalidad);
               System.out.println("fecha " + fecha);
        } 
*/

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getFecha() {
        return fecha;
    }
}


    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Curso;
import java.util.Scanner;

/**
Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que 
* asisten a las clases. Nosotros nos encargaremos de almacenar esta información en un 
* arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos al 
* usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso.
* En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en 
* una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día,
* el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se
* repite el encuentro.

 */


/*
Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que 
* asisten a las clases. Nosotros nos encargaremos de almacenar esta información en un 
* arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno.
*/


public class CursoServicio {
 
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public String[] CargarAlumnos() {
        String[] Alumnos = new String[5];

        for (int i = 0; i < Alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno = " + (i + 1));
            Alumnos[i] = sc.next();

        }
        {

        }

        return Alumnos;
   
    }
    
    /*
  Método crearCurso(): el método crear curso, le pide los valores de los atributos al 
* usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso.
* En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
    
    */
    public Curso CrearCurso() {
        Curso p = new Curso();
        System.out.println("Ingrese el nombre del curso a crear: ");
        p.setNombreCurso(sc.next());
        System.out.println("Cuantas horas por dia tiene el curso: ");
        p.setCantidadHorasPorDia(sc.nextInt());
        System.out.println("Cuantos dias a la semana tiene? : ");
        p.setCantidadDiasPorSemana(sc.nextInt());
        System.out.println("Que turno va a ser el curso: dia o noche ");
        p.setTurno(sc.next());
        
        boolean salida= false;
        do {
            if ( p.getTurno().equalsIgnoreCase("dia") || p.getTurno().equalsIgnoreCase("noche")) {
                salida=true;
                
            }else{
                System.out.println("Ingrese una opcion valida. Es incorrecta lo que ingrese");
                System.out.println("Las opciones de turno son: Dia o Noche ");
                p.setTurno(sc.next());
            }
 
        } while (salida!=true);
        
        System.out.println("Ingrese el precio del curso x hora : ");
        p.setPrecioPorHora(sc.nextInt());
        p.setAlumnos(CargarAlumnos());
        return p;
        
    }
    
    
    /*
  Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en 
* una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día,
* el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se
* repite el encuentro.
    */
    
    public int GananciaPorSemana(Curso p){
        int ganancia=p.getCantidadHorasPorDia()*p.getPrecioPorHora()*5*p.getCantidadDiasPorSemana();
        System.out.println("El curso da una ganancia exacta de: " + ganancia);
        return ganancia;
        
    }
    
    
}

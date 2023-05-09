/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16guia9;

import Entidades.Curso;
import Servicio.CursoServicio;

/**
 *
 * @author Anibal1
 */
public class Ejercicio16Guia9 {

    /**
Un profesor particular está dando cursos para grupos de cinco alumnos
* y necesita un programa para organizar la información de cada curso. 
* Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán:
* nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde)
* ,PrecioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (
* cinco), donde se alojarán los nombres de cada alumno. 
* A continuación, se implementarán los siguientes métodos:

     */
    public static void main(String[] args) {
        
        CursoServicio c1 = new CursoServicio();
        Curso c2 =c1.CrearCurso();
        c1.GananciaPorSemana(c2);
        
        
        
        
        
        
              
    }
    
}

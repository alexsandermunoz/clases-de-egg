/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 Un profesor particular está dando cursos para grupos de cinco alumnos
* y necesita un programa para organizar la información de cada curso. 
* Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán:
* nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde)
* ,PrecioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (
* cinco), donde se alojarán los nombres de cada alumno. 
* A continuación, se implementarán los siguientes métodos
 */
public class Curso {
    
    private String NombreCurso;
    private int CantidadHorasPorDia;
    private int CantidadDiasPorSemana;
    private String Turno;
    private int PrecioPorHora;
    private String[] Alumnos;

    public Curso() {
    }

    public Curso(String NombreCurso, int CantidadHorasPorDia, int CantidadDiasPorSemana, String Turno, int PrecioPorHora, String[] Alumnos) {
        this.NombreCurso = NombreCurso;
        this.CantidadHorasPorDia = CantidadHorasPorDia;
        this.CantidadDiasPorSemana = CantidadDiasPorSemana;
        this.Turno = Turno;
        this.PrecioPorHora = PrecioPorHora;
        this.Alumnos = Alumnos;
    }

    public String getNombreCurso() {
        return NombreCurso;
    }

    public void setNombreCurso(String NombreCurso) {
        this.NombreCurso = NombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return CantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int CantidadHorasPorDia) {
        this.CantidadHorasPorDia = CantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return CantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int CantidadDiasPorSemana) {
        this.CantidadDiasPorSemana = CantidadDiasPorSemana;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public int getPrecioPorHora() {
        return PrecioPorHora;
    }

    public void setPrecioPorHora(int PrecioPorHora) {
        this.PrecioPorHora = PrecioPorHora;
    }

    public String[] getAlumnos() {
        return Alumnos;
    }

    public void setAlumnos(String[] Alumnos) {
        this.Alumnos = Alumnos;
    }
    
    
    
    
            
    
    
    
    
    
    
}

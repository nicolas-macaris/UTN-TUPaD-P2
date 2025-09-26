/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Nicolás
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacionInicial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacionInicial;
    }

    public void mostrarInfo() {
        System.out.println(apellido + ", " + nombre + " - Curso: " + curso
                + " - Calificación: " + calificacion);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCurso() {
        return curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        if (calificacion > 10) calificacion = 10;
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) calificacion = 0;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Nicolás
 */
public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("Juan", "Perez", "Programacion II", 6.0);

        e.mostrarInfo();
        e.subirCalificacion(2.5);
        e.mostrarInfo();
        e.bajarCalificacion(5.0);
        e.mostrarInfo();
    }
}

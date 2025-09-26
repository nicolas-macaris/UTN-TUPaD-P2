/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Nicolás
 */
public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("Un libro", "Autor anonimo", 1943);
        l1.mostrarInfo();
        
        l1.setAnioPublicacion(-200);
        l1.mostrarInfo();
        
        l1.setAnioPublicacion(1944);
        l1.mostrarInfo();
    }
}

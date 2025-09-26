/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Nicolás
 */

public class Main {
    public static void main(String[] args) {
        Mascota m = new Mascota("Luna", "Perro", 2);

        m.mostrarInfo();

        m.cumplirAnios();
        m.cumplirAnios();

        m.mostrarInfo();
    }
}

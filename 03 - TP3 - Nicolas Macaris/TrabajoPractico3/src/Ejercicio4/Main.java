/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Nicolás
 */
public class Main {

    public static void main(String[] args) {

        Gallina g1 = new Gallina(1, 1);
        Gallina g2 = new Gallina(2, 2);

        g1.mostrarEstado();
        g2.mostrarEstado();

        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.ponerHuevo();
        g2.envejecer();
        g2.ponerHuevo();
        g2.ponerHuevo();

        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}

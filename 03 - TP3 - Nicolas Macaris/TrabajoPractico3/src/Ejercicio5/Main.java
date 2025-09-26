/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Nicolás
 */
public class Main {

    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial(50);
        nave.despegar();
        nave.mostrarEstado();

        nave.avanzar(60);
        nave.mostrarEstado();

        nave.recargar(20);
        nave.mostrarEstado();

        nave.avanzar(30);
        nave.mostrarEstado();
        
        nave.recargar(200);
        nave.recargar(-10);
    }
}

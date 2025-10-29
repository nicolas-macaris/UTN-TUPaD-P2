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
        Bateria bateria = new Bateria("BN-45", 5000);
        Usuario usuario = new Usuario("Ana", "33333333");
        Celular celular = new Celular("543333555555", "Xiaomi", "Redmi 12", bateria, usuario);

        celular.setUsuario(usuario);

        System.out.println(bateria);
        System.out.println(usuario);
        System.out.println(celular);
    }
}

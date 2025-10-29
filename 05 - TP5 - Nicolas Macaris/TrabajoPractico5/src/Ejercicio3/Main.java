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
        Autor autor = new Autor("Juan Perez", "Chilena");
        Editorial editorial = new Editorial("Editorial 1", "Av. Siempre Viva 742");
        Libro libro = new Libro("Biografia de Juan Perez", "978-987-609-123-4", autor, editorial);

        System.out.println(autor);
        System.out.println(editorial);
        System.out.println(libro);
    }
}

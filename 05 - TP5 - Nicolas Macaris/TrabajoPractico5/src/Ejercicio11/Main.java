/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Nicolás
 */
public class Main {

    public static void main(String[] args) {
        Artista artista = new Artista("Banda conocida", "Rock");
        Cancion cancion = new Cancion("Nombre de cancion", artista);
        new Reproductor().reproducir(cancion);
    }
}

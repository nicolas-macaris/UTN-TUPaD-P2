/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Nicolás
 */
public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion >= 0) {
            this.anioPublicacion = anioPublicacion;
        } else {
            this.anioPublicacion = 0;
        }
    }

    public void mostrarInfo() {
        String anioMsg = anioPublicacion == 0 ? " --- Año de publicación ingresado inválido ---" : "";
        System.out.println("Libro: \"" + titulo + "\" de " + autor
                + " (" + anioPublicacion + ") " + anioMsg + "");
    }
}

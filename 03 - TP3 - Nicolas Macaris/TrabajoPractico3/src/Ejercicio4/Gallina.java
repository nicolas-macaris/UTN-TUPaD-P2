/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Nicolás
 */
public class Gallina {

    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edadInicial) {
        this.idGallina = idGallina;
        this.edad = edadInicial;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos = huevosPuestos + 1;
    }

    public void envejecer() {
        setEdad(edad + 1);
    }

    public void mostrarEstado() {
        System.out.println("Gallina #" + idGallina
                + " | Edad: " + edad + " año(s)"
                + " | Huevos puestos: " + huevosPuestos);
    }

    public int getIdGallina() {
        return idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

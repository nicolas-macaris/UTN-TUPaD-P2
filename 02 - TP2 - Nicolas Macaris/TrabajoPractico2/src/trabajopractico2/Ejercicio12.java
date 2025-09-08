/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico2;

/**
 *
 * @author Nicolás
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        mostrarPrecios(precios);

        int indiceAModificar = 2;
        double nuevoPrecio = 129.99;

        precios[indiceAModificar] = nuevoPrecio;

        System.out.println("\nPrecios modificados:");

        mostrarPrecios(precios);
    }

    static void mostrarPrecios(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Precio: $" + arr[i]);
        }
    }
}

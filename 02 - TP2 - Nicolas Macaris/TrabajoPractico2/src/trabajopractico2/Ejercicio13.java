/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico2;

/**
 *
 * @author Nicolás
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);

        int indiceAModificar = 2;
        precios[indiceAModificar] = 129.99;

        System.out.println("\nPrecios modificados:");

        imprimirRecursivo(precios, 0);
    }

    static void imprimirRecursivo(double[] arr, int indice) {
        if (indice == arr.length) {
            return;
        }
        System.out.println("Precio: $" + arr[indice]);
        imprimirRecursivo(arr, indice + 1);
    }
}

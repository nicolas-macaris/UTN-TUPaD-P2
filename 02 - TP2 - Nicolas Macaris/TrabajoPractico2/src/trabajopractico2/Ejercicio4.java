/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico2;

/**
 *
 * @author Nicolás
 */
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = sc.next().toUpperCase();

        double descuento = obtenerDescuentoPorCategoria(categoria);
        if (descuento == -1) {
            System.out.println("No existe esa categoria.");
            return;
        }

        double precioFinal = calcularPrecioConDescuento(precio, categoria);

        System.out.println("Descuento aplicado: " + (int) (descuento * 100) + '%');
        System.out.println("Precio final: " + precioFinal);

        sc.close();
    }

    static double calcularPrecioConDescuento(double precio, String categoria) {
        double descuento = obtenerDescuentoPorCategoria(categoria);
        return precio - (precio * descuento);
    }

    static double obtenerDescuentoPorCategoria(String categoria) {
        switch (categoria) {
            case "A":
                return 0.10;
            case "B":
                return 0.15;
            case "C":
                return 0.20;
            default:
                return -1;
        }
    }
}

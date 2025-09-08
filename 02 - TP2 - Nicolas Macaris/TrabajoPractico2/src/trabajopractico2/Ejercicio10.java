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

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el stock actual del producto: ");
        
        int stockActual = sc.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        
        int cantidadVendida = sc.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        
        int cantidadRecibida = sc.nextInt();
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        if (nuevoStock < 0) {
            nuevoStock = 0;
        }
        
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
        
        sc.close();
    }

    // NuevoStock = StockActual − CantidadVendida + CantidadRecibida
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}

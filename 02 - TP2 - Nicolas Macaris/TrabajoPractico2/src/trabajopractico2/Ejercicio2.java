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

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int n1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int n2 = sc.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        int n3 = sc.nextInt();
        
        int mayor = obtenerMayor(n1, n2, n3);
        
        System.out.println("El mayor es: " + mayor);
        sc.close();
    }

    static int obtenerMayor(int a, int b, int c) {
        int mayor = a;

        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }

        return mayor;
    }
}

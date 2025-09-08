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

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sumaPares = 0;
        int num;
        
        System.out.print("Ingrese un número (0 para terminar): ");
        num = sc.nextInt();
        
        while (num != 0) {
            if (esPar(num)) {
                sumaPares += num;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            num = sc.nextInt();
        }
        
        System.out.println("La suma de los números pares es: " + sumaPares);
        
        sc.close();
    }

    static boolean esPar(int n) {
        return n % 2 == 0;
    }
}

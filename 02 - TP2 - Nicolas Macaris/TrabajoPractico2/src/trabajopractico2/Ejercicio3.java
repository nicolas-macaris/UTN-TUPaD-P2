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

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        String categoria = clasificarEdad(edad);
        
        System.out.println("Eres un " + categoria + ".");
        sc.close();
    }

    static String clasificarEdad(int edad) {
        if (edad < 12) {
            return "Niño";
        } else if (edad <= 17) {
            return "Adolescente";
        } else if (edad <= 59) {
            return "Adulto";
        } else {
            return "Adulto mayor";
        }
    }
}

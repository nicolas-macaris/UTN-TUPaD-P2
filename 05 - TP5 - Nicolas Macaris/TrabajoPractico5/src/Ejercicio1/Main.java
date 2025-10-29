/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Nicolás
 */
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Titular titular = new Titular("Lucía", "35.123.456");
        Pasaporte pasaporte = new Pasaporte("ABC123456", LocalDate.of(2024, 5, 20), titular,
                "foto_lucia.png", "PNG");

        System.out.println(pasaporte);
    }
}

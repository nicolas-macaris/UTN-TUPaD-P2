/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Nicolás
 */
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Carla", "carla@mail.com");
        Documento documento = new Documento(
                "Contrato", "Contenido del contrato...",
                "ABC123HASH", LocalDate.of(2025, 10, 1), usuario
        );

//        System.out.println(usuario);
        System.out.println(documento);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author Nicolás
 */
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Laura", "1155557777");
        Mesa mesa = new Mesa(12, 4);
        Reserva reserva = new Reserva(LocalDate.of(2025, 11, 10),
                LocalTime.of(20, 30),
                cliente, mesa);

        System.out.println(reserva);
    }
}

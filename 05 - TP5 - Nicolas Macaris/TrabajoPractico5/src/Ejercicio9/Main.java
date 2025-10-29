/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author Nicolás
 */
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("Lucía", "OSDE");
        Profesional prof = new Profesional("Dr. Ramírez", "Cardiología");
        CitaMedica cita = new CitaMedica(LocalDate.of(2025, 11, 15),
                LocalTime.of(9, 30), paciente, prof);

        System.out.println(cita);
    }
}

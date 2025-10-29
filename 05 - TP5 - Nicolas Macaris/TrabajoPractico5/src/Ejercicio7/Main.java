/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Nicolás
 */
public class Main {

    public static void main(String[] args) {
        Motor motor = new Motor("Nafta 2.0", "SN-MTR-001");
        Conductor conductor = new Conductor("Sofía", "B1234567");
        Vehiculo vehiculo = new Vehiculo("AA123BB", "Corolla", motor, conductor);

        System.out.println(vehiculo);
    }
}

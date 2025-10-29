/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author Nicolás
 */
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Titular titular = new Titular("Nicolás", "30.123.456");
        CuentaBancaria cuenta = new CuentaBancaria("0000003100000001234567", 150000.0,
                "HASH-XYZ", LocalDate.of(2025, 10, 1), titular);

//        System.out.println("Clave: " + cuenta.getClave().getCodigo());
        System.out.println(cuenta);
    }
}

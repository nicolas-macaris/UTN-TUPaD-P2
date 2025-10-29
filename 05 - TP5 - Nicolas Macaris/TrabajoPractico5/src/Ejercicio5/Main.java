/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Nicolás
 */
public class Main {

    public static void main(String[] args) {
        Propietario propietario = new Propietario("Mica", "33333333");
        PlacaMadre mother = new PlacaMadre("B550M-Plus", "AMD B550");
        Computadora pc = new Computadora("Lenovo", "SN-ABC-999", mother, propietario);

        System.out.println(pc);
    }
}

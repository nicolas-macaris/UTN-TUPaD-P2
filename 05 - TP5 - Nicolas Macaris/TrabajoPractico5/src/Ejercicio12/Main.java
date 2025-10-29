/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author Nicolás
 */
public class Main {

    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("María", "20-30123456-7");
        Impuesto imp = new Impuesto(100000.0, contribuyente);
        Calculadora calc = new Calculadora();
        System.out.println("Impuesto: " + imp);
        System.out.println("Resultado cálculo: " + calc.calcular(imp));
    }
}

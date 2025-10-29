/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author Nicolás
 */
public class Calculadora {

    public double calcular(Impuesto impuesto) {
        // IVA
        return impuesto.getMonto() * 0.21;
    }
}

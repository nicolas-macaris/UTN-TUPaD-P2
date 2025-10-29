/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Nicolás
 */
import java.time.YearMonth;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Río", "30123456789");
        Cliente cliente = new Cliente("Marcos", "35555555");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4509123456789010", YearMonth.of(2027, 6), banco, cliente);

        System.out.println(banco);
        System.out.println(cliente);
        System.out.println(tarjeta);
    }
}

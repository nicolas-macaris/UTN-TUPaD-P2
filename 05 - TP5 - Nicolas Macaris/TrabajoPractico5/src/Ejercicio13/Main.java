/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author Nicolás
 */
public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan", "juan@mail.com");
        GeneradorQR gen = new GeneradorQR();
        CodigoQR qr = gen.generar("UTN-TP5-RELACIONES", usuario);

        System.out.println(qr);
        System.out.println("QR para: " + qr.getUsuario().getNombre() + " con valor: " + qr.getValor());
    }
}

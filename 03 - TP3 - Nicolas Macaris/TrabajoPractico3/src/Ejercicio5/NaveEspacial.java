/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Nicolás
 */
public class NaveEspacial {

    private int combustible;
    private final int capacidadMax = 100;

    public NaveEspacial(int combustibleInicial) {
        if (combustibleInicial <= capacidadMax) {
            this.combustible = combustibleInicial;
        } else {
            this.combustible = capacidadMax;
        }
    }

    public void despegar() {
        System.out.println("Despegando!!");
    }

    public void mostrarEstado() {
        System.out.println("Combustible actual: " + combustible + " / " + capacidadMax + " L");
    }

    public void recargar(int litros) {
        if (litros <= 0) {
            System.out.println("La cantidad a recargar debe ser positiva.");
            return;
        }
        System.out.println("Recargando combustible.");
        combustible += litros;
        if (combustible > capacidadMax) {
            combustible = capacidadMax;
            System.out.println("Se superó la capacidad máxima de carga. Topeado a 100 L.");
        }
    }

    public void avanzar(int km) {
        if (km <= 0) {
            System.out.println("La distancia debe ser positiva.");
            return;
        }
        if (km <= combustible) {
            combustible -= km; // 1 km = 1 L
            System.out.println("La nave avanzó " + km + " km.");
        } else {
            System.out.println("Combustible insuficiente para avanzar " + km + " km.");
        }
    }
}

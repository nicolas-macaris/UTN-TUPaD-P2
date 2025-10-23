/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico4;

/**
 *
 * @author Nicolás
 */
public class PruebaEmpleado {
    public static void main(String[] args) {

        Empleado e1 = new Empleado(100, "Ana López", "Desarrolladora", 150000.0);

        Empleado e2 = new Empleado("Juan Pérez", "Tester");
        Empleado e3 = new Empleado("Lucía Gómez", "Soporte");

        e1.actualizarSalario(10.0);  // +10% a e1
        e2.actualizarSalario(20000); // +$20.000 fijos a e2
        e3.actualizarSalario(5.0);   // +5% a e3

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
}

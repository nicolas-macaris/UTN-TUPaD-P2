/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author Nicolás
 */
public class EditorVideo {

    public Render exportar(String formato, Proyecto proyecto) {
        return new Render(formato, proyecto);
    }
}

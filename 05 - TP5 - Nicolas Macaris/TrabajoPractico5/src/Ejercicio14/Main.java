/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;

/**
 *
 * @author Nicolás
 */
public class Main {

    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Corto", 20);
        EditorVideo editor = new EditorVideo();
        Render render = editor.exportar("AVI", proyecto);

        System.out.println("Render en " + render.getFormato() + " del proyecto " + render.getProyecto().getNombre());
    }
}

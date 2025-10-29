/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Nicolás
 */
import java.time.LocalDate;

public class FirmaDigital {

    private String codigoHash;
    private LocalDate fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, LocalDate fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital{hash='" + codigoHash + "', fecha=" + fecha
                + ", usuario=" + (usuario != null ? usuario.getNombre() : "(sin usuario)") + "}";
    }
}

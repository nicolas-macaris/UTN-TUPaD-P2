/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.time.YearMonth;

/**
 *
 * @author Nicolás
 */
public class TarjetaDeCredito {

    private String numero;
    private YearMonth fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, YearMonth fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public TarjetaDeCredito(String numero, YearMonth fechaVencimiento, Banco banco, Cliente cliente) {
        this(numero, fechaVencimiento, banco);
        setCliente(cliente);
    }

    public String getNumero() {
        return numero;
    }

    public YearMonth getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{numero='" + numero + "', vencimiento=" + fechaVencimiento
                + ", banco=" + banco.getNombre()
                + ", cliente=" + cliente.getNombre() + "}";
    }
}

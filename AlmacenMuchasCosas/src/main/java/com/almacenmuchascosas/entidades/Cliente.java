package com.almacenmuchascosas.entidades;

/**
 *
 * @author angelrg
 */
public class Cliente extends Entidad {

    double descuento;

    public Cliente() {
    }

    public Cliente(String NIT, String nombre, String direccion, double descuento) {
        super(NIT, nombre, direccion);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

}

package com.almacenmuchascosas.entidades;

/**
 *
 * @author angelrg
 */
public class Cliente extends Entidad {

    private final double desc = 0.1;

    double descuento;

    public Cliente() {
    }

    public Cliente(String NIT, String nombre, String direccion, boolean descuento) {
        super(NIT, nombre, direccion);
        if (descuento) {
            this.descuento = desc;
        } else {
            this.descuento = 0;
        }
    }

    public double getDescuento() {
        return descuento * 100;
    }

    public void setDescuento(boolean descuento) {
        if (descuento) {
            this.descuento = desc;
        } else {
            this.descuento = 0;
        }
    }

    @Override
    public void printMe() {
        System.out.println("NIT: " + getNIT() + ", Nombre: " + getNombre() + ", Direccion: " + getDireccion() + ", Descuento: " + getDescuento());
    }

}

package com.almacenmuchascosas.articulo;

/**
 *
 * @author angelrg
 */
public class Transaccion {

    Articulo articulo;
    double cantidad;
    double costo;

    public Transaccion() {
    }

    public Transaccion(Articulo articulo, double cantidad, double costo) {
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

}

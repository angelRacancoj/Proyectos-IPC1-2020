package com.almacenmuchascosas.articulo;

/**
 *
 * @author angelrg
 */
public class Articulo {

    int codigo;
    String nombre;
    double existencia;
    double precio;

    public Articulo() {
    }

    public Articulo(int codigo, String nombre, double existencia, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.existencia = existencia;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getExistencia() {
        return existencia;
    }

    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}

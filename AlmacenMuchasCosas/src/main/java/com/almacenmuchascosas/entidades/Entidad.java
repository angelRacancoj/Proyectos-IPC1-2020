package com.almacenmuchascosas.entidades;

/**
 *
 * @author angelrg
 */
public class Entidad {

    String NIT;
    String nombre;
    String direccion;

    public Entidad() {
    }

    public Entidad(String NIT, String nombre, String direccion) {
        this.NIT = NIT;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}

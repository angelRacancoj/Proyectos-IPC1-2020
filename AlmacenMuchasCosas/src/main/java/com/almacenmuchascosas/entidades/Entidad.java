package com.almacenmuchascosas.entidades;

/**
 *
 * @author angelrg
 */
public class Entidad {

    private String NIT;
    private String nombre;
    private String direccion;

    /**
     * Esto solo me sirve para crear el objeto entidad y luego llenar sus
     * atributos
     */
    public Entidad() {
    }

    /**
     * Esto me es util para crear el objeto Entidad con sus atributos desde el
     * inicio
     *
     * @param NIT
     * @param nombre
     * @param direccion
     */
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

    /**
     * Este metodo me es util para imprimir la caracteristicas de este objeto
     * Etidad
     */
    public void printMe() {
        System.out.println("NIT: " + this.NIT + ", Nombre: " + this.nombre + ", Direccion:" + this.direccion);
    }

}

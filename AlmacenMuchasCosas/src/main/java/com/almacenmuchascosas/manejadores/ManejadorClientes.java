/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacenmuchascosas.manejadores;

import com.almacenmuchascosas.entidades.Cliente;

/**
 *
 * @author angelrg
 */
public class ManejadorClientes {

    public Cliente[] crearDatos() {
        Cliente[] clientes = new Cliente[10];
        clientes[0] = new Cliente(randNIT(), "pepe", "ciudad", false);
        clientes[0].setDescuento(true);
        clientes[1] = new Cliente("2", "carlos", "ciudad", false);
        clientes[2] = new Cliente("3", "jose", "ciudad", false);
        clientes[3] = new Cliente("4", "mario", "ciudad", false);
        clientes[4] = new Cliente("5", "david", "ciudad", false);
        clientes[5] = new Cliente("6", "karla", "ciudad", false);
        clientes[6] = new Cliente("7", "Ale", "ciudad", true);
        clientes[7] = new Cliente("8", "Ana", "ciudad", true);
        clientes[8] = new Cliente("9", "Lucy", "ciudad", true);
        clientes[9] = new Cliente("10", "Dorys", "ciudad", false);
        return clientes;
    }

    public void printClientes(Cliente[] clientes) {
        for (int i = 0; i < clientes.length; i++) {
            clientes[i].printMe();
        }
    }

    private String randNIT() {
        int numero = (int) (Math.random() * 1000);
        return String.valueOf(numero);
    }
}

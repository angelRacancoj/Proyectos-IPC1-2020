package com.almacenmuchascosas;

import com.almacenmuchascosas.entidades.Cliente;
import com.almacenmuchascosas.manejadores.ManejadorClientes;

/**
 *
 * @author angelrg
 */
public class Almacen {
    
    ManejadorClientes clientesM = new ManejadorClientes();
    
    Cliente[] clientes;
    
    public void inicio() {
        clientes = clientesM.crearDatos();
        clientesM.printClientes(clientes);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturar.Modelo;

import java.util.ArrayList;

/**
 *
 * @author SBarc
 */
public class Consecutivos {
    private int nClientes;
    private int nFacturas;
    private int nProductos;
    private int nEstArticulos;
    private int nEstClientes;
    private int nDetFacturas;

    public Consecutivos() {
    }

    public int getnDetFacturas() {
        return nDetFacturas;
    }

    public void setnDetFacturas(int nDetFacturas) {
        this.nDetFacturas = nDetFacturas;
    }

    public int getnClientes() {
        return nClientes;
    }

    public void setnClientes(int nClientes) {
        this.nClientes = nClientes;
    }

    public int getnFacturas() {
        return nFacturas;
    }

    public void setnFacturas(int nFacturas) {
        this.nFacturas = nFacturas;
    }

    public int getnProductos() {
        return nProductos;
    }

    public void setnProductos(int nProductos) {
        this.nProductos = nProductos;
    }

    public int getnEstArticulos() {
        return nEstArticulos;
    }

    public void setnEstArticulos(int nEstArticulos) {
        this.nEstArticulos = nEstArticulos;
    }

    public int getnEstClientes() {
        return nEstClientes;
    }

    public void setnEstClientes(int nEstClientes) {
        this.nEstClientes = nEstClientes;
    }

}
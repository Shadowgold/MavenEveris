/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utn.sistema.empresa;

import edu.utn.sistema.empresa.base.Direccion;
import edu.utn.sistema.empresa.base.Documento;
import edu.utn.sistema.usuarios.Persona;
import edu.utn.sistema.ventas.Factura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Agustin
 */
public class Vendedor extends Persona{
    
    //ATRIBUTOS
    private int nroVendedor;

    //RELACIONES
    private Area area;
    private List<Factura> facturas;
    
    //CONSTRUCTOR
    public Vendedor() {
        facturas = new ArrayList<>();
    }
    public Vendedor(int nroVendedor, Area area, Factura factura) {
        this.nroVendedor = nroVendedor;
        this.area = area;
        this.facturas = new ArrayList<>();
        this.facturas.add(factura);
    }
    public Vendedor(int nroVendedor, Area area, List<Factura> facturas) {
        this.nroVendedor = nroVendedor;
        this.area = area;
        this.facturas = facturas;
    }
    public Vendedor(int nroVendedor, Area area, List<Factura> facturas, String nombre, String apellido, int edad, Direccion direccion, Documento dni) {
        super(nombre, apellido, edad, direccion, dni);
        this.nroVendedor = nroVendedor;
        this.area = area;
        this.facturas = facturas;
    }
    
    //GETTERS AND SETTERS
    public int getNroVendedor() {
        return nroVendedor;
    }
    public void setNroVendedor(int nroVendedor) {
        this.nroVendedor = nroVendedor;
    }

    public Area getArea() {
        return area;
    }
    public void setArea(Area area) {
        this.area = area;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }
    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
    public void addFactura(Factura factura){
        this.facturas.add(factura);
    }

}

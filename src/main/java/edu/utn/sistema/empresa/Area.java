/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utn.sistema.empresa;

import edu.utn.sistema.empresa.base.Direccion;
import edu.utn.sistema.empresa.entidades.EntityBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Agustin
 */
public class Area extends EntityBean implements Serializable{
    
    //ATRIBUTOS
    private static final long serialVersionUID = 1L;
    private String nombreArea;
    private String descripcionArea;

    //RELACIONES
    private List<Vendedor> vendedores;
    private Direccion direccion;
    
    //CONSTRUCTORES
    public Area() {
        vendedores = new ArrayList<>();
    }
    public Area(String nombreArea, String descripcionArea, Direccion direccion) {
        this.nombreArea = nombreArea;
        this.descripcionArea = descripcionArea;
        this.direccion = direccion;
    }
    public Area(String nombreArea, String descripcionArea,Direccion direccion, Vendedor vendedor) {
        this.nombreArea = nombreArea;
        this.descripcionArea = descripcionArea;
        this.direccion = direccion;
        this.vendedores = new ArrayList<>();
        this.vendedores.add(vendedor);
    }
    public Area(String nombreArea, String descripcionArea, List<Vendedor> vendedores, Direccion direccion) {
        this.nombreArea = nombreArea;
        this.descripcionArea = descripcionArea;
        this.vendedores = vendedores;
        this.direccion = direccion;
    }

    
    //GETTERS AND SETTERS
    public String getNombreArea() {
        return nombreArea;
    }
    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getDescripcionArea() {
        return descripcionArea;
    }
    public void setDescripcionArea(String descripcionArea) {
        this.descripcionArea = descripcionArea;
    }

    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }
    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }
    public void addVendedor(Vendedor vendedor){
        this.vendedores.add(vendedor);
    }
    
}

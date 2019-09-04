/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utn.sistema.empresa;

/**
 *
 * @author Agustin
 */
public class Vendedor {
    
    //ATRIBUTOS
    private int nroVendedor;
    private String nombreVendedor;
    private int DNIVendedor;
    
    //RELACIONES
    private Area areaVendedor;
    
    //CONSTRUCTOR
    public Vendedor() {}
    
    //GETTERS AND SETTERS

    public int getNroVendedor() {
        return nroVendedor;
    }
    public void setNroVendedor(int nroVendedor) {
        this.nroVendedor = nroVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }
    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public int getDNIVendedor() {
        return DNIVendedor;
    }
    public void setDNIVendedor(int DNIVendedor) {
        this.DNIVendedor = DNIVendedor;
    }

    public Area getAreaVendedor() {
        return areaVendedor;
    }
    public void setAreaVendedor(Area areaVendedor) {
        this.areaVendedor = areaVendedor;
    }
    
}

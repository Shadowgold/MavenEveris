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
public class Proveedor {
    //ATRIBUTOS
    private String razonSocial;
    private int nroProveedor;

    //CONSTRUCTOR
    public Proveedor() {}

    //GETTERS AND SETTERS
    public String getRazonSocial() {
        return razonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getNroProveedor() {
        return nroProveedor;
    }
    public void setNroProveedor(int nroProveedor) {
        this.nroProveedor = nroProveedor;
    }
    
    
    
}

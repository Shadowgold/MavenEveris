/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utn.sistema.empresa;

import edu.utn.sistema.usuarios.Persona;

/**
 *
 * @author Agustin
 */
public class Vendedor extends Persona{
    
    //ATRIBUTOS
    private int nroVendedor;

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

    public Area getAreaVendedor() {
        return areaVendedor;
    }
    public void setAreaVendedor(Area areaVendedor) {
        this.areaVendedor = areaVendedor;
    }
    
}

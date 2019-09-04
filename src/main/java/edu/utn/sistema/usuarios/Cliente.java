/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utn.sistema.usuarios;

import edu.utn.sistema.cuentas.Movimientos_CtaCte;

/**
 *
 * @author fabri
 */
public class Cliente extends Persona{
    private int nroCliente;
    private String tipoCliente;
    private Movimientos_CtaCte movCtaCte; 

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Movimientos_CtaCte getMovCtaCte() {
        return movCtaCte;
    }

    public void setMovCtaCte(Movimientos_CtaCte movCtaCte) {
        this.movCtaCte = movCtaCte;
    }

  
    
    
}

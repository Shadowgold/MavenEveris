/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utn.sistema.cuentas;

import edu.utn.sistema.usuarios.Cliente;
//sdcsa
/**
 *
 * @author fabri
 */
public class Movimientos_CtaCte {
    private Cuentas cuenta;

    
   
    
    
    
    private String tipoMovimiento;
    
    private String descripcionMovimiento;
    
    private Cliente cliente;

    public Movimientos_CtaCte() {
    }

    public Movimientos_CtaCte(Cuentas cuenta, String tipoMovimiento, String descripcionMovimiento, Cliente cliente) {
        this.cuenta = cuenta;
        this.tipoMovimiento = tipoMovimiento;
        this.descripcionMovimiento = descripcionMovimiento;
        this.cliente = cliente;
    }
    
    

    /**
     * Get the value of cliente
     *
     * @return the value of cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Set the value of cliente
     *
     * @param cliente new value of cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    /**
     * Get the value of descripcionMovimiento
     *
     * @return the value of descripcionMovimiento
     */
    public String getDescripcionMovimiento() {
        return descripcionMovimiento;
    }

    /**
     * Set the value of descripcionMovimiento
     *
     * @param descripcionMovimiento new value of descripcionMovimiento
     */
    public void setDescripcionMovimiento(String descripcionMovimiento) {
        this.descripcionMovimiento = descripcionMovimiento;
    }


    /**
     * Get the value of tipoMovimiento
     *
     * @return the value of tipoMovimiento
     */
    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    /**
     * Set the value of tipoMovimiento
     *
     * @param tipoMovimiento new value of tipoMovimiento
     */
    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    
    public Cuentas getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuentas cuenta) {
        this.cuenta = cuenta;
    }
    
    
}

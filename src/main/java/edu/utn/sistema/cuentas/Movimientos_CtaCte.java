/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utn.sistema.cuentas;

/**
 *
 * @author fabri
 */
public class Movimientos_CtaCte {
    private Cuentas cuenta;

    public Movimientos_CtaCte() {
    }

    public Movimientos_CtaCte(Cuentas cuenta) {
        this.cuenta = cuenta;
    }
    
    
    
    public Cuentas getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuentas cuenta) {
        this.cuenta = cuenta;
    }
    
    
}

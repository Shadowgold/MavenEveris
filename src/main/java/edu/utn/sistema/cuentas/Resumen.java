/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utn.sistema.cuentas;

import edu.utn.sistema.ventas.Formulario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabri
 */
public class Resumen extends Formulario {
    private List<Movimientos_CtaCte> movCtaCte = new ArrayList<>();
    private int nroResumen;
    private String fecha;  

    public Resumen(int nroResumen, String fecha) {
        this.nroResumen = nroResumen;
        this.fecha = fecha;
    }    

    public List<Movimientos_CtaCte> getMovCtaCte() {
        return movCtaCte;
    }

    public void setMovCtaCte(List<Movimientos_CtaCte> movCtaCte) {
        this.movCtaCte = movCtaCte;
    }


    public int getNroResumen() {
        return nroResumen;
    }

    public void setNroResumen(int nroResumen) {
        this.nroResumen = nroResumen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}

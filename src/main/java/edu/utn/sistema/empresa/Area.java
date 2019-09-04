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
public class Area {
    
    private String nombreArea;
    
    private String descripcionArea;

    public Area() {
    }

    public Area(String nombreArea, String descripcionArea) {
        this.nombreArea = nombreArea;
        this.descripcionArea = descripcionArea;
    }

    
    
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
    
    
    
}


package edu.utn.sistema.empresa.base;


public class Pais {
    
    //Atributos
    private String nombrePais;
    
    
    //Constructor por Defecto
    public Pais() {
    }
    
    
    //Constructor Sobrecargado
    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    
    
    //Get and Set
    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    
    
    
}

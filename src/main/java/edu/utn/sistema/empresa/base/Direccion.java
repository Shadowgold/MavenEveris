
package edu.utn.sistema.empresa.base;

import edu.utn.sistema.usuarios.Persona;


public class Direccion {
    
    
    //atributos
    private Persona persona;
    private Pais pais;
    private String calle;
    private String numero;
    private String localidad;
    
    
    //constructor por defecto
    public Direccion() {
    }
    
    
    //constructor sobrecargado
    public Direccion(Pais pais, String calle, String numero, String localidad) {
        this.pais = pais;
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
    }
    
    
    //Get and Set
    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    
    
    
}


package edu.utn.sistema.empresa.base;


public class Direccion {
    
    private Pais pais;
    private String calle;
    private String numero;
    private String localidad;

    public Direccion() {
    }

    public Direccion(Pais pais, String calle, String numero, String localidad) {
        this.pais = pais;
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
    }

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

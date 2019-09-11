
package edu.utn.sistema.empresa.base;

import edu.utn.sistema.usuarios.Persona;

public class Documento {
    
    //Atributos
    private Persona persona;
    private int Dni;
    
    //Constructor por Defecto
    public Documento() {
    }
    
    //Cosntructor Sobrecargado
    public Documento(Persona persona, int Dni) {
        this.persona = persona;
        this.Dni = Dni;
    }
    
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getDni() {
        return Dni;
    }
    public void setDni(int Dni) {
        this.Dni = Dni;
    }
    
}

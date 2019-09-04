
package edu.utn.sistema.empresa.base;

import edu.utn.sistema.usuarios.Persona;

public class Documento {
    
    private Persona persona;
    private int Dni;

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

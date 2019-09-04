
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
    
}

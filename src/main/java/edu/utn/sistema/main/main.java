
package edu.utn.sistema.main;

import edu.utn.sistema.cuentas.Cuentas;
import edu.utn.sistema.cuentas.Movimientos_CtaCte;
import edu.utn.sistema.cuentas.Resumen;
import edu.utn.sistema.empresa.base.Direccion;
import edu.utn.sistema.empresa.base.Documento;
import edu.utn.sistema.empresa.base.Pais;
import edu.utn.sistema.usuarios.Cliente;
import edu.utn.sistema.ventas.Formulario;


public class main {


    public static void main(String[] args) {
        
        Pais pais = new Pais("Argentina");
        Direccion domicilio = new Direccion(pais, "Falsa", "123", "Ciudad");
        Documento documento = new Documento();
        documento.setDni(123451);
        Cliente cliente = new Cliente(1, "Consumidor Final", "Pepe", "Argento", domicilio, 40, documento);
        
        Cuentas cuenta = new Cuentas(123141231);
        Movimientos_CtaCte mov = new Movimientos_CtaCte(cuenta, "Debito", "Compra Super Vea", cliente);
        Formulario formulario = new Formulario();
        Resumen resumen = new Resumen(123123, "12-Oct-2019");
        
        Formulario f = new Formulario();
        f.crearPdf();
    }
    
}

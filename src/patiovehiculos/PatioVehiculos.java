/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patiovehiculos;

import patiovehiculos.modelo.Vendedor;

/**
 *
 * @author miltonlab
 */
public class PatioVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vendedor v = new Vendedor();
        v.setCodigo("E001");
        v.setCedula("110455645");
        v.setNombres("Juan");
        v.setApellidos("Perez");
        System.out.println(v);
        System.out.println(v.registro());
        
    }
    
}

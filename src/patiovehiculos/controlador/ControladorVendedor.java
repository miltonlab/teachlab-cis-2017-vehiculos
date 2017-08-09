/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patiovehiculos.controlador;

import java.util.ArrayList;
import patiovehiculos.modelo.Vendedor;

/**
 *
 * @author miltonlab
 */
public class ControladorVendedor {
    
    private ArrayList<Vendedor> listaVendedores = new ArrayList<Vendedor>();

    public ControladorVendedor() {
        this.cargarVendedores();
    }

    public ArrayList<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }
    
    public boolean cargarVendedores(){
        Vendedor v = new Vendedor("E001", "111333454", "Ana Maria", "Burneo");
        listaVendedores.add(v);
        listaVendedores.add(new Vendedor("E002", "1134444444", "Juan José", "Suarez"));
        listaVendedores.add(new Vendedor("E003", "07112435535", "Santiago", "Pineda"));
        return true;
    }

}

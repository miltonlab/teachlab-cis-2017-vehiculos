/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patiovehiculos.controlador;

import java.util.ArrayList;
import patiovehiculos.Archivos;
import patiovehiculos.modelo.Vehiculo;

/**
 *
 * @author miltonlab
 */
public class ControladorVehiculo {
    
    private ArrayList<Vehiculo> listaVehiculos  = new ArrayList<Vehiculo>();

    public ControladorVehiculo() {
        this.cargarVehiculos();
    }

    
    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    
    public boolean cargarVehiculos(){
        /*this.listaVehiculos.add(new Vehiculo("LBA-2027", "Chevrolet", 2005, 24000, 0.15));
        this.listaVehiculos.add(new Vehiculo("PIDF-2222", "Ford", 2007, 12000, 0.1));
        this.listaVehiculos.add(new Vehiculo("ABLT-1234", "KIA", 2002, 25500, 0.1));
        this.listaVehiculos.add(new Vehiculo("LBAC-4567", "Mazda", 2011, 27000, 0.13));*/
        String contenido = Archivos.leer("/tmp/vehiculos.txt");
        String [] lineas = contenido.split("\n");
        for (String l : lineas){
            String [] campos = l.split(",");
            listaVehiculos.add(new Vehiculo(campos[0], campos[1], 
                    Integer.parseInt(campos[2]), 
                    Double.parseDouble(campos[3]),
                    Double.parseDouble(campos[4])));
            
        } 
        
        return true;
    }

    public void agregarVehiculo(Vehiculo v){
        this.listaVehiculos.add(v);
    }
}

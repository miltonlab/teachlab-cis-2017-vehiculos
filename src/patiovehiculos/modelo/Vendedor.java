/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patiovehiculos.modelo;

/**
 *
 * @author miltonlab
 */
public class Vendedor {
    
    private String codigo;

    private String cedula;
    
    private String nombres;

    private String apellidos;    

    public Vendedor() {
    }

    public Vendedor(String codigo, String cedula, String nombres, String apellidos) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Get the value of apellidos
     *
     * @return the value of apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Set the value of apellidos
     *
     * @param apellidos new value of apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        //return "Vendedor{" + "nombres=" + nombres + ", apellidos=" + apellidos + '}';
        return nombres + " " + apellidos;
    }

    public String registro(){
        String linea = "";
        linea = this.codigo + ";" + this.cedula + ";" + this.nombres + ";" + this.apellidos + "\n";
        return linea;
    }
    
}

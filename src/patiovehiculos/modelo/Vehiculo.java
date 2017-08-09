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
public class Vehiculo {
    
    private String placa;

    private String marca;
    
    private int año;

    private double valor;
    
    /* Porcentaje en la venta */
    private double comision;

    public Vehiculo(String placa, String marca, int año, double valor, double comision) {
        this.placa = placa;
        this.marca = marca;
        this.año = año;
        this.valor = valor;
        this.comision = comision;
    }

    public Vehiculo() {
    }

    
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Get the value of placa
     *
     * @return the value of placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Set the value of placa
     *
     * @param placa new value of placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

}

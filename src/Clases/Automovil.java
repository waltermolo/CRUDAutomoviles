/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Automovil {
    private String marca;
    private String modelo;
    private int anno;
    private int cilindraje;
    private int cantidadAsientos;
    private String placa;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Automovil() {
    }

    public Automovil(String marca, String modelo, int anno, int cilindraje, int cantidadAsientos, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
        this.cilindraje = cilindraje;
        this.cantidadAsientos = cantidadAsientos;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", modelo=" + modelo + ", anno=" + anno + ", cilindraje=" + cilindraje + ", cantidadAsientos=" + cantidadAsientos + ", placa=" + placa + '}';
    }
    
    
    
    
    
}

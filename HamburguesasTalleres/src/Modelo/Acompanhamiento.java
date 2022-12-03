/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vchin
 */
public class Acompanhamiento {
    private enumAcompanhamiento nombre;
    private Float precio;

    public Acompanhamiento() {
    }

    public Acompanhamiento(enumAcompanhamiento nombre, Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public enumAcompanhamiento getNombre() {
        return nombre;
    }

    public void setNombre(enumAcompanhamiento nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    
    
}

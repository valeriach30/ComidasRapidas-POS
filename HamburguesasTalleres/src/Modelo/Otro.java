/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vchin
 */
public class Otro {
    private enumOtros nombre;
    private Float precio;

    public Otro() {
    }

    public Otro(enumOtros nombre, Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public enumOtros getNombre() {
        return nombre;
    }

    public void setNombre(enumOtros nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    
}

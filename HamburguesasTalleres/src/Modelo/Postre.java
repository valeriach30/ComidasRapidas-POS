/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vchin
 */
public class Postre {
    private enumPostre nombre;
    private Float precio;

    public Postre() {
    }

    public Postre(enumPostre nombre, Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public enumPostre getNombre() {
        return nombre;
    }

    public void setNombre(enumPostre nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    
    
}

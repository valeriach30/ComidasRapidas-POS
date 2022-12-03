/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vchin
 */
public class Combo {
    private enumCombo nombre;
    private Hamburguesa hamburugesa;
    private Acompanhamiento acompanhamiento;
    private Bebida bebida;
    private Float precio;

    public Combo() {
    }

    public Combo(enumCombo nombre, Hamburguesa hamburugesa, Acompanhamiento acompanhamiento, Bebida bebida, Float precio) {
        this.nombre = nombre;
        this.hamburugesa = hamburugesa;
        this.acompanhamiento = acompanhamiento;
        this.bebida = bebida;
        this.precio = precio;
    }

    public enumCombo getNombre() {
        return nombre;
    }

    public void setNombre(enumCombo nombre) {
        this.nombre = nombre;
    }

    public Hamburguesa getHamburugesa() {
        return hamburugesa;
    }

    public void setHamburugesa(Hamburguesa hamburugesa) {
        this.hamburugesa = hamburugesa;
    }

    public Acompanhamiento getAcompanhamiento() {
        return acompanhamiento;
    }

    public void setAcompanhamiento(Acompanhamiento acompanhamiento) {
        this.acompanhamiento = acompanhamiento;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    
    
}

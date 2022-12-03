/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vchin
 */
public class Bebida {
    private String nombre;
    private Float precio;
    private Integer tamanho;

    public Bebida() {
    }

    public Bebida(String nombre, Float precio, Integer tamanho) {
        this.nombre = nombre;
        this.precio = precio;
        this.tamanho = tamanho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }
    
    
}

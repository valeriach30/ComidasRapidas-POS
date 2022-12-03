/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vchin
 */
public class Artesanal extends Hamburguesa{
    private enumTipoArtesanal tipo;

    public Artesanal(enumTipoArtesanal tipo) {
        this.tipo = tipo;
    }

    public Artesanal(enumTipoArtesanal tipo, String nombre, Integer precio) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public Artesanal() {
    }

    public enumTipoArtesanal getTipo() {
        return tipo;
    }

    public void setTipo(enumTipoArtesanal tipo) {
        this.tipo = tipo;
    }
    
    
}

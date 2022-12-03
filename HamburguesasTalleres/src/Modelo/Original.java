/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vchin
 */
public class Original extends Hamburguesa{
    private enumTipoOriginal tipo;

    public Original(String nombre, Integer precio, enumTipoOriginal tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }


    public enumTipoOriginal getTipo() {
        return tipo;
    }

    public void setTipo(enumTipoOriginal tipo) {
        this.tipo = tipo;
    }
    
}

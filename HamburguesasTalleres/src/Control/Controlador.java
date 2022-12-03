/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Artesanal;
import Modelo.Original;
import Modelo.Pedido;
import Modelo.enumTipoArtesanal;
import Modelo.enumTipoOriginal;

/**
 *
 * @author vchin
 */
public class Controlador {
    
    public Pedido pedido = new Pedido();
    
    public Controlador() {
    }
    
    public void agregarOriginal(Integer precio, Integer cantidad, enumTipoOriginal tipo, String nombre){
        for (int i = 0; i < cantidad; i++) {
            Original hamburguesa = new Original(nombre, precio, tipo);
            pedido.agregarHamburguesa(hamburguesa);
        }
    }
    
    public void agregarArtesanal(Integer precio, Integer cantidad, enumTipoArtesanal tipo, String nombre){
        for (int i = 0; i < cantidad; i++) {
            Artesanal hamburguesa = new Artesanal(tipo, nombre, precio);
            pedido.agregarHamburguesa(hamburguesa);
        }
    }
    
    
}

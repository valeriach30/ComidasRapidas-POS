/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vchin
 */
public class Pedido {
    private ArrayList<Hamburguesa> hamburguesas = new ArrayList<Hamburguesa>();
    private ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
    private ArrayList<Acompanhamiento> acompanhamientos = new ArrayList<Acompanhamiento>();
    private ArrayList<Otro> otrosPlatos = new ArrayList<Otro>();
    private Integer cantidadPostres;
    private ArrayList<Combo> combos = new ArrayList<Combo>();
    private Float total;
    private Date fecha;

    public Pedido() {
    }

    public Pedido(Integer cantidadPostres, Float total, Date fecha) {
        this.cantidadPostres = cantidadPostres;
        this.total = total;
        this.fecha = fecha;
    }

    // --------------- AGREGAR A LISTAS ---------------
    public void agregarHamburguesa(Hamburguesa hamb){
        if(hamburguesas != null){
            hamburguesas.add(hamb);
        }
        else{
            ArrayList<Hamburguesa> nuevashambuerguesas = new ArrayList<Hamburguesa>();
            nuevashambuerguesas.add(hamb);
            this.hamburguesas = nuevashambuerguesas;
        }
    }
    
    public void agregarBebida(Bebida bebida){
        if(bebidas != null){
            bebidas.add(bebida);
        }
        else{
            ArrayList<Bebida> newbebidas = new ArrayList<Bebida>();
            newbebidas.add(bebida);
            this.bebidas = newbebidas;
        }
    }
    
    public void agregarAcompanhamiento(Acompanhamiento acomp){
        if(acompanhamientos != null){
            acompanhamientos.add(acomp);
        }
        else{
            ArrayList<Acompanhamiento> newAcompanhamientos = new ArrayList<Acompanhamiento>();
            newAcompanhamientos.add(acomp);
            this.acompanhamientos = newAcompanhamientos;
        }
    }
    
    public void agregarOtros(Otro otro){
        if(otrosPlatos != null){
            otrosPlatos.add(otro);
        }
        else{
            ArrayList<Otro> newOtros = new ArrayList<Otro>();
            newOtros.add(otro);
            this.otrosPlatos = newOtros;
        }
    }
    
    public void agregarCombo(Combo combo){
        if(combos != null){
            combos.add(combo);
        }
        else{
            ArrayList<Combo> newcombos = new ArrayList<Combo>();
            newcombos.add(combo);
            this.combos = newcombos;
        }
    }
    // --------------- SETS Y GETS ---------------
    
    public ArrayList<Hamburguesa> getHamburguesas() {
        return hamburguesas;
    }

    public void setHamburguesas(ArrayList<Hamburguesa> hamburguesas) {
        this.hamburguesas = hamburguesas;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public ArrayList<Acompanhamiento> getAcompanhamientos() {
        return acompanhamientos;
    }

    public void setAcompanhamientos(ArrayList<Acompanhamiento> acompanhamientos) {
        this.acompanhamientos = acompanhamientos;
    }

    public ArrayList<Otro> getOtrosPlatos() {
        return otrosPlatos;
    }

    public void setOtrosPlatos(ArrayList<Otro> otrosPlatos) {
        this.otrosPlatos = otrosPlatos;
    }

    public Integer getCantidadPostres() {
        return cantidadPostres;
    }

    public void setCantidadPostres(Integer cantidadPostres) {
        this.cantidadPostres = cantidadPostres;
    }

    public ArrayList<Combo> getCombos() {
        return combos;
    }

    public void setCombos(ArrayList<Combo> combos) {
        this.combos = combos;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}

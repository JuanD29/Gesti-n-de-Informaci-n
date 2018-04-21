/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.gestion.modelo;

/**
 *
 * @author Juan David Correa
 */
public class Efectivo implements Activo {
    
    protected double cantidad;

    public Efectivo(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    @Override
    public double ObtenerValorDelMercado() {
    return cantidad;    
    }

    @Override
    public double ObtenerBeneficio() {
    return 0;
    }
    
}

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
public abstract class ValorDelActivoPorAccion implements Activo {
   
    protected String Simbolo;
    protected double CostoTotal;
    protected double PrecioActual;

    public ValorDelActivoPorAccion(String Simbolo, double CostoTotal, double PrecioActual) {
        this.Simbolo = Simbolo;
        this.CostoTotal = CostoTotal;
        this.PrecioActual = PrecioActual;
    }
    
    public abstract double ObtenerValorDelMercado();
    public abstract double ObtenerBeneficio();
    
            
    

   
    
}

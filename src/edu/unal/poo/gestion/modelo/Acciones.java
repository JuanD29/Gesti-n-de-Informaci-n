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
public class Acciones extends ValorDelActivoPorAccion{
    
    protected int ValorTotalDelA;

    public Acciones(String Simbolo, double CostoTotal, double PrecioActual) {
        super(Simbolo, CostoTotal, PrecioActual);
        this.ValorTotalDelA = ValorTotalDelA;
                
    }
     
    @Override
    public double ObtenerValorDelMercado() {
        
        return ValorTotalDelA*PrecioActual;
        
    }

    @Override
    public double ObtenerBeneficio(){
        return (ValorTotalDelA*PrecioActual)-CostoTotal;
        
    }

    
    
}

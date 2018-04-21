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
public class FondoDeInversion extends ValorDelActivoPorAccion {
    
    protected double ValorTotalDelA;

    public FondoDeInversion(String Simbolo, double CostoTotal, double PrecioActual) {
        super(Simbolo, CostoTotal, PrecioActual);
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

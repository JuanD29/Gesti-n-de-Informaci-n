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
public class DividendoEnAcciones extends Acciones {
    
    protected double Dividendos;
    protected int ValorTotalDelA;

    public DividendoEnAcciones(String Simbolo, double CostoTotal, double PrecioActual) {
        super(Simbolo, CostoTotal, PrecioActual);
        this.Dividendos = Dividendos;
    }
    
@Override
    public double ObtenerValorDelMercado() {
        return (ValorTotalDelA*PrecioActual)+Dividendos;
    }
@Override
    public double ObtenerBeneficio(){
        return (ValorTotalDelA*PrecioActual)-CostoTotal;
        
    }
    
}

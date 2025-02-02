package edu.mike.actividades.actividad3.process;

import edu.mike.actividades.actividad3.models.Producto;

public class PriceCalculator {

    private Double precioFinal;

    /**
     * 
     * @param producto
     * @param precioGanar
     */
    public PriceCalculator(Producto producto, Double precioGanar){

        Double costo = producto.getCosto();
        Double impuesto = producto.getImpuesto();

        this.precioFinal = (costo + precioGanar) * (1 + impuesto); 
    }
    
    /**
     * 
     * Metodo que se encarga de retornar el precio final
     */
    public Double getPrecioFinal(){
        return this.precioFinal;
    }
    



}

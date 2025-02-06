package edu.mike.actividades.actividad3.process;

import edu.mike.actividades.actividad3.models.Producto;

public class PriceCalculator {

    private Double precioFinal;

    /**
     * 
     * @param producto Costo de el prodcuto de el que se quiere saber el precio final
     * @param precioGanar Cantidad de dinero que se desea ganar
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

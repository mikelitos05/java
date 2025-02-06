package edu.mike.actividades.actividad3.process;
import edu.mike.actividades.actividad3.models.Producto;

public class ProductComparator {

    double precioDiferencia;


    /**
     * Metodo que se encarga de comparar 2 productos
     */
    public ProductComparator(Producto producto, Producto producto1){

        double precioFinal = producto.getCosto() + (producto.getImpuesto()* producto.getCosto());

        double precioFinal1 = producto1.getCosto() + (producto1.getImpuesto()* producto1.getCosto());

        this.precioDiferencia = precioFinal - precioFinal1;


    }

    /**
     * Metodo que se encarga de retornar la diferencia de precio
     * 
     */
    public double getPrecioDiferencia(){
        return this.precioDiferencia;
    }



}

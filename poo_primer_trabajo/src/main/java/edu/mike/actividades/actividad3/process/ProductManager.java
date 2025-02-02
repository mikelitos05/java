package edu.mike.actividades.actividad3.process;

import java.util.ArrayList; 
import java.util.List;

import edu.mike.actividades.actividad3.models.Producto;

public class ProductManager {
    
    ArrayList<Producto> stock;    

    /**
     * Metodo que se encarga de crear un stock de productos
     */
    public ProductManager() {
        this.stock = new ArrayList<>();
    }

    /**
     * Metodo que se encarga de agregar un producto al stock
     * @param codigo del producto
     * @param costo del producto no que puede ser menor o igual a 0
     * @param descripcion del producto
     * @param impuesto del producto que no puede ser menor o igual a 0
     * @param tipo de producto
     */
    public void addProducto(int codigo, Double costo, String descripcion, Double impuesto, String tipo){
        Producto producto = new Producto(codigo, costo, descripcion, impuesto, tipo);
        stock.add(producto);
    }

    /**
     * Metodo que se encarga de retornar el stock
     */
    public List<Producto>getStock(){
        return this.stock;
    }


}

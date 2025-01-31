package edu.mike.actividades.actividad3.process;

import java.util.ArrayList; 
import java.util.List;

import edu.mike.actividades.actividad3.models.Producto;

public class ProductManager {
    
    ArrayList<Producto> stock;    

    public ProductManager() {
        this.stock = new ArrayList<>();
    }

    public void addProducto(int codigo, Double costo, String descripcion, Double impuesto, String tipo){
        Producto producto = new Producto(codigo, costo, descripcion, impuesto, tipo);
        stock.add(producto);
    }

    
    public List<Producto>getStock(){
        return this.stock;
    }


}

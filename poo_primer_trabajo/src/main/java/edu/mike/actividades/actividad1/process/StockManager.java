package edu.mike.actividades.actividad1.process;
import java.util.ArrayList;
import java.util.List;

import edu.mike.actividades.actividad1.models.Car;

public class StockManager {

    ArrayList<Car> stock;
    /**
     * Clase que se encarga de crear una lista vacia para almacenar los carros
     */
    public StockManager(){
        this.stock = new ArrayList<>();
    }

    /**
     * Metodo que se encarga de agregar un carro a la lista
     * @param color Color del carro
     * @param marca Empresa que fabrica el carro
     * @param modelo Año del carro
     * @param precio Precio del carro
     */
    public void addCar(String color, String marca, String modelo,int precio){
        Car car = new Car(color,marca,modelo,precio);
        stock.add(car);
    }

    /**
     * Metodo que se encarga de retornar la lista de carros
     */
    public List<Car> getStock(){
        return this.stock;
    }

}

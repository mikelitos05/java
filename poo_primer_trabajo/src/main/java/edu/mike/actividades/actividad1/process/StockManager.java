package edu.mike.actividades.actividad1.process;
import java.util.ArrayList;

import edu.mike.actividades.actividad1.models.Car;

public class StockManager {

    ArrayList<Car> stock;

    public StockManager(){
        this.stock = new ArrayList<>();
    }


    public void addCar(String color, String marca, String modelo,int precio){
        Car car = new Car(color,marca,modelo,precio);
        stock.add(car);
    }

    public void printStock(){
        int numIter = 0;
        for (Car car : stock){
            System.out.println("---------------------------");
            numIter = numIter + 1;
            System.out.println("Carro numero: " + numIter);
            System.out.println("---------------------------");
            System.out.println("Precio: " + car.getPrecio());
            System.out.println("Modelo: " + car.getModelo());
            System.out.println("Marca: " + car.getMarca());
            System.out.println("Color: " + car.getColor());
            
            
        }
    }



}

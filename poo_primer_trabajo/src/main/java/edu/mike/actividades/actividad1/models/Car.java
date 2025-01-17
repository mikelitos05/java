package edu.mike.actividades.actividad1.models;

public class Car {


    private String modelo;
    private String marca; 
    private String color;
    private int precio;

    public Car(String color, String marca, String modelo, int precio) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;       
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }



   

}

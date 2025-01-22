package edu.mike.actividades.actividad1.ui;
import java.util.Scanner;

import edu.mike.actividades.actividad1.models.Car;
import edu.mike.actividades.actividad1.process.StockManager;



public class CLI {

    /**
     * Metodo que se encarga de el menu de la aplicacion
     */

    public static void showMenu(){
        System.out.println("===============================");
        System.out.println("Bienvenido a la aplicacion");
        System.out.println("1.Crear carro");
        System.out.println("2.Mostrar carro");     
        System.out.println("3.Salir");   
        System.out.println("===============================");  
    }

    /**
     * Metodo que se encarga de correr la aplicacion y muestra el menu
     * Permite agregar carros y mostrar los carros agregados
     */
    public static void runApp(){
        Scanner scanner = new Scanner(System.in);
        StockManager stockManager = new StockManager();

        showMenu();
        int opciones = scanner.nextInt();scanner.nextLine();

        while (opciones != 3){
            switch (opciones){
                case 1:
                    System.out.println("===============================");
                    System.out.println("Introduce la marca del carro: ");
                    System.out.println("===============================");
                    String marca = scanner.nextLine();
                    System.out.println("===============================");
                    System.out.println("Introduce el modelo del carro: ");
                    System.out.println("===============================");
                    String modelo = scanner.nextLine();
                    System.out.println("===============================");
                    System.out.println("Introduce el color del carro: ");
                    System.out.println("===============================");
                    String color = scanner.nextLine();
                    System.out.println("===============================");
                    System.out.println("Introduce el precio del carro: ");
                    System.out.println("===============================");
                    int precio = scanner.nextInt();scanner.nextLine();
                    stockManager.addCar(color, marca, modelo,precio);
                    break;
                case 2:
                    int numCar = 1;
                    if (stockManager.getStock().isEmpty()){
                        System.out.println("===============================");
                        System.out.println("No hay carros en el stock");
                    }
                    else{
                        for (Car car : stockManager.getStock()){
                            System.out.println("===============================");
                            System.out.println("Carro numero: " + numCar);
                            System.out.println("===============================");
                            System.out.println("Marca: " + car.getMarca());
                            System.out.println("Modelo: " + car.getModelo());
                            System.out.println("Color: " + car.getColor());
                            System.out.println("Precio: " + car.getPrecio());
                            System.out.println("===============================");
                            numCar++;
    
                        }
                    }
                    
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            showMenu();
            opciones = scanner.nextInt();scanner.nextLine();       
        }
    }
}

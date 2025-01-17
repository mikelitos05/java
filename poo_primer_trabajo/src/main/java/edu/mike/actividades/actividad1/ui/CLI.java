package edu.mike.actividades.actividad1.ui;
import java.util.Scanner;

import edu.mike.actividades.actividad1.process.StockManager;



public class CLI {

    public static void showMenu(){
        System.out.println("-------------------------------");
        System.out.println("Bienvenido a la aplicacion");
        System.out.println("1.Crear carro");
        System.out.println("2.Mostrar carro");     
        System.out.println("3.Salir");   
        System.out.println("-------------------------------");  
    }


    public static void runApp(){
        Scanner scanner = new Scanner(System.in);
        StockManager stockManager = new StockManager();

        showMenu();
        int opciones = scanner.nextInt();scanner.nextLine();

        while (opciones != 3){
            switch (opciones){
                case 1:
                   
                    System.out.println("Introduce el modelo del carro: ");
                    String modelo = scanner.nextLine();
                    System.out.println("-------------------------------");
                    System.out.println("Introduce el precio del carro: ");
                    System.out.println("-------------------------------");
                    int precio = scanner.nextInt();scanner.nextLine();
                    System.out.println("Introduce la marca del carro: ");
                    System.out.println("-------------------------------");
                    String marca = scanner.nextLine();
                    System.out.println("-------------------------------");
                    System.out.println("Introduce el color del carro: ");
                    String color = scanner.nextLine();
                    stockManager.addCar(color, marca, modelo,precio);
                    break;
                case 2:
                    stockManager.printStock();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            showMenu();
            opciones = scanner.nextInt();scanner.nextLine();       
        }
    }
}

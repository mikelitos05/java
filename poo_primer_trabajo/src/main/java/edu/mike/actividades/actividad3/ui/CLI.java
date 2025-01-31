package edu.mike.actividades.actividad3.ui;
import java.util.Scanner;

import edu.mike.actividades.actividad3.models.Producto;
import edu.mike.actividades.actividad3.process.PriceCalculator;
import edu.mike.actividades.actividad3.process.ProductManager;


public class CLI {

    private static ProductManager productManager = new ProductManager();

    /**
     * Metodo que se encarga de mostrar el menu
     */
    public static void showMenu() {
        System.out.println("===============================");
        System.out.println("Bienvenido a la aplicacion");
        System.out.println("1.Registrar producto");
        System.out.println("2.Mostrar productos");     
        System.out.println("3.Calcular precio venta");
        System.out.println("4.Comparar productos");
        System.out.println("5.Salir");   
        System.out.println("===============================");  
    }  

/**
 * Metodo que se encarga de mostrar los productos
 */
    public static void mostrarProductos(){
        int numproducto = 1;
        for(Producto producto : productManager.getStock()){
            System.out.println("===============================");
            System.out.println("Producto: "+ numproducto);
            System.out.println("===============================");
            System.out.println("Codigo del producto: "+ producto.getCodigo());
            System.out.println("Tipo de producto: "+ producto.getTipo());
            System.out.println("Descripcion del producto: "+ producto.getDescripcion());
            System.out.println("Costo del producto: "+ producto.getCosto());
            System.out.println("Impuesto del producto: "+ producto.getImpuesto());
            System.out.println("===============================");
            numproducto++;
        }
    }

    /**
     * Metodo que se encarga de correr la aplicacion
     */
    public static void runApp(){
        Scanner scanner = new Scanner(System.in);
        
        showMenu();
        int opciones = scanner.nextInt();scanner.nextLine();

        while (opciones != 5){
            
            switch (opciones){
                case 1:
                System.out.println("Introduzca el codigo del producto: ");
                int codigo = scanner.nextInt();scanner.nextLine();
                System.out.println("Introduzca el tipo del producto: ");
                String tipo = scanner.nextLine();
                System.out.println("Introduzca la descripcion del producto: ");
                String descripcion = scanner.nextLine();
                System.out.println("Introduzca el costo del producto: ");
                Double costo = scanner.nextDouble();scanner.nextLine();
                System.out.println("Introduzca el impuesto del producto: ");
                Double impuesto = scanner.nextDouble();scanner.nextLine();

                 
                try {
                    productManager.addProducto(codigo, costo, descripcion, impuesto, tipo);
                } catch (IllegalArgumentException e) {
                    System.out.println(e);
                }

                break;
            case 2:
                
                mostrarProductos();

                
                break;
            case 3:

                System.out.println("Introduzca el numero del producto del que quiere saber el precio de venta: ");
                mostrarProductos();
                int numProducto = scanner.nextInt();scanner.nextLine();
                System.out.println("Introduzca el la cantidad que desea ganar: ");
                double precioGanar = scanner.nextDouble();scanner.nextLine();
                PriceCalculator priceCalculator = new PriceCalculator(productManager.getStock().get(numProducto-1), precioGanar);
                System.out.println("El precio de venta del producto es: "+ priceCalculator.getPrecioFinal());

                



                break;
            case 4:
                System.out.println("En desarrollo");
            break;
            default:
                System.out.println("Opcion no valida");
                break;
                
            }

            showMenu();
            opciones = scanner.nextInt();scanner.nextLine();

        }


    }




}

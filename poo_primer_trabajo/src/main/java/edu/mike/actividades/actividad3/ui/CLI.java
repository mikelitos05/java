package edu.mike.actividades.actividad3.ui;

import java.util.Scanner;

import edu.mike.actividades.actividad3.models.Producto;
import edu.mike.actividades.actividad3.process.PriceCalculator;
import edu.mike.actividades.actividad3.process.ProductComparator;
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
    public static void mostrarProductos() {
        int numproducto = 1;
        for (Producto producto : productManager.getStock()) {
            System.out.println("===============================");
            System.out.println("Producto: " + numproducto);
            System.out.println("===============================");
            System.out.println("Codigo del producto: " + producto.getCodigo());
            System.out.println("Tipo de producto: " + producto.getTipo());
            System.out.println("Descripcion del producto: " + producto.getDescripcion());
            System.out.println("Costo del producto: " + producto.getCosto());
            System.out.println("Impuesto del producto: " + producto.getImpuesto());
            System.out.println("===============================");
            numproducto++;
        }
    }

    /**
     * Metodo que se encarga de correr la aplicacion
     */
    public static void runApp() {
        Scanner scanner = new Scanner(System.in);

        showMenu();
        
        int opciones = 0;

        while (opciones != 5) {
            try {
                opciones = scanner.nextInt();
                scanner.nextLine();
                
            } catch (java.util.InputMismatchException e) {
                System.out.println("Opcion no valida");
                scanner.nextLine();
                continue;
            }
            switch (opciones) {
                case 1:
                    int codigo = 0;
                    Double costo = 0.0;
                    Double impuesto = 0.0;
                    String tipo = "";
                    String descripcion = "";

                    System.out.println("Introduzca el codigo del producto: ");
                    while (true) {
                        try {
                            codigo = scanner.nextInt();
                            scanner.nextLine();
                            break;
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Codigo no valido. Por favor, introduzca un numero entero.");
                            scanner.nextLine();
                        }
                    }

                    System.out.println("Introduzca el tipo del producto: ");
                    while (true) {
                        tipo = scanner.nextLine();
                        if (!tipo.isEmpty()) {
                            break;
                        } else {
                            System.out.println("El tipo no puede estar vacio. Por favor, introduzca un tipo valido.");
                        }
                    }

                    System.out.println("Introduzca la descripcion del producto: ");
                    while (true) {
                        descripcion = scanner.nextLine();
                        if (!descripcion.isEmpty()) {
                            break;
                        } else {
                            System.out.println("La descripcion no puede estar vacia. Por favor, introduzca una descripcion valida.");
                        }
                    }

                    System.out.println("Introduzca el costo del producto: ");
                    while (true) {
                        try {
                            costo = scanner.nextDouble();
                            scanner.nextLine();
                            if (costo > 0) {
                                break;
                            } else {
                                System.out.println("El costo no puede ser menor o igual a 0. Por favor, introduzca un costo valido.");
                            }
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Costo no valido. Por favor, introduzca un numero.");
                            scanner.nextLine();
                        }
                    }

                    System.out.println("Introduzca el impuesto del producto: ");
                    while (true) {
                        try {
                            impuesto = scanner.nextDouble();
                            scanner.nextLine();
                            if (impuesto > 0) {
                                break;
                            } else {
                                System.out.println("El impuesto no puede ser menor o igual a 0. Por favor, introduzca un impuesto valido.");
                            }
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Impuesto no valido. Por favor, introduzca un numero.");
                            scanner.nextLine();
                        }
                    }

                    try {
                        productManager.addProducto(codigo, costo, descripcion, impuesto, tipo);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 2:
                    if (productManager.getStock().isEmpty()) {
                        System.out.println("===============================");
                        System.out.println("No hay productos en el stock ");
                        
                    }
                    else{
                        mostrarProductos();
                    }
                    break;
                case 3:
                if (productManager.getStock().size() < 1) {
                    System.out.println("===============================");
                    System.out.println("No hay suficientes productos en el stock ");
                }
                else{
                    try{
                        System.out.println("Introduzca el numero del producto del que quiere saber el precio de venta: ");
                        mostrarProductos();
                        int numProducto = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Introduzca el la cantidad que desea ganar: ");
                        double precioGanar = scanner.nextDouble();
                        scanner.nextLine();
                        PriceCalculator priceCalculator = new PriceCalculator(productManager.getStock().get(numProducto - 1), precioGanar);
                        System.out.println("El precio de venta del producto es: " + priceCalculator.getPrecioFinal());
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Opcion no valida");
                        scanner.nextLine();
                    }
                    catch (IndexOutOfBoundsException e) {
                        System.out.println("Producto no encontrado");
                    }
                }

                    break;
                case 4:
                try{
                    if (productManager.getStock().size() < 2) {
                        System.out.println("===============================");
                        System.out.println("No hay suficientes productos en el stock ");
                    }
                    else{
                        mostrarProductos();
                        System.out.println("Introduzca el numero del primer producto que desea comparar: ");
                        int numProducto1 = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Introduzca el numero del segundo producto que desea comparar: ");
                        int numProducto2 = scanner.nextInt();
                        scanner.nextLine();
                        ProductComparator productComparator = new ProductComparator(productManager.getStock().get(numProducto1 - 1),productManager.getStock().get(numProducto2 - 1));

                        if (productComparator.getPrecioDiferencia() == 0) {
                            System.out.println("El precio final de ambos productos es igual");
                        }

                        if (productComparator.getPrecioDiferencia() > 0) {
                            System.out.println("El precio final del primer producto es mayor que el del segundo producto por: "+ productComparator.getPrecioDiferencia());
                        }

                        if (productComparator.getPrecioDiferencia() < 0) {
                            System.out.println("El precio final del segundo producto es menor que el del primer producto por: "+ -1 * productComparator.getPrecioDiferencia());
                        }
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Opcion no valida");
                    scanner.nextLine();
                }
                catch (IndexOutOfBoundsException e) {
                    System.out.println("Productos no encontrado");
                }


                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }

            showMenu();


        }

    }

}

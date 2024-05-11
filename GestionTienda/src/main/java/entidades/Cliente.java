package entidades;
import java.sql.Connection;
import java.util.Scanner;

import queries.ClienteQueries;

public class Cliente {
	// Declaramos la variable tipo connection para conectarnos a la BBDD
    private Connection connection;
    // Variable de tipo entrada para el cliente
    private Scanner scanner;
    // Declaramos una variable ClienteQueries para realizar consultas SQL
    private ClienteQueries clienteQueries;

    public Cliente(Connection connection) {
        this.connection = connection;
        this.scanner = new Scanner(System.in);
        this.clienteQueries = new ClienteQueries(connection);
    }
    // Metodo para iniciar la interaccion del cliente
    public void start() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú Cliente:");
            System.out.println("1. Ver catálogo de productos");
            System.out.println("2. Seleccionar productos para agregar a la compra");
            System.out.println("3. Efectuar la compra e imprimir el ticket");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    clienteQueries.viewCatalog(scanner);
                    break;
                case 2:
                    clienteQueries.selectProducts(scanner);
                    break;
                case 3:
                    clienteQueries.completePurchase(scanner);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, inténtalo de nuevo.");
            }
        }
    }
}
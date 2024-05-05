package entidades;
import java.sql.Connection;
import java.util.Scanner;

import queries.ClienteQueries;

public class Cliente {
    private Connection connection;
    private Scanner scanner;
    private ClienteQueries clienteQueries;

    public Cliente(Connection connection) {
        this.connection = connection;
        this.scanner = new Scanner(System.in);
        this.clienteQueries = new ClienteQueries(connection);
    }

    public void start() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMen� Cliente:");
            System.out.println("1. Ver cat�logo de productos");
            System.out.println("2. Seleccionar productos para agregar a la compra");
            System.out.println("3. Efectuar la compra e imprimir el ticket");
            System.out.println("4. Salir");
            System.out.print("Elige una opci�n: ");
            
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
                    System.out.println("Opci�n no v�lida. Por favor, int�ntalo de nuevo.");
            }
        }
    }
}
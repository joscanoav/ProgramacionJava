package entidades;
// Importamos la clase connection para conectarnos con el servidor
import java.sql.Connection;
import java.util.Scanner;

import queries.AdministradorQueries;

public class Administrador {
	// Declaramos la variable tipo connection para conectarnos a la BBDD
    private Connection connection;
    // Variable de tipo entrada para el administrador
    private Scanner scanner;
    // Declaramos una variable AdministradorQueries para realizar consultas SQL
    private AdministradorQueries adminQueries;

    public Administrador(Connection connection) {
        this.connection = connection;
        this.scanner = new Scanner(System.in);
        this.adminQueries = new AdministradorQueries(connection);
    }

    // Metodo para iniciar la interaccion del administrador
    public void start() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú Administrador:");
            System.out.println("1. Dar de alta un nuevo cliente");
            System.out.println("2. Dar de alta un nuevo producto");
            System.out.println("3. Modificar los datos de un cliente");
            System.out.println("4. Modificar los datos de un producto");
            System.out.println("5. Eliminar un cliente por su ID");
            System.out.println("6. Eliminar un producto por su ID");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    adminQueries.agregarCliente(scanner);
                    break;
                case 2:
                    adminQueries.agregarProducto(scanner);
                    break;
                case 3:
                    adminQueries.modificarCliente(scanner);
                    break;
                case 4:
                    adminQueries.modificarProducto(scanner);
                    break;
                case 5:
                    adminQueries.borrarCliente(scanner);
                    break;
                case 6:
                    adminQueries.borrarProducto(scanner);
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, inténtalo de nuevo.");
            }
        }
    }
}

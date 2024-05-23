package entidades;

import java.sql.Connection;
import java.util.Scanner;

import queries.OwnerQueries;
import queries.AnimalQueries;

public class Owner {
	
    private Connection connection;
    private Scanner scanner;
    private OwnerQueries ownerQueries;

    public Owner (Connection connection) {
        this.connection = connection;
        this.scanner = new Scanner(System.in);
        this.ownerQueries = new OwnerQueries(connection);
    }

    public void start() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMen� Administrador:");
            System.out.println("1. Agregar un nuevo animal");
            System.out.print("Elige una opci�n: ");
            
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                	ownerQueries.agregarAnimal(scanner);
                    break;

                default:
                    System.out.println("Opci�n no v�lida. Por favor, int�ntalo de nuevo.");
            }
        }
    }
}
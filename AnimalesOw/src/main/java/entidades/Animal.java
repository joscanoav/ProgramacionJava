package entidades;

import java.sql.Connection;
import java.util.Scanner;
import queries.AnimalQueries;

public class Animal {
	
    private Connection connection;
    private Scanner scanner;
    private AnimalQueries animalQueries;

    public Animal(Connection connection) {
        this.connection = connection;
        this.scanner = new Scanner(System.in);
        this.animalQueries = new AnimalQueries(connection);
    }
    
    public void start() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú Animal:");
            System.out.println("1. Ver catálogo de animales");
  
            
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                	animalQueries.verCatalogo(scanner);
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, inténtalo de nuevo.");
            }
        }
    }
    
    
}
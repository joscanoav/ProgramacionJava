package main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import conexion.Conexion;
import entidades.Animal;
import entidades.Owner;

public class Main {

    public static void main(String[] args) {
        try (Connection connection = Conexion.open()) {
            Scanner scanner = new Scanner(System.in);
            boolean salir = false;
            
            do {
                System.out.println("***** Bienvenido a Gestion Tienda Mascotas *****:");
                System.out.println("1. Modo Animal");
                System.out.println("2. Modo Owner");
                System.out.println("3. Salir");
                System.out.print("Elige una opción: ");


                
                try {
                    int option = scanner.nextInt();
                    scanner.nextLine();
                    
                    switch (option) {
                        case 1:
                            /*Animal animalQueries = new Animal(connection);
                            animalMode.start();*/
                            break;
                        case 2:
                            Owner ownernMode = new Owner(connection);
                            ownernMode.start();
                            break;
                        case 3:
                            salir = true;
                        	System.out.println("Gracias por utilizar nuestro Gestor!");
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, inténtalo de nuevo.");
                    }
 
                } catch (InputMismatchException e) {
                    System.out.println("Opción no válida. Por favor, ingresa un número.");
                    scanner.nextLine();
                }
            } while (!salir);

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}

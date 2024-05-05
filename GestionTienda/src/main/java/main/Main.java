package main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import conexion.Conexion;
import entidades.Administrador;
import entidades.Cliente;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = Conexion.open()) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Bienvenido a la tienda. Elige un modo de operación:");
            System.out.println("1. Modo Cliente");
            System.out.println("2. Modo Administrador");
            System.out.print("Elige una opción: ");
            
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (option == 1) {
                Cliente clienteMode = new Cliente(connection);
                clienteMode.start();
            } else if (option == 2) {
                Administrador adminMode = new Administrador(connection);
                adminMode.start();
            } else {
                System.out.println("Opción no válida.");
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}

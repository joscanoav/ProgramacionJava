package main;
//importamos los paquetes
import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
//importamos las entidades y conexion
import conexion.Conexion;
import entidades.Administrador;
import entidades.Cliente;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = Conexion.open()) {
            Scanner scanner = new Scanner(System.in);
            boolean salir = false;
            
            do {
                System.out.println("***** Bienvenido a Gestion Tienda IFP *****:");
                System.out.println("1. Modo Cliente");
                System.out.println("2. Modo Administrador");
                System.out.println("3. Salir");
                System.out.print("Elige una opción: ");


                
                try {
                    int option = scanner.nextInt();
                    scanner.nextLine();
                    
                    switch (option) {
                        case 1:
                            Cliente clienteMode = new Cliente(connection);
                            clienteMode.start();
                            break;
                        case 2:
                            Administrador adminMode = new Administrador(connection);
                            adminMode.start();
                            break;
                        case 3:
                            salir = true;
                        	System.out.println("Gracias por utilizar nuestro Gestor!");
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, inténtalo de nuevo.");
                    }
                    // Utilizamos la excepción InputMismatchException  caso en el que el usuario ingresa un valor que no es un número entero 
                    //cuando se espera que elija una opción del menú. 
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


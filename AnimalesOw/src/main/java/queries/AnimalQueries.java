package queries;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AnimalQueries {
    private Connection connection;

    public AnimalQueries(Connection connection) {
        this.connection = connection;
    }

    public void verCatalogo(Scanner scanner) {
        System.out.println("\nOpciones de catálogo:");
        System.out.println("1. Ver todos los animales");
        System.out.print("Elige una opción: ");
        
        int option = scanner.nextInt();
        scanner.nextLine(); 
        String query = "";
        switch (option) {
            case 1:
                query = "SELECT * FROM animales";
                break;
            
                
            default:
                System.out.println("Opción no válida.");
                return;
        }
    }
}
        
       
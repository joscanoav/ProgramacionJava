package main;

import java.util.Scanner;
import entidades.Cliente;
import queries.ClienteQueries;

public class Main {

    public static void main(String[] args) {
 
    		
    	Scanner scanner = new Scanner(System.in);
    
    	System.out.println("Selecciones una opcion: ");
    	
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Mostrar clientes");
            System.out.println("1. Insertar cliente");
            System.out.println("2. Buscar cliente por ID");
            System.out.println("3. Eliminar cliente por ID");
            System.out.println("4. Salir");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Los clientes de la tienda son: ");
    		    	ClienteQueries queries = new ClienteQueries();
    		    	queries.getAllClientes();
                    break;

               
            }
            
        }
	}
}
    


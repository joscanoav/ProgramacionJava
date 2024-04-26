package ejercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModificarDatosPersona2 {

	    public static void main(String[] args) {
	        // Ruta del archivo
	        String path = "C:\\DAN\\datos.txt";

	        // Crear un objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);
	        
	        // Leer los datos del archivo
	        List<String> datos = leerDatosDelArchivo(path);

	        // Mostrar los datos existentes al usuario
	        System.out.println("Datos existentes en el archivo:");
	        for (int i = 0; i < datos.size(); i++) {
	            System.out.println((i + 1) + ". " + datos.get(i));
	        }

	        // Pedir al usuario que seleccione el registro a modificar
	        System.out.print("Ingrese el número del registro que desea modificar: ");
	        int indiceModificar = scanner.nextInt() - 1;
	        scanner.nextLine(); // Limpiar el buffer

	        // Asegurarse de que el índice esté dentro del rango de la lista
	        if (indiceModificar < 0 || indiceModificar >= datos.size()) {
	            System.out.println("Índice fuera de rango.");
	            return;
	        }

	        // Pedir al usuario que ingrese la nueva información
	        System.out.println("Ingrese los nuevos datos (nombre;apellido1;apellido2;nacimiento):");
	        String nuevosDatos = scanner.nextLine();

	        // Modificar el registro seleccionado con los nuevos datos
	        datos.set(indiceModificar, nuevosDatos);

	        // Escribir los datos modificados de nuevo en el archivo
	        escribirDatosAlArchivo(path, datos);
	        
	        System.out.println("Los datos han sido modificados con éxito.");
	        
	        // Cerrar el objeto Scanner
	        scanner.close();
	    }

	    private static List<String> leerDatosDelArchivo(String path) {
	        List<String> datos = new ArrayList<>();
	        try (Scanner fileScanner = new Scanner(new File(path))) {
	            while (fileScanner.hasNextLine()) {
	                datos.add(fileScanner.nextLine());
	            }
	        } catch (Exception e) {
	            System.out.println("ERROR: no se pudo leer el archivo");
	        }
	        return datos;
	    }

	    private static void escribirDatosAlArchivo(String path, List<String> datos) {
	        try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
	            for (String dato : datos) {
	                pw.println(dato);
	            }
	        } catch (Exception e) {
	            System.out.println("ERROR: no se pudo escribir los datos en el archivo");
	        }
	    }
	
	}


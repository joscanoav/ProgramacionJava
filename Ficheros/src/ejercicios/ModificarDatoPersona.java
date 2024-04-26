package ejercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ModificarDatoPersona {

	public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese los datos
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el primer apellido: ");
        String apellido1 = scanner.nextLine();
        
        System.out.print("Ingrese el segundo apellido: ");
        String apellido2 = scanner.nextLine();
        
        System.out.print("Ingrese la fecha de nacimiento (formato dd/mm/yyyy): ");
        String nacimiento = scanner.nextLine();
        
        // Ruta del archivo
        String path = "C:\\DAN\\datos.txt";
        
        try {
            // Abre el archivo en modo de adición (append) para no sobrescribir el contenido existente
            PrintWriter pw = new PrintWriter(new FileWriter(new File(path), true));
            
            // Repetir el proceso de escritura 10 veces
            for (int i = 0; i < 10; i++) {
                // Escribir los datos en el archivo y saltar a la siguiente línea
                pw.println(nombre + ";" + apellido1 + ";" + apellido2 + ";" + nacimiento);
            }
            
            // Cerrar el PrintWriter para liberar recursos
            pw.close();
            
            System.out.println("Datos escritos en el archivo con éxito.");
        } catch (Exception e) {
            System.out.println("ERROR: no se pudo escribir la información");
        }
        
        // Cerrar el objeto Scanner
        scanner.close();
    }


}



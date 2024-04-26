package ejercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModificarBorrarDatoPersona {

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

        // Elegir acción: modificar o borrar
        System.out.print("¿Desea modificar o borrar un dato? (modificar/borrar): ");
        String accion = scanner.nextLine().toLowerCase();
        
        // Si elige modificar
        if (accion.equals("modificar")) {
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

            System.out.println("El registro ha sido modificado con éxito.");
        }
        // Si elige borrar
        else if (accion.equals("borrar")) {
            // Pedir al usuario que seleccione el registro a borrar
            System.out.print("Ingrese el número del registro que desea borrar: ");
            int indiceBorrar = scanner.nextInt() - 1;
            scanner.nextLine(); // Limpiar el buffer

            // Asegurarse de que el índice esté dentro del rango de la lista
            if (indiceBorrar < 0 || indiceBorrar >= datos.size()) {
                System.out.println("Índice fuera de rango.");
                return;
            }

            // Borrar el registro seleccionado de la lista
            datos.remove(indiceBorrar);

            System.out.println("El registro ha sido borrado con éxito.");
        } else {
            System.out.println("Acción no reconocida. Solo puede elegir 'modificar' o 'borrar'.");
            return;
        }

        // Escribir los datos modificados o después de borrar de nuevo en el archivo
        escribirDatosAlArchivo(path, datos);
        
        System.out.println("Los datos han sido actualizados con éxito.");
        
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

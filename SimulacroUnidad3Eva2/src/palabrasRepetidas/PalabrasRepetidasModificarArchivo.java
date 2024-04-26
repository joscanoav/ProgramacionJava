package palabrasRepetidas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PalabrasRepetidasModificarArchivo {

    public static void main(String[] args) {
        String path = "movilidad.txt";
        String tempPath = "temp_movilidad.txt";  // Ruta temporal
        String line;
        
        // Lista para almacenar líneas únicas
        ArrayList<String> palabrasUnicas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path));
             BufferedWriter bw = new BufferedWriter(new FileWriter(tempPath))) {
            
            // Lee líneas del archivo original
            while ((line = br.readLine()) != null) {
                // Verifica si la línea ya está en la lista
                if (!palabrasUnicas.contains(line)) {
                    // Si no está, agrégala a la lista
                    palabrasUnicas.add(line);
                    // Escribe la línea única en el archivo temporal
                    bw.write(line);
                    bw.newLine();
                }
            }
            
        } catch (IOException e) {
            System.err.println("ERROR: no se pudo leer o escribir el archivo.");
        }

        // Reemplazar el archivo original con el archivo temporal
        try {
            java.nio.file.Files.delete(java.nio.file.Paths.get(path));
            java.nio.file.Files.move(java.nio.file.Paths.get(tempPath), java.nio.file.Paths.get(path));
            System.out.println("Archivo modificado con éxito.");
        } catch (IOException e) {
            System.err.println("ERROR: no se pudo reemplazar el archivo original.");
        }
    }
}
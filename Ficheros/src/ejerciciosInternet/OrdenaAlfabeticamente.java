package ejerciciosInternet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaAlfabeticamente {

    public static void main(String[] args) {
        // Define la ruta del archivo de entrada explícitamente en el código.
        String filePath = "C:\\DAN\\DAM\\ProgramacionJava\\Ficheros\\salida.txt";
        
        // Calcula el nombre del archivo de salida agregando "_sort" antes de la extensión.
        int extensionIndex = filePath.lastIndexOf(".");
        String outputFilePath = filePath.substring(0, extensionIndex) + "_sort" + filePath.substring(extensionIndex);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {

            // Lista para almacenar las palabras leídas del archivo.
            List<String> palabras = new ArrayList<>();

            // Lee las palabras del archivo y las almacena en la lista.
            String linea;
            while ((linea = br.readLine()) != null) {
                // Añade la línea a la lista si no es null.
                palabras.add(linea.trim());
            }

            // Ordena la lista de palabras alfabéticamente.
            Collections.sort(palabras);

            // Escribe las palabras ordenadas en el archivo de salida.
            for (String palabra : palabras) {
                bw.write(palabra);
                bw.newLine();
            }

            System.out.println("El archivo se ha ordenado alfabéticamente y guardado como: " + outputFilePath);

        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        }
    }
}



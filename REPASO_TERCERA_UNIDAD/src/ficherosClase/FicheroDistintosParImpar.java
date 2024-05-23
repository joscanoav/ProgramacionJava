package ficherosClase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FicheroDistintosParImpar {

    public static void main(String[] args) {
        // Nombre del archivo de entrada
        String inputFileName = "palabras.txt";
        
        // Nombres de los archivos de salida
        String evenFileName = "pares.txt";
        String oddFileName = "impares.txt";

        try {
            // Crear lectores y escritores de archivos
            Scanner inputFile = new Scanner(new File(inputFileName));
            PrintWriter evenFile = new PrintWriter(new FileWriter(evenFileName));
            PrintWriter oddFile = new PrintWriter(new FileWriter(oddFileName));

            while (inputFile.hasNext()) {
                String word = inputFile.next();
                if (word.length() % 2 == 0) {
                    evenFile.println(word);
                } else {
                    oddFile.println(word);
                }
            }

            // Cerrar archivos
            inputFile.close();
            evenFile.close();
            oddFile.close();

            System.out.println("Palabras procesadas y escritas en los archivos correctamente.");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + inputFileName);
        } catch (IOException e) {
            System.out.println("Error al escribir en los archivos de salida.");
        }
    }
}
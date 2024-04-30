package resolucionExamenes;
import java.util.ArrayList;
import java.util.Scanner;

public class PalabrasMasLargas {


public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Ingrese un texto: ");
	        String texto = sc.nextLine();

	        // Convertimos el texto a minúsculas y dividimos en palabras
	        String[] palabras = texto.toLowerCase().split(" ");

	        // Creamos dos ArrayLists para almacenar palabras y longitudes
	        ArrayList<String> palabrasEncontradas = new ArrayList<>();
	        ArrayList<Integer> longitudes = new ArrayList<>();
	        int longitudMaxima = 0; // Longitud máxima encontrada hasta ahora

	        for (String palabra : palabras) {
	            int longitudActual = palabra.length();

	            // Actualizamos la longitud máxima y las palabras con longitud máxima
	            if (longitudActual > longitudMaxima) {
	                longitudMaxima = longitudActual;
	                palabrasEncontradas.clear(); // Vaciamos la lista de palabras con longitud máxima anterior
	                palabrasEncontradas.add(palabra); // Agregamos la palabra actual
	            } else if (longitudActual == longitudMaxima) {
	                palabrasEncontradas.add(palabra); // Agregamos la palabra actual a la lista existente
	            }

	            longitudes.add(longitudActual);
	        }

	        // Imprimimos las palabras más largas
	        System.out.println("Palabras más largas (longitud " + longitudMaxima + "):");
	        for (String palabra : palabrasEncontradas) {
	            System.out.println("- " + palabra);
	        }
	    }
	}



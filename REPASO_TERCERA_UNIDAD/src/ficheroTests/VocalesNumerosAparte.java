package ficheroTests;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*Haz un programa en java que lea por teclado una cadena y escriaba en un archivo cambiando lo siguiente : Las vocales van en lineas independientes y los digitos se ponen en lineas independientes tantas veces como indique su valor
por ejemplo axmj2Eqt43 debe salir :  
a
xmj
22
E
qt
4444
333*/

public class VocalesNumerosAparte {
		 public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Introduce una cadena:");
		        String input = scanner.nextLine();
		        scanner.close();

		        try (BufferedWriter writer = new BufferedWriter(new FileWriter("cadenaNumero2.txt"))) {
		            StringBuilder consonants = new StringBuilder();

		            for (char c : input.toCharArray()) {
		                if (Character.isDigit(c)) {
		                    // Escribir las consonantes acumuladas antes de escribir el dígito
		                    if (consonants.length() > 0) {
		                        writer.write(consonants.toString());
		                        writer.newLine();
		                        consonants.setLength(0);
		                    }
		                    // Escribir el dígito tantas veces como su valor
		                    int digit = Character.getNumericValue(c);
		                    for (int i = 0; i < digit; i++) {
		                        writer.write(c);
		                    }
		                    writer.newLine();
		                } else if (isVowel(c)) {
		                    // Escribir las consonantes acumuladas antes de escribir la vocal
		                    if (consonants.length() > 0) {
		                        writer.write(consonants.toString());
		                        writer.newLine();
		                        consonants.setLength(0);
		                    }
		                    // Escribir la vocal
		                    writer.write(c);
		                    writer.newLine();
		                } else {
		                    // Acumular consonantes
		                    consonants.append(c);
		                }
		            }

		            // Escribir cualquier consonante acumulada al final
		            if (consonants.length() > 0) {
		                writer.write(consonants.toString());
		                writer.newLine();
		            }

		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }

		    private static boolean isVowel(char c) {
		        return "AEIOUaeiou".indexOf(c) != -1;
		    }
		}
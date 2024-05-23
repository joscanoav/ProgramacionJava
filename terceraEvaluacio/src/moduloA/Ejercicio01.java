package moduloA;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Ejercicio01 {

    public static void main(String[] args) {
    	
        String inputFile = "entrada.txt";
        String outFile = "salida.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
             ) {
        	
            String line;
			int mayusculas = 0;
			int minusculas = 0;

            while ((line = br.readLine()) != null) {
            	
                for (int i = 0; i < line.length(); i++) {
                    // Resetear contadores para cada fila
                	mayusculas = 0;
                	minusculas = 0;
            	
				for (int j = 0; j < line.length(); j++) {
					if (Character.isUpperCase(line.charAt(j))) {
						mayusculas++;
					} else if (Character.isLowerCase(line.charAt(j))) {
						minusculas++;
					}
				 

				 }
				
                }
                
                bw.write(" mayús " + mayusculas );
                bw.write(' ');
                bw.write(" minús " + minusculas );
                bw.write('\n');
				
				
            }   
            
       System.out.println("Palabras han sido clasificadas de Mayuscula a Minuscula.");

        } catch (IOException e) {
            System.err.println("Error al leer o escribir en archivos.");
            e.printStackTrace();
        }
    }
}

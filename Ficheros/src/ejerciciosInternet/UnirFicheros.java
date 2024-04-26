package ejerciciosInternet;

/**
 * 3. Escribe un programa que guarde en un fichero el contenido de otros dos
 *    ficheros, de tal forma que en el fichero resultante aparezcan las líneas
 *    de los primeros dos ficheros mezcladas, es decir, la primera línea será
 *    del primer fichero, la segunda será del segundo fichero, la tercera será
 *    la siguiente del primer fichero, etc.
 *    Los nombres de los dos ficheros origen y el nombre del fichero destino se
 *    deben pasar como argumentos en la línea de comandos.
 *    Hay que tener en cuenta que los ficheros de donde se van cogiendo las
 *    líneas pueden tener tamaños diferentes.
 *
 * @author Luis José Sánchez
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class UnirFicheros {
  public static void main(String[] args) {
    // Get the file paths (replace with actual paths)
    String filePath1 = "C:\\DAN\\DAM\\ProgramacionJava\\Ficheros\\frutas.txt";
    String filePath2 = "C:\\DAN\\DAM\\ProgramacionJava\\Ficheros\\planetas.txt";
    String outputFilePath = "C:\\DAN\\DAM\\ProgramacionJava\\Ficheros\\salida.txt";

    try {
      // Create BufferedReader and BufferedWriter objects
      BufferedReader reader1 = new BufferedReader(new FileReader(filePath1));
      BufferedReader reader2 = new BufferedReader(new FileReader(filePath2));
      BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

      String line1 = "";
      String line2 = "";

      // Read lines from the input files and write them to the output file in an interleaved manner
      while ((line1 != null) || (line2 != null)) {
        line1 = reader1.readLine();
        line2 = reader2.readLine();

        if (line1 != null) {
          writer.write(line1 + "\n");
        }

        if (line2 != null) {
          writer.write(line2 + "\n");
        }
      }

      // Close the BufferedReader and BufferedWriter objects
      reader1.close();
      reader2.close();
      writer.close();

    } catch (IOException ioe) {
      System.out.println("Se ha producido un error de lectura/escritura");
      System.err.println(ioe.getMessage());
    }
  }
}


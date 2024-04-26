package ejerciciosInternet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class PalabraBuscar {

    public static void main(String[] args) {
        // Especifica la ruta del archivo aquí
        String rutaArchivo = "C:\\\\DAN\\\\DAM\\\\ProgramacionJava\\\\Ficheros\\\\salida.txt";  // Cambia esto por la ruta de tu archivo
        
        // Especifica la palabra a buscar aquí
        String palabra = "Naranja";  // Cambia esto por la palabra que quieres buscar
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
            String linea = "";
            int i = 0;
            int repeticiones = 0;
            
            while ((linea = br.readLine()) != null) {
                
                while ((i = linea.indexOf(palabra)) != -1) {
                    linea = linea.substring(i + palabra.length(), linea.length());
                    repeticiones++;
                }
            }
            
            br.close();
            
            System.out.println("La palabra " + palabra + " aparece " + repeticiones + " veces en el fichero.");

        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
}

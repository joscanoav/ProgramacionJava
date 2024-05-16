package ficherosInternet;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopiaFicheros {

	public static void main(String[] args) {
		// Como fichero binario de ejemplo, usamos el mismo fichero.class compilado de esta clase
		
		copia("D:\\prueba.tx","D:\\pruebaCopy.txt");

	}
	// copia de un fichero binario en otro
	public static void copia(String ficheroOriginal, String ficheroCopia){
		// Se abre un ficherooriginal
		try (FileInputStream fileInput = new FileInputStream(ficheroOriginal)){
			// Se abre un fichero donde se guardara la copia
			try(FileOutputStream fileOutput = new FileOutputStream(ficheroCopia)){
				//Necesitamos un array de bytes para guardar lo leido
				byte[] array = new byte [1000];
				// Al leer, no tenemos garantia de leer todo el array
				// bytes en el fichero. Asi que guardamos el numero de bytes
				int leidos = fileInput.read(array);
				
				while(leidos > 0) {
					fileOutput.write(array,0,leidos);
					leidos = fileInput.read(array);
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}catch (Exception e) {
	
		e.printStackTrace();

}
}
}
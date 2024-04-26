package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*Haz un programa que pida al usuario la ruta de un archivo y una cadena. 
 * Después, nos dirá cuántas veces aparece dicha cadena en el archivo.
*/

public class BuscarOcurrencias {

	public static void main(String[] args) {
		//Ruta del archivo
		String path = "C:\\DAN\\prueba.txt";
		// Cadena a buscar
		String search = "%";
		
		try {
			/*Esta línea crea un objeto BufferedReader llamado br para leer texto de forma 
			 * eficiente del archivo especificado por path. Implica crear un objeto File y 
			 * envolverlo en un objeto FileReader antes de pasarlo al constructor BufferedReader.*/
			BufferedReader br = new BufferedReader (
					new FileReader(new File(path))
					);
					/*Esta variable se declara para almacenar cada línea que se lee del archivo.*/
					String line;
					/*int count = 0: Se inicializa un contador para llevar un registro del número total 
					 * de ocurrencias de la cadena de búsqueda (search) en el archivo.*/
					int count = 0;
					/*int lineNumber = 0: Se inicializa un contador para mantener el número de línea actual 
					 * que se está leyendo.*/
					int lineNumber = 0;
					/*int charNumber: Esta variable se usará para almacenar la posición del primer carácter de la ocurrencia
					 *  encontrada de la cadena de búsqueda en la línea actual.*/
					int charNumber;
					/*int offset: Esta variable se usa para realizar un seguimiento de la posición relativa
					 *  de la cadena de búsqueda dentro de la línea actual. Se necesita porque al eliminar ocurrencias de la línea 
					 *  (line.substring(...)), la posición de las ocurrencias posteriores cambia. El offset se suma a la posición encontrada
					 *   (charNumber) para tener la posición real en toda la lectura del archivo.*/
					int offset = 0;
					/*Este bucle while itera a través de cada línea del archivo. La condición (line = br.readLine()) != null
					 *  verifica si se ha llegado al final del archivo (línea nula). Si no es nulo, se lee la siguiente línea 
					 *  en la variable line y el código dentro del bucle se ejecuta para esa línea.*/
					while ((line = br.readLine()) != null) {
						/*Este bucle while anidado se ejecuta dentro del bucle principal para cada línea. Busca todas las ocurrencias de la cadena 
						 * de búsqueda (search) dentro de la línea actual (line).(charNumber = line.indexOf(search)) != -1: La condición verifica si 
						 * se encontró la cadena de búsqueda. El método indexOf devuelve la posición del primer carácter de la ocurrencia o -1 si no 
						 * se encuentra.*/
						while ((charNumber = line.indexOf(search)) != -1) {
							
							/*Si se encuentra una ocurrencia (condición != -1 verdadera), se imprime un mensaje indicando 
							 * el número de línea (lineNumber), la posición del carácter (charNumber) teniendo en cuenta el offset, 
							 * y se aumenta el contador (count).*/
							System.out.println("Ocurrencia en linea " + lineNumber + " caracter " + (charNumber + offset));
							offset += line.substring(0, charNumber + search.length()).length();
							line = line.substring(charNumber + search.length());
							count++; // Recuento de ocurrencias
							/* Si se encuentra una ocurrencia (condición != -1 verdadera), se imprime un mensaje indicando el número de línea (lineNumber), 
							 * la posición del carácter (charNumber) teniendo en cuenta el offset, y se aumenta el contador (count).
								System.out.println(...): Imprime la información de la ocurrencia.
								offset += line.substring(0, charNumber + search.length()).length(): Se actualiza el offset sumando la longitud de la parte de la línea 
								anterior a la ocurrencia encontrada. Esto es necesario para calcular la posición correcta de las ocurrencias posteriores en la línea completa.
								line = line.substring(charNumber + search.length()): Se elimina la ocurrencia encontrada de la línea actual (line). El método substring se usa 
								para obtener la parte restante de la línea después de la ocurrencia.*/
						}
						
						offset=0;
						lineNumber++;
						}
					/*Después de procesar todas las ocurrencias en una línea: offset = 0: Se reinicia el offset a 0 para la siguiente línea. lineNumber++: 
					 * Se incrementa el contador de línea para la siguiente iteración del bucle principal.*/
						System.out.println("Se han detectado " + count + " ocurrencias.");
						br.close();
					} catch (FileNotFoundException e) {
						System.err.println("ERROR: archivo no encontrado.");
					} catch (IOException e) {
						System.err.println("ERROR: no se pudo leer/escribir/cerrar");
					}
					
	}

}

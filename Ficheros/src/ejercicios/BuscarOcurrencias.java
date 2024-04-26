package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*Haz un programa que pida al usuario la ruta de un archivo y una cadena. 
 * Despu�s, nos dir� cu�ntas veces aparece dicha cadena en el archivo.
*/

public class BuscarOcurrencias {

	public static void main(String[] args) {
		//Ruta del archivo
		String path = "C:\\DAN\\prueba.txt";
		// Cadena a buscar
		String search = "%";
		
		try {
			/*Esta l�nea crea un objeto BufferedReader llamado br para leer texto de forma 
			 * eficiente del archivo especificado por path. Implica crear un objeto File y 
			 * envolverlo en un objeto FileReader antes de pasarlo al constructor BufferedReader.*/
			BufferedReader br = new BufferedReader (
					new FileReader(new File(path))
					);
					/*Esta variable se declara para almacenar cada l�nea que se lee del archivo.*/
					String line;
					/*int count = 0: Se inicializa un contador para llevar un registro del n�mero total 
					 * de ocurrencias de la cadena de b�squeda (search) en el archivo.*/
					int count = 0;
					/*int lineNumber = 0: Se inicializa un contador para mantener el n�mero de l�nea actual 
					 * que se est� leyendo.*/
					int lineNumber = 0;
					/*int charNumber: Esta variable se usar� para almacenar la posici�n del primer car�cter de la ocurrencia
					 *  encontrada de la cadena de b�squeda en la l�nea actual.*/
					int charNumber;
					/*int offset: Esta variable se usa para realizar un seguimiento de la posici�n relativa
					 *  de la cadena de b�squeda dentro de la l�nea actual. Se necesita porque al eliminar ocurrencias de la l�nea 
					 *  (line.substring(...)), la posici�n de las ocurrencias posteriores cambia. El offset se suma a la posici�n encontrada
					 *   (charNumber) para tener la posici�n real en toda la lectura del archivo.*/
					int offset = 0;
					/*Este bucle while itera a trav�s de cada l�nea del archivo. La condici�n (line = br.readLine()) != null
					 *  verifica si se ha llegado al final del archivo (l�nea nula). Si no es nulo, se lee la siguiente l�nea 
					 *  en la variable line y el c�digo dentro del bucle se ejecuta para esa l�nea.*/
					while ((line = br.readLine()) != null) {
						/*Este bucle while anidado se ejecuta dentro del bucle principal para cada l�nea. Busca todas las ocurrencias de la cadena 
						 * de b�squeda (search) dentro de la l�nea actual (line).(charNumber = line.indexOf(search)) != -1: La condici�n verifica si 
						 * se encontr� la cadena de b�squeda. El m�todo indexOf devuelve la posici�n del primer car�cter de la ocurrencia o -1 si no 
						 * se encuentra.*/
						while ((charNumber = line.indexOf(search)) != -1) {
							
							/*Si se encuentra una ocurrencia (condici�n != -1 verdadera), se imprime un mensaje indicando 
							 * el n�mero de l�nea (lineNumber), la posici�n del car�cter (charNumber) teniendo en cuenta el offset, 
							 * y se aumenta el contador (count).*/
							System.out.println("Ocurrencia en linea " + lineNumber + " caracter " + (charNumber + offset));
							offset += line.substring(0, charNumber + search.length()).length();
							line = line.substring(charNumber + search.length());
							count++; // Recuento de ocurrencias
							/* Si se encuentra una ocurrencia (condici�n != -1 verdadera), se imprime un mensaje indicando el n�mero de l�nea (lineNumber), 
							 * la posici�n del car�cter (charNumber) teniendo en cuenta el offset, y se aumenta el contador (count).
								System.out.println(...): Imprime la informaci�n de la ocurrencia.
								offset += line.substring(0, charNumber + search.length()).length(): Se actualiza el offset sumando la longitud de la parte de la l�nea 
								anterior a la ocurrencia encontrada. Esto es necesario para calcular la posici�n correcta de las ocurrencias posteriores en la l�nea completa.
								line = line.substring(charNumber + search.length()): Se elimina la ocurrencia encontrada de la l�nea actual (line). El m�todo substring se usa 
								para obtener la parte restante de la l�nea despu�s de la ocurrencia.*/
						}
						
						offset=0;
						lineNumber++;
						}
					/*Despu�s de procesar todas las ocurrencias en una l�nea: offset = 0: Se reinicia el offset a 0 para la siguiente l�nea. lineNumber++: 
					 * Se incrementa el contador de l�nea para la siguiente iteraci�n del bucle principal.*/
						System.out.println("Se han detectado " + count + " ocurrencias.");
						br.close();
					} catch (FileNotFoundException e) {
						System.err.println("ERROR: archivo no encontrado.");
					} catch (IOException e) {
						System.err.println("ERROR: no se pudo leer/escribir/cerrar");
					}
					
	}

}

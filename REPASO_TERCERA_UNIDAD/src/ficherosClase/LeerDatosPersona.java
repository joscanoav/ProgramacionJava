package ficherosClase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*Haz un programa que pida al usuario los datos de una persona y los añada
 *  a un archivo "personas.txt". Cada persona tiene nombre, apellido 1, apellido
 *   2 y fecha de nacimiento. Los datos se escriben en el archivo separados por
 *    ";", ocupando una línea. Ejemplo de línea para una persona: Juan;Ramos;Salas;17-01-2001.*/

public class LeerDatosPersona {

	public static void main(String[] args) {
		String path = "D:\\persona.txt";
		String[] datos;
		String line;
		
		try {
			 BufferedReader br = new BufferedReader(new FileReader(new File(path)));
			 while ((line = br.readLine()) != null) {
				 datos = line.split(";");
				 System.out.println(datos[0] + " " + datos[1] + " " + datos[2] + " nacio el " + datos[3]);
			 }
			 br.close();
		} catch (IOException e) {
			System.err.println("ERROR: no se pudo escribir la informacion.");
}
		
		
	}

}

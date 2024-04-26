package ejercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribirDatosPersona {

	public static void main(String[] args) {
		
		String nombre = "Mario";
		String apellido1 = "Oscanoa";
		String apellido2 = "Casas";
		String nacimiento = "01/01/2000";
		
		String path = "C:\\DAN\\datos.txt";
		
		try {
			/* El segundo argumento del FileWriter es true, lo que indica que el archivo se abrirá en modo de adición
			 *  (append), permitiendo agregar datos al final del archivo existente sin sobreescribirlo.*/
			PrintWriter pw = new PrintWriter(new FileWriter(new File(path), true));
			
            //for (int i = 0; i < 10; i++) {

			pw.println(nombre + ";" + apellido1 + ";" + apellido2 + ";" + nacimiento);
            //}
			pw.close();
		} catch (Exception e) {
			System.out.println("ERROR: no se pudo escribir la informacion");
		}
		
	}

}

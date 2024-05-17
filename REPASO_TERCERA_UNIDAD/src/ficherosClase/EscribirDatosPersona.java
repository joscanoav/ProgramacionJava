package ficherosClase;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribirDatosPersona {

	public static void main(String[] args) {
		String nombre = "Mario";
		String apellido1 = "Lopez";
		String apellido2 = "Casas";
		String nacimiento = "01/01/2000";
		
		String path = "D:\\persona.txt";
		
		try {
			PrintWriter pw = new PrintWriter( new FileWriter(new File(path),true));
			pw.println(nombre + ";" + apellido1 + ";" + apellido2 + ";" + nacimiento);
			pw.close();
		} catch (Exception e) {
System.err.println("ERROR: no se pido escribir la informacion");
}
		
	}

}

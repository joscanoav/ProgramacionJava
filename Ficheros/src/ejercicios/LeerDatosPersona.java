package ejercicios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerDatosPersona {

	public static void main(String[] args) {
		String path = "C:\\DAN\\datos.txt";
		String[] datos;
		String line;

		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(path)));

			while ((line = br.readLine()) != null) {
				datos = line.split(";");
				System.out.println(datos[0] + " " + datos[1] + " " + datos[2] + " nació el " + datos[3]);
			}

			br.close();
		} catch (IOException e) {
			System.err.println("ERROR: no se pudo escribir la información.");
		}

	}

}
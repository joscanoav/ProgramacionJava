package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerDatosPersona2 {

	public static void main(String[] args) {
		String path = "C:\\DAN\\prueba.txt";
		String[] datos;
		String line;

		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(path)));

			while ((line = br.readLine()) != null) {
				if (!line.isEmpty()) {
					datos = line.split(";");
					if (datos.length > 1) {
						System.out.println(datos[0] + " " + datos[1] + " " + datos[2] + " nació el " + datos[3]);
					} else {
						System.err.println("WARNING: Línea con menos de 4 elementos: " + line);
					}
				}
			}

			br.close();
		} catch (IOException e) {
			System.err.println("ERROR: no se pudo escribir la información.");
		}

	}

}


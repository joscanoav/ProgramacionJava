package ficheros;
/*
import java.io.BufferedReader;
import java.io.FileReader;

public class BuscarOcurrencias {

	public static void main(String[] args) {
		//Ruta del archivo
		String path = "C:\\Users\\Alumno\\Desktop";
		String search = "ABC";
		try {
			BufferedReader br = new BufferedReader(
			new FileReader(new File(path))
			);
			String line;
			int count = 0;
			int lineNumber = 0;
			int charNumber;
			int offset = 0;
			
			
			while ((line = br.readLine()) != null) {
				while ((charNumber = line.indexOf(search)) != -1);
				System.out.println("Ocurrencia en linea " + lineNumber + " caracter " + charNumber);
				offset += line.substring(0,charNumber + search.length());
				line = line.substring(charNumber + search.length());
				count ++; // Recuento de ocurrencias
			}
			
			lineNumber++;
		}
		
		System.out.println("Se han detectado " + count + " ocurrencias");
		
		br.close();
		
		}catch (FileNotFoundException e) {
			System.err
		}
	}

}
*/

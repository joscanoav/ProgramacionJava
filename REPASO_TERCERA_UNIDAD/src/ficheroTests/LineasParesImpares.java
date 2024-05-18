package ficheroTests;

import java.io.BufferedReader;
import java.io.FileReader;

public class LineasParesImpares {

	public static void main(String[] args) {
		String path = "LineaPaImpar.txt";
		String linea;
		Boolean isCorrecto = true;
		int NumeroLinea = 1;
		
		try (BufferedReader br = new BufferedReader( new FileReader(path))){
			while((linea = br.readLine()) != null){
				if (NumeroLinea % 2 != 0)
					if ( linea.length() % 2 == 0)
					{
						isCorrecto = false;
					System.out.println("Error la linea: " + NumeroLinea + " no es correcta impar") ;
					} else {
						if(linea.length() % 2 != 0) {
							isCorrecto = false;
							System.out.println("Error la linea: " + NumeroLinea + " no es correcta par") ;

						}
					}
					NumeroLinea++;
				}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
				


package ficherosInternet;

import java.io.BufferedReader;
import java.io.FileReader;

public class LeeFichero {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("D:\\archivo.txt")){
			BufferedReader br = new BufferedReader(fr);
			// lectura fichero
			String linea;
			while((linea=br.readLine())!=null)
				System.out.println(linea);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}


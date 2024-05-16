package ficherosInternet;

import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribeFichero {

	public static void main(String[] args) {
		
		try (FileWriter fichero = new FileWriter("D:\\prueba.txt"))
		
		{
			PrintWriter pw = new PrintWriter(fichero);
			for (int i = 0; i < 10; i++) {
				pw.println("Linea " + i);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

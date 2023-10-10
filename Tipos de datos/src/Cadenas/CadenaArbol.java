package Cadenas;
import java.util.Scanner;
public class CadenaArbol {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String texto;
		String palabraPiramide = "";
		System.out.println("Introduce una cadena: ");
		texto = in.nextLine();
		
		for(int i = 0; i < texto.length();i++) {
			palabraPiramide += texto.charAt(i);
			System.out.println(palabraPiramide);
		
	}

}

}

package ModeloA;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String cadena;
		boolean flag = true;

		System.out.print("Introduce una cadena: ");
		cadena = scanner.nextLine();
					
			for(int i=0;i< cadena.length();i++) {
				char caracter = cadena.charAt(i);
				
				if (cadena.charAt(i) < 'A' || cadena.charAt(i) > 'Z' )  {
					flag = false;
				}else if (Character.isDigit(caracter)) {
						flag = false;
				}
				
			}
				if (flag) {
					System.out.println("Cadena correcta!");
				} else {
					System.out.println("ERROR: cadena incorrecta.");
		}

			
	}
}

			
	





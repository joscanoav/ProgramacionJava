package estructuras;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		
		int num;
		//if -> true
		//else -> false
		
		System.out.print("Introduce numero: ");
		Scanner entrada = new Scanner(System.in);
		num = entrada.nextInt();
		
		if (num < 20) {
			System.out.println("La variable es menor que 20.");
			
		} else {
			System.out.println("La variable es mayor o igual que 20");
			
		}	
		
		System.out.println("Fin del programa");
	}

}

package Cadenas;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		/* Pedir al usuario un n�mero y mostrar una pir�mide 
		de asteriscos con ese n�mero de base. Ejemplo: pir�mide de base 5:*/
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escriba el numero de la base de la piramide: ");
		int base = entrada.nextInt();
		
		if (base > 0) {
			for	(int i = 1; i <= base; i++) {
				for (int j = base - i ;j >= 1;j--) {
					System.out.print(" ");
				}
				for (int k=1; k<= i ; k++) {
					System.out.print(" *");
				}
				System.out.println();
			}
		}else {
			System.out.println("El numero de la base debe ser mayor a 0");
		}
		
	}

}

package EstructuraFor;
import java.util.Scanner;
public class Promedio {

	public static void main(String[] args) {
		// Desarrollar un programa que permita la carga
		//de 10 valores por teclado y nos muestre posteriormente
		//la suma de los valores ingresados y su promedio. Este problema
		//ya lo desarrollamos , lo resolveremos empleando la estructura
		//for.
		
		Scanner entrada = new Scanner(System.in);
		int f, valor;
		double promedio=0;
		double suma =0;
		suma = 0;
		for (f=1;f<=10;f++) {
		System.out.println("Ingrese valor: ");
		valor = entrada.nextInt();
		suma = suma + valor;
		}
		
		System.out.println("La suma es: ");
		System.out.println(suma);
		promedio=suma/10;
		System.out.println("El promedio es: ");
		System.out.println(promedio);
	}

}

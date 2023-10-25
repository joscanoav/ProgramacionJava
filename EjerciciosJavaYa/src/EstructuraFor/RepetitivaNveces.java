package EstructuraFor;
import java.util.Scanner;
public class RepetitivaNveces {

	public static void main(String[] args) {
	/*Escribir un programa que lea n números enteros y calcule la cantidad de valores mayores o iguales a 1000.
Este tipo de problemas también se puede resolver empleando la estructura repetitiva for. Lo primero que se hace es cargar una variable que indique la cantidad de valores a ingresar. Dicha variable se carga antes de entrar a la estructura repetitiva for.
La estructura for permite que el valor inicial o final dependa de una variable cargada previamente por teclado.*/

	Scanner teclado = new Scanner (System.in);
	int cantidad, n, i,valor;
	cantidad=0;
	System.out.println("Cuantos valores ingresara: ");
	n = teclado.nextInt();
	for (i=1; i<=n;i++) {
		System.out.print("Ingrese el valor: ");
		valor=teclado.nextInt();
		if (valor>=1000) {
			cantidad +=  1;
		}
	}
	
	System.out.println("La cantidad de valores ingresados mayores o igales a ml son: " + cantidad);
		
		
	}

}

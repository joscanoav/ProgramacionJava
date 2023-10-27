package EstructuraFor;

import java.util.Scanner;

public class SumaCincoUltimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int i, valor, suma;
		suma=0;
		for(i=1; i<=10;i++) {
		System.out.println("Ingrese Valor: ");
		valor = teclado.nextInt();
		if (i>5) {
			suma +=valor;
		}
		}
		System.out.println("La suma de los ultimos 5 valores es: ");
		System.out.println(suma);
	}

}

package EstructuraFor;

import java.util.Scanner;

public class TablaMultiplicar {
	public static void main(String[] ar) {
		Scanner teclado = new Scanner(System.in);
		int i,valor;
		System.out.println("Ingrese un valor entre 1 y 10: ");
		valor=teclado.nextInt();
		for(i=valor;i<=valor*12;i=i+valor) {
			System.out.print(i+"-");
		}
		
}
	
}

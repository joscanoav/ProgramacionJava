package EstructuraFor;

import java.util.Scanner;

public class CantidadPositivosNegativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int i,valor,negativos,positivos,mult15,sumapares;
		negativos=0;
		positivos=0;
		mult15=0;
		sumapares=0;
		for (i=1;i<=10;i++) {
			System.out.println("Ingrese valor: ");
			valor= teclado.nextInt();
			if (valor<0) {
				negativos++;
			}else {
				if(valor>0) {
					positivos++;
				}
			}
		if (valor%15==0) {
			mult15++;
		}
		if(valor%2==0) {
			sumapares += valor;
		}
		}
		
        System.out.print("Cantidad de valores negativos:");
        System.out.println(negativos);
        System.out.print("Cantidad de valores positivos:");
        System.out.println(positivos);
        System.out.print("Cantidad de valores múltiplos de 15:");
        System.out.println(mult15);
        System.out.print("Suma de los valores pares:");
        System.out.println(sumapares);
        }

}

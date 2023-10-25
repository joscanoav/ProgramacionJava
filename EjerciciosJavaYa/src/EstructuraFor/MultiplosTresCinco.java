package EstructuraFor;
import java.util.Scanner;
public class MultiplosTresCinco {

	public static void main(String[] args) {
		// Escribir un programa que lea 10 
		//números enteros y luego muestre cuántos
		//valores ingresados fueron múltiplos de
		//3 y cuántos de 5. Debemos tener en cuenta que
		//hay números que son múltiplos de 3 y de 5 a la vez.



	Scanner teclado = new Scanner(System.in);
	int mul3, mul5, valor, i;
	mul3= 0;
	mul5=0;
	for(i=1; i<=10; i++) {
		System.out.println("Ingrese Valor:");
		valor=teclado.nextInt();
		if (valor%3==0) {
			mul3 += 1;
		}
		if (valor%5==0) {
			mul5=mul5+ 1;
		}
	}
	
	System.out.println("Cantidad de valores ingresados multiplos de 3: " + mul3);
	System.out.println("Cantidad de valores ingresados multiplos de 5: " + mul5);
	
	}

}

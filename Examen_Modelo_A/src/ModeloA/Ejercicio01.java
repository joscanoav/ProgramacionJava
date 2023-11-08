package ModeloA;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
        
		int mayor1;
		int mayor2;
		int mayorTotal;
		int menor1;
		int menor2;
		int menorTotal;
		
		System.out.println("Escriba un  primer numero:  ");
		int num1 = teclado.nextInt();
		System.out.println("Escriba un  segundo numero:  ");
		int num2 = teclado.nextInt();
		System.out.println("Escriba un  tercer numero:  ");
		int num3 = teclado.nextInt();
		System.out.println("Escriba un  tercer numero:  ");
		int num4 = teclado.nextInt();
		
		mayor1 = Math.max(num1,num2);
		mayor2 = Math.max(num3, num4);
		mayorTotal= Math.max(mayor1, mayor2);
		
		menor1 = Math.min(num1,num2);
		menor2 = Math.min(num3, num4);
		menorTotal= Math.min(menor1, menor2);
						
		
System.out.println("El numenor mayor es : " + mayorTotal);
System.out.println("El numero menor es :" + menorTotal);

		}
	}



          
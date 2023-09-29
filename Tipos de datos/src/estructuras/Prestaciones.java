package estructuras;

import java.util.Scanner;

public class Prestaciones {

	public static void main(String[] args) {

		int  edad;
		double  ingresos;

		System.out.print("Escriba su edad: ");
		Scanner entrada = new Scanner(System.in);
		edad = entrada.nextInt();
		System.out.print("Escriba sus ingresos anuales: ");
		ingresos = entrada.nextDouble();
		
		if (edad >= 18){
			
			if (ingresos > 25000){
				
				System.out.println("No recibe prestación");
			} else {
				System.out.println("Recibe una prestación de " + (ingresos * 0.25));
			
			}
			} else {
			
				System.out.println("Recibe una prestación de " + (ingresos * 0.40));
			}
				
			}
			
		}	
		
			




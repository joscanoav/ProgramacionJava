package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Haz un programa que pida a un usuario su fecha de cumpleaños 
		//(día, luego mes y luego año) y muestre la fecha con el mes en
		//palabra. Ejemplo: si introduce 1, 2, 2001 mostraría "1 de febrero
		//de 2001".
		int day;
		int month;
		int year;
		String mes;
	
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el dia: ");
		day = teclado.nextInt();
		System.out.print("Introduce el mes: ");
		month = teclado.nextInt();
		System.out.print("Introduce el año: ");
		year = teclado.nextInt();
		
		switch (month) {
		case 1:
			mes = "Enero";
			break;
		case 2:
			mes = "Febrero";
			break;
		case 3:
			mes = "Marzo";
			break;
		case 4:
			mes = "Abril";
			break;
		case 5:
			mes = "Mayo";
			break;
		case 6:
			mes = "Junio";
			break;
		case 7:
			mes = "Julio";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Septiembre";
			break;
		case 10:
			mes = "Octubre";
			break;
		case 11:
			mes = "Noviembre";
			break;
		case 12:
			mes = "Diciembre";
			break;
		
		default:
			mes= "Mes no valido";
		}
		
		System.out.println("La Fecha de su cumpleaños es " + day + " de " + mes + " de " + year);

	}

}

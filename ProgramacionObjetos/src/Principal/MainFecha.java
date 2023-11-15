package Principal;

import java.util.Scanner;

import Objetos.Fecha;

public class MainFecha {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la fecha (formato: dd mm aaaa:");
		System.out.print("Dia: ");
		int dia = teclado.nextInt();
		System.out.print("Mes: ");
		int mes = teclado.nextInt();
		System.out.print("Año: ");
		int año = teclado.nextInt();
		
		Fecha fecha = new Fecha(dia,mes,año);
		if (fecha.esValida()) {
			System.out.println("La fecha es validad.");
			
			int diasDesdeAñoNuevo = fecha.calcularDias();
			System.out.println("Dias desde Año Nuevo:" + diasDesdeAñoNuevo);
		} else {
			System.out.println("La fecha no es válida. Por favor, ingrese una fecha válida.");
		}
		
		teclado.close();
	}

}

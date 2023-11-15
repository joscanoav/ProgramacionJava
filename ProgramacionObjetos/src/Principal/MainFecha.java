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
		System.out.print("A�o: ");
		int a�o = teclado.nextInt();
		
		Fecha fecha = new Fecha(dia,mes,a�o);
		if (fecha.esValida()) {
			System.out.println("La fecha es validad.");
			
			int diasDesdeA�oNuevo = fecha.calcularDias();
			System.out.println("Dias desde A�o Nuevo:" + diasDesdeA�oNuevo);
		} else {
			System.out.println("La fecha no es v�lida. Por favor, ingrese una fecha v�lida.");
		}
		
		teclado.close();
	}

}

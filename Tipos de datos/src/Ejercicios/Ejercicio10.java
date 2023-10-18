package Ejercicios;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
	/* Haz un programa que simule una cuenta bancaria
	 *  y los ingresos/extracciones de dinero llevados 
	 *  a cabo sobre ésta. El usuario comienza con 0 
	 *  euros y se le da la opción de "ingresar", 
	 *  "retirar" o "salir". Cuando el usuario ingresa 
	 *  dinero, indica la cantidad y se añade al saldo 
	 *  de la cuenta. Si quiere retirar, se le pide la
	 *   cantidad y, si es viable (se ha podido pasar 
	 *   del saldo disponible), se extrae de la cuenta. 
	 *   Cuando quiera salir, el programa termina. 
	 *   Entre cada movimiento realizado se ve siempre 
	 *   el saldo actualizado.
	 *   
Ejemplo de consola:
Saldo disponible: 0
¿Qué deseas hacer?
 1 - Ingresar
 2 - Retirar
 3 - Salir
>> 1

¿Cuánto quieres ingresar? >> 200

Saldo disponible: 200
¿Qué deseas hacer?
 1 - Ingresar
 2 - Retirar
 3 - Salir
>> 2

¿Cuánto quieres retirar? >> 400
Lo siento, saldo insuficiente.

Saldo disponible: 200
¿Qué deseas hacer?
 1 - Ingresar
 2 - Retirar
 3 - Salir
>> 2

¿Cuánto quieres retirar? >> 150

Saldo disponible: 50
¿Qué deseas hacer?
 1 - Ingresar
 2 - Retirar
 3 - Salir
>> 3 */
		Scanner teclado = new Scanner(System.in);
		double saldo = 0;
		double cantidad = 0;
		int option = 0;
		String log = "";
		System.out.println("Saldo disponible: " + saldo);
		
		do {
		System.out.print(
				"¿Que desea hacer? \n"			
				+ "1 - Ingresar \n"
				+ "2 - Retirar \n"
				+ "3 - Historial \n"
				+ "4 - Salir \n"
				+ ">>"	
								
		);
		option = teclado.nextInt();
		switch (option) {
		case 1:
			System.out.println("Cuanto desea Ingresar: ");
			cantidad = teclado.nextDouble();
			saldo += cantidad;
			System.out.println("La operacion fue exitosa");
			log += "+" + cantidad + "\n";
			break;
			
		case 2:
			System.out.println("Cuanto desea Retirar: ");
			cantidad = teclado.nextDouble();
			saldo -= cantidad;
			System.out.println("La operacion fue exitosa");
			log += "-" + cantidad + "\n";
			break;

		case 3:
			System.out.println("El estado de cuenta es el siguiente:  " + saldo);
			String[] transacciones = log.split("\n");
			for	(String estadoCuenta:transacciones) {
				System.out.println(estadoCuenta);
			}
			break;
		   } 
		
				
		
      
	 } while (option != 4);
		System.out.println("Gracias por usar nuestra app");
		
  }
}

package Ejercicios;

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

		double cuenta = 0;
		System.out.println("Saldo disponible: " + cuenta);
		
		System.out.print(
				"Saldo disponible: 0  ¿Que desea hacer? \n"			
				+ "1 - Ingresar \n"
				+ "2 - Retirar \n"
				+ "3 - Salir \n"
				+ ">>"	
								
		);
		
		
	}

}

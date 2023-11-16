package Principal;

import java.util.Scanner;

import Objetos.CuentaBancaria;

public class MainCuentaBancaria {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		String fechaNacimiento;
		String numeroCuenta;
		
		do{
			System.out.print("Introduce el nombre: ");
			nombre = teclado.nextLine();
			if (nombre.equals("")) {
				System.out.println("Error: Nombre vacio");
			}
		} while (nombre.equals(""));
	
		do {
			System.out.print("Introduce la fecha de nacimiento (dd/MM/yyyy):");
			fechaNacimiento = teclado.nextLine();
			if(fechaNacimiento.equals("")) {
				System.out.print("Error: Fecha de nacimiento vacio");
			}
		}while(fechaNacimiento.equals(""));
	
		do {
			System.out.print("Introduce su numero de cuenta:");
			numeroCuenta = teclado.nextLine();
			if (numeroCuenta.matches("^[0-9]*$")) {
				System.out.println("Numero de cuenta valido");
				break;
			}else {
				System.out.println("Error: Numero de cuenta");
				continue;
			}
		}while (true);
		
		CuentaBancaria cuenta = new CuentaBancaria(nombre, fechaNacimiento, numeroCuenta);
		
		int option;
		
		do {
			System.out.println("\nMenu Principal:");
			System.out.println("1. Ver datos de la cuenta");
			System.out.println("2. Ingresar");
			System.out.println("3. Retirar");
			System.out.println("4. Ver equivalencia del saldo en otras monedas");
			System.out.println("5. Ver la cantidad de gastos realizados");
			System.out.println("6. Ver la cantidad de gastos realizados");
			System.out.println("7. Salir");
			System.out.println("8. Ver log");
			System.out.println(">> ");
			option = teclado.nextInt();
			
			switch(option) {
			case 1 : 
				cuenta.verDatosCuenta();
				break;
			case 2:
				cuenta.realizarIngreso();
				break;
			case 3:
				cuenta.realizarRetiro();
				break;
			case 4:
				cuenta.verEquivalenciaSaldo();
				break;
			case 5:
				cuenta.verCantidadIngresos();
				break;
			case 6:
				cuenta.verCantidadGastos();
			case 7:
				System.out.println("Gracias por utilizar el programa");
				break;
			case 8:
				cuenta.verLog();
				break;
				default:
					System.out.println("Opcion no Validad.");
			}
		}while(option!=7);
		
		teclado.close();
	}

}

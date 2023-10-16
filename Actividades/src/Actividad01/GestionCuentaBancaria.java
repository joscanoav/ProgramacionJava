package Actividad01;
import java.util.Scanner;

public class GestionCuentaBancaria {
	
	public static void main(String[] args) {
		String nombre;
		String fechaNacimiento;
		String numeroCuenta;
		double saldo = 0.00;
		double cantidad = 0;
		double cambio = 0;
		String log ="";
		int option;
		int monedaoption;
		int cantidadIngresos=0;
		int cantidadGastos=0;
		int confirmacionDeuda;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Introduce la fecha de nacimiento (dd/MM/yyyy): ");
		fechaNacimiento = teclado.nextLine();
		System.out.println("Introduce el numero de cuenta: ");
		numeroCuenta = teclado.nextLine();
		
		do {
			System.out.println("Menu Principal:");
			System.out.println("1. Ver datos de la cuenta: ");
			System.out.println("2. Ingresar: ");
			System.out.println("3. Retirar: ");
			System.out.println("4. Ver la equivalencia del saldo en otras monedas: " );
			System.out.println("5. Ver la cantidad de ingresos realizados: ");
			System.out.println("6. Ver la cantidad de gastos realizados: ");
			System.out.println("7. Salir: ");
			
			option = teclado.nextInt();
			
			switch (option) {
			case 1:
				System.out.println("Nombre: " + nombre);
				System.out.println("Fecha de nacimiento: " + fechaNacimiento);
				System.out.println("Numero de cuenta: " + numeroCuenta);
				System.out.println("Saldo: " + saldo + " €");
				break;
			case 2:
				System.out.println("Introduce la cantidad a ingresar: ");
				cantidad  = teclado.nextDouble();
				saldo += cantidad;
				log += "+ " + cantidad + "\n";
				System.out.println("Ingreso realizado satisfactoriamente");
				cantidadIngresos++;
				break;
			case 3:
				System.out.println("Introduce la cantidad a retirar: ");
				cantidad = teclado.nextDouble();
				
				if (cantidad > saldo) {		
					System.out.println("ADVERTENCIA: Esta operacion hara que debas al banco"); 
					System.out.println("¿Estais seguro de continuar? (1. Si / 2. No)");
					confirmacionDeuda = teclado.nextInt();
					if (confirmacionDeuda !=1) {
						System.out.println("Operacion Cancelada");
						break;
					}
				}
					saldo -= cantidad;
					log += "- " + cantidad + "\n";
					System.out.println("Retirada realizada satisfactoriamente");
					cantidadGastos++;
					break;
			case 4:
				System.out.println("Ingrese la moneda deseada a convertir: ");
				System.out.println("1. Dolares americanos");
				System.out.println("2. Libras esterlinas");
				System.out.println("3. Yuanes chinos");
				System.out.println("Opcion: ");
				monedaoption = teclado.nextInt();
				switch (monedaoption) {
					case 1:
						cambio = saldo * 1.15;
						System.out.println("Saldo en Dolares americanos es de: " + cambio);
						break;
					case 2:
						cambio = saldo * 0.95;
						System.out.println("Saldo en Libras esterlinas es de :" + cambio);
						break;
					case 3:
						cambio = saldo * 0.13;
						System.out.println("Saldo en Yuanes chinos es de :" + cambio);
						break;
					default:
						System.out.println("Opcion no Valida.");
								
				}
				break;
			case 5:
				System.out.println("La cantidad de ingresos en total son: " + cantidadIngresos);
				String[] transaccionesIngresos = log.split("\n");
				for	(String transaccion:transaccionesIngresos) {
					if(transaccion.startsWith("+")) {
					System.out.println(transaccion);
					}
				}
				break;
			case 6: 
				System.out.println("La cantidad de gastos en total son: " + cantidadGastos);
				String[] transaccionesGastos = log.split("\n");
				for	(String transaccion:transaccionesGastos) {
					if(transaccion.startsWith("-")) {
					System.out.println(transaccion);
					}
				}
				break;
			case 7:
				System.out.println("Gracias por utilizar el programa");
				break;
			case 8:
				System.out.println(log);
				break;
			default:
				System.out.println("Opcion no Valida.");			
				
			}
			
						
		}while (option !=7);
	}

}

package Objetos;

import java.util.Scanner;

public class CuentaBancaria {
	
	public String nombre;
	public String fechaNacimiento;
	public String numeroCuenta;
	public double saldo = 0.00;
	public double cantidad=0;
	public String log="";
	public int cantidadIngresos=0;
	public int cantidadGastos=0;
	
	
	public CuentaBancaria(String nombre, String fechaNacimiento, String numeroCuenta) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.numeroCuenta = numeroCuenta;
	}
	
	public void verDatosCuenta() {
		System.out.println("Nombre:" + nombre);
		System.out.println("Fecha de nacimiento: " + fechaNacimiento);
		System.out.println("Numero de cuenta: " + numeroCuenta);
		System.out.println("Saldo:" + saldo + "€");
	}
	
	public void realizarIngreso() {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la cantidad a ingresar");
		cantidad = teclado.nextDouble();
		saldo += cantidad;
		log += "+" + cantidad + "\n";
		System.out.println("Ingreso realizado satisfactoriamente");
		cantidadIngresos++;
	}
	
	public void realizarRetiro() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la cantidad a retirar:");
		cantidad = teclado.nextDouble();
		if(cantidad > saldo) {
			System.out.println("ADVERTENCIA: Esta operacion hara que debas al banco");
			System.out.println("¿Estais seguro de continuar? (1.Si/2.No)");
			int confirmacionDeuda = teclado.nextInt();
			if (confirmacionDeuda !=1) {
				System.out.println("Operacion Cancelada");
				return;
			}
		}
		
		saldo -=cantidad;
		log += "-" + cantidad + "\n";
		System.out.println("Retirada realizada satisfactoriamente");
		cantidadGastos++;
	}
	
	public void verEquivalenciaSaldo() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la moneda deseada a convertir: ");
		System.out.println("1.Dolares americanos");
		System.out.println("2.Libras esterlinas");
		System.out.println("3. Yuanes chinos");
		System.out.println("Opcion:");
		int monedaOption = teclado.nextInt();
		double cambio = 0;
		
		switch (monedaOption) {
		case 1 :
			cambio = saldo /0.95;
			System.out.println("Saldo en Dolares americanos es de: " + "$" + cambio);
			break;
		case 2:
			cambio = saldo/1.15;
			System.out.println("Saldo en Libras esterlinas es de: " + "£" + cambio);
			break;
		case 3:
			cambio=saldo / 0.13;
			System.out.println("Saldo en Yuanes chinos es de: " + "¥" + cambio);
			break;
			default:
				System.out.println("Opcion no Valida.");
		}
		
	}
	
	public void verCantidadIngresos() {
		System.out.println("La cantidad de ingresos en total son: " + cantidadIngresos);
		String[] transaccionesIngresos = log.split("\n");
		for (String transaccion: transaccionesIngresos) {
			if(transaccion.startsWith("+")) {
				System.out.println(transaccion);
			}
		}
	}
	
	public void verCantidadGastos() {
		System.out.println("La cantidad de gastos en total son:" + cantidadGastos);
		String[] transaccionesGastos = log.split("\n");
		for (String transaccion: transaccionesGastos) {
		if(transaccion.startsWith("-")) {
			System.out.println(transaccion);
		}
	}
	
}

	public void verLog() {
		System.out.println(log);
	}
	
}

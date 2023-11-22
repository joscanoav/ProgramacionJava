package EstructuraDatosTipoVector;

import java.util.Scanner;

public class SueldosTurnos {
	private Scanner teclado;
	private float[] turnoMan;
	private float[] turnoTar;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		turnoMan = new float [4];
		turnoTar = new float[4];
		System.out.println(" Sueldos de empleados del turno Ma�ana");
		for (int f=0;f<4;f++) {
			System.out.print("Ingrese sueldo:");
			turnoMan[f]=teclado.nextFloat();
		}
		
		System.out.println(" Sueldos de empleados del turno tarde");
		for (int f=0;f<4;f++) {
			System.out.print("Ingrese sueldo:");
			turnoTar[f]=teclado.nextFloat();
	}
	
	}
	
	public void calcularGastos() {
		float man=0;
		float tar=0;
		for(int f=0; f<4;f++) {
			man= man+turnoMan[f];
			tar=tar+turnoTar[f];
		}
		System.out.println("Total de gastos del turno de la ma�ana: " + man);
		System.out.println("Total de gastos del turno de la tarde: " + tar);
	}
	
	public static void main(String[] ar) {
		SueldosTurnos pv = new SueldosTurnos();
		pv.cargar();
		pv.calcularGastos();
	}
}

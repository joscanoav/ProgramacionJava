package examenUno;

import java.util.Random;
import java.util.Scanner;

public class Estudiante {
	public String nombre;
	public int edad;
	public double calificacion;
	
	//constructor

	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.calificacion = 0.0;
	}
	
	// Métodos
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Calificación: " + calificacion);
	}
	
	public void ingresarCalificacion() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la calificacion del estudiante: ");
		this.calificacion = scanner.nextDouble();
	}
	
	public void generarCalificacionAletoria() {
		Random random = new Random();
		this.calificacion = random.nextDouble() * 100;//calificacion entre 0 y 100
	}
	
	public void aprobar () {
		if(calificacion >=60) {
			System.out.println(nombre + " ha aprodado.");
		}else {
			System.out.println(nombre + " ha reprobado.");
		}
	}
	

	
	
}

package Principal;

import java.util.Scanner;

import Objetos.Punto;

public class CalcularDistancia {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese las coordenadas del primer punto: ");
		System.out.println("Coordenada X: ");
		double x1 = teclado.nextDouble();
		System.out.println("Coordenada Y: ");
		double y1 = teclado.nextDouble();
		
		System.out.println("Ingrese las coordenadas del segundo punto: ");
		System.out.println("Coordenada X: ");
		double x2 = teclado.nextDouble(); 
		System.out.println("Coordenada Y: ");
		double y2 = teclado.nextDouble();
		
		Punto punto1 = new Punto(x1,y1);
		Punto punto2 = new Punto(x2,y2);
		
		double distancia = punto1.calcularDistancia(punto2);
		System.out.println("La distancia entre los dos puntos es: " + distancia);
		
		teclado.close();
		
	}

}

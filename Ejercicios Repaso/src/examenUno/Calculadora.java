package examenUno;

public class Calculadora {
	
	public int resultado;
	// Constructor por defecto
	public Calculadora( ) {
		this.resultado = 0;
	}
	
	public void operacionesAritmeticas(int a, int b) {
		resultado = a + b;
		System.out.println("Suma: " + resultado);
		
		resultado = a - b;
		System.out.println("Resta: " + resultado);
		
		resultado = a * b;
		System.out.println("Multiplicación: " + resultado);
		
		//Manejo de la division por cero
		
		if(b !=0) {
			resultado = a / b;
			System.out.println("Division: "+ resultado);
		}else {
			System.out.println("No se puede dividir por cero");
		}
		
		resultado = a % b;
		System.out.println("Modulo: " + resultado);
	}
	
	public void operacionesLogicas(int a, int b) {
		System.out.println("Es " + a + " igual a " + b + "? " + (a == b));
		System.out.println("Es " + a + " distinto a " + b + "? " + (a != b));
		System.out.println("Es " + a + " menor que " + b + "? " + (a < b));
		System.out.println("Es " + a + " mayor o igual que " + b + "? " + (a >= b));
	}
	
	public void bucleWhile(int n) {
		int i = 0;
		while(i < n) {
			System.out.println(i + " ");
			i++;
		}
		System.out.println();
	}
	
	public void bucleFor(int n) {
		for( int i = 0; i < n; i++) {
			System.out.println(i + " ");
		}
		System.out.println();
	}
}

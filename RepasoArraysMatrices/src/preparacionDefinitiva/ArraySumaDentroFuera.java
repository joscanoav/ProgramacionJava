package preparacionDefinitiva;

public class ArraySumaDentroFuera {

	public static void main(String[] args) {
		int[] enteros = {1, 0, 2, 2, 1, 5, 7, 9};
		int n1 = 2; // Asumimos que estan leidos por teclado
		int n2 = 7;
		int sumaDentro = 0;
		int sumaFuera = 0;
		String stringDentro = "";
		String stringFuera = "";
		// 2 + 2 + 5 + 7 = 16
		//1 + 0 + 2 + 2 + 1 + 7 + 9 = 22
		
		for (int i = 0; i < enteros.length; i++) {
			//Por dentro
			if(enteros[i] >= n1 && enteros[i] <= n2) {
				sumaDentro += enteros[i]; //Acumulados el numero
				stringDentro += " + " + enteros[i]; // " + 1" , por ejemplo
				
			}
			//Por fuera...
			if(enteros[i] <= n1 || enteros[i] >=n2) {
				sumaFuera += enteros[i];//acumulamos el numero
				stringFuera += " + " + enteros[i];
			}
			
		}
		
		System.out.println(" Por Dentro: " + stringDentro.substring(3)+ " = " + sumaDentro);
		System.out.println(" Por Fuera: " + stringFuera.substring(3)+ " = " + sumaFuera);


	}

}

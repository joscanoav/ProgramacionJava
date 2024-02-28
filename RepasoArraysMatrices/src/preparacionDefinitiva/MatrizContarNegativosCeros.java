package preparacionDefinitiva;

public class MatrizContarNegativosCeros {

	public static void main(String[] args) {

		// Se crea la matriz predeterminada
		int [][] matriz = {
                {-2,5,7,8},
                {-9,-1,1,-2},
                {8,0,1,9}
            };
		// Se inicializa las variables en 0
		int contNegativos = 0;
		int contCeros = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				// Si es negativo
				if(matriz[i][j] < 0) {
					contNegativos++;
				}
				// Si es cero
				if (matriz[i][j] == 0) {
					contCeros++;
				}
			}
			
			System.out.println("Fila " + i + ": " + contNegativos + " Negativos");
			System.out.println("Fila " + i + ": " + contCeros + " Ceros");
			contNegativos = 0; // Reseteamos el contador
			contCeros = 0; // Reseteamos el contador

			
		}
		
	}

}

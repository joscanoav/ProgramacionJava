package matrices;

public class EliminarDolar {

	    public static void main(String[] args) {
	        String[][] matriz = {
	            {"ABC$", "ABS$$", "A$$$"},
	            {"123$", "11$22", "$"},
	            {"$$", "$$$Z", "ZZZ$"}
	        };

	        // Recorrer cada fila de la matriz
	        for (int i = 0; i < matriz.length; i++) {
	            // Recorrer cada elemento de la fila
	            for (int j = 0; j < matriz[i].length; j++) {
	                String elemento = matriz[i][j];
	                int contador = 0;

	                // Contar los s�mbolos '$' en el elemento actual
	                for (int k = 0; k < elemento.length(); k++) {
	                    if (elemento.charAt(k) == '$') {
	                        contador++;
	                    }
	                }

	                // Mostrar el elemento si tiene como m�ximo un s�mbolo '$'
	                if (contador <= 1) {
	                    System.out.print(elemento + " ");
	                }
	            }
	            // Salto de l�nea al finalizar cada fila
	            System.out.println();
	        }
	    }
	}
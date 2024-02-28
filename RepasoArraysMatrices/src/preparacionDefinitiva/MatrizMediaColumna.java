package preparacionDefinitiva;

import java.util.Arrays;

public class MatrizMediaColumna {

	public static void main(String[] args) {
	       double[][] matriz = {
	                {2, 2, 1},
	                {3, 4, 5},
	                {1, 1, 6}
	        };
	        double[] medias = new double[matriz[0].length];

	        for (int j = 0; j < matriz[0].length; j++) {
	            for (int i = 0; i < matriz.length; i++) {
	                medias[j] += matriz[i][j];
	            }
	            medias[j] /= matriz.length;
	        }

	        System.out.println(Arrays.toString(medias));
	    }
	}
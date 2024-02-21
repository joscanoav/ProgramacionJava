package mixArrayMatrices;

import java.util.Arrays;

public class ColumnasAnd {

	public static void main(String[] args) {
		boolean[][] matriz = {
				{true, false, false, true},
				{true, true, true, true},
				{false, true, false, true},

		};
		
		boolean[] andsCols = new boolean[matriz[0].length];
		//Rellena el array con todo "true".
		Arrays.fill(andsCols, true);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				andsCols[j] = andsCols[j] && matriz[i][j];
				
			}
			
		}
		
		System.out.println(andsCols);
	}

}

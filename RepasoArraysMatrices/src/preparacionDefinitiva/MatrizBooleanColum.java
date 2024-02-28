package preparacionDefinitiva;

import java.util.Arrays;

public class MatrizBooleanColum {

	public static void main(String[] args) {
        boolean[][] matriz = {
                {true, false, false, true},
                {true, true, true, true},
                {false, true, false, true},
        };
        boolean[] andsFilas = new boolean[matriz.length];

        // Rellena el array con todo "true".
        Arrays.fill(andsFilas, true);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                andsFilas[i] = andsFilas[i] && matriz[i][j];
            }
        }

        System.out.println(Arrays.toString(andsFilas));
    }
}

	



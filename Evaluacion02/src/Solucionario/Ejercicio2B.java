package Solucionario;

public class Ejercicio2B {

	public static void main(String[] args) {
		String [][] m = {
				{"1", "22", "333"},
				{"6666666", "66666", "66"},
				{"77777", "7", "777777"},

		};
		
		for (int i = 0;  i < m.length; i++) {
			// se pone m[i] para aplique a cualquier matriz no cuadrada
			for (int j = 0; j < m[i].length; j++) {
				if(m[i][j].length() > 5) {
					System.out.print(m[i][j].length()+" ");
				}else {
					System.out.print("X ");
				}
				
			}
			
			System.out.println();

		}
		
	}
}

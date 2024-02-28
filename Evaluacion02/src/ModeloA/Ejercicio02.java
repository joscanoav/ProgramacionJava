package ModeloA;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
        String [][] matriz = {
                {"Pomelo","Sol", "Linterna"},
                {"Clave", "Laca", "Tijeras"},
                {"Pincel", "Luz", "Titanio"}
        };
        
        int contPares = 0;
		int contImpares = 0;
		 
		String [] palabrapar = new String[matriz[0].length];
		String [] palabramenor5 = new String[matriz[0].length];


		
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j].length() % 2 == 0) {
					palabrapar[j] =  matriz[i][j];	
				
				}
				
			}
		
			System.out.println(Arrays.toString(palabrapar));
			/*System.out.println(Arrays.toString(palabramenor5));*/
			
		}
		
	}
	}

  
package ModeloA;

import java.util.Arrays;
import java.util.Iterator;
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
		
		
		//Contar elementos de una matriz cadena
		
		int numeroElementos = 0;
		for (int i = 0; i < matriz.length; i++) {
			numeroElementos++;
			
		}
		
		int ElementosMatriz = matriz.length;
		System.out.println(ElementosMatriz);
		System.out.println("La matriz tiene: " + numeroElementos + " Elementos" );
		
		String[][] resultado = new String[matriz.length][matriz[0].length];
		
		for (int i = 0; i < matriz.length; i++) {
		      for (int j = 0; j < matriz[i].length; j++) {
		    	  
		    	  // Verificar si es impar
		    	  
		    	  if (matriz[i][j].length() % 2 ==1) {
		    		  //Imprimir X
		    		  resultado[i][j] = "X";
		    	  }else {
		    		  resultado[i][j] = String.valueOf(matriz[i][j].length());		    	  }
		}
		
		
	}
		
		for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}

  
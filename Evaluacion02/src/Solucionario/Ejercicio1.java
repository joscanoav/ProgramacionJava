package Solucionario;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {

		int[] array = {2,4,5,10,1};
		
		System.out.println(Arrays.toString(array));
		
		// va hasta la penultima
		for (int i = 0; i < array.length - 2; i++) {
			
			if(array[i] == array[i + 1]/2) {
			
			System.out.print("SI ");			
		}else{
			System.out.print("NO ");
		}
	}
		//Ultima posicion

	
	}
}

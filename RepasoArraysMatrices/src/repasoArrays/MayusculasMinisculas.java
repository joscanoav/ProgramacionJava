/*Hacer un programa que tenga un array de 
 * cadenas y las cambie todas a may�sculas. 
 * Por ejemplo: si el array original es 
 * {"Pantera", "Cilantro", "Acueducto"}, el 
 * mismo array pasar� a ser {"PANTERA", "CILANTRO", "ACUEDUCTO"}.
*/
package repasoArrays;

import java.util.Arrays;

public class MayusculasMinisculas {

	public static void main(String[] args) {
		String[] cadenas = {"Pantera", "Cilandro","Acueducto"};
		for (int i = 0; i < cadenas.length; i++) {
			//minusculas toLowerCase
			cadenas[i] = cadenas[i].toUpperCase();
		}
		System.out.println(Arrays.toString(cadenas));
		
	}

}

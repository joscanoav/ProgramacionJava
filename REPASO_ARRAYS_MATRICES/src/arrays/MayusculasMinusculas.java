package arrays;
/*Hacer un programa que tenga un array de cadenas y las cambie todas a mayúsculas. Por ejemplo: si el array original es {"Pantera", "Cilantro", "Acueducto"}, el mismo array pasará a ser {"PANTERA", "CILANTRO", "ACUEDUCTO"}.*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class MayusculasMinusculas {

	public static void main(String[] args) {
		String[] cadenas = {"Pantera", "Cilantro", "Acueducto"};

		for (int i = 0; i < cadenas.length; i++) {
			/*cadenas[i] = cadenas[i].toUpperCase();*/
			cadenas[i] = cadenas[i].toLowerCase();

		}

		System.out.println(Arrays.toString(cadenas));
	}

}
package Arrays;
import java.util.Arrays;
/*Hacer un programa que tenga un array de cadenas y las cambie todas a may�sculas.
 *Por ejemplo: si el array original es {"Pantera", "Cilantro", "Acueducto"}, el mismo 
 *array pasar� a ser {"PANTERA", "CILANTRO", "ACUEDUCTO"}.
*/
public class Ejercicio8 {

	public static void main(String[] args) {
		String[] cadenas = {"Pantera", "Cilantro", "Acueducto"};
		for(int i = 0; i < cadenas.length; i++) {
			cadenas[i] = cadenas[i].toUpperCase();
		}

		System.out.println(Arrays.toString(cadenas));
	}

}

package Arrays;
import java.util.Arrays;
public class Ejercicio8 {

	public static void main(String[] args) {
		String[] cadenas = {"Pantera", "Cilantro", "Acueducto"};
		for(int i = 0; i < cadenas.length; i++) {
			cadenas[i] = cadenas[i].toUpperCase();
		}

		System.out.println(Arrays.toString(cadenas));
	}

}

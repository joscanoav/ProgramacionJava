package tiposdedatos;

public class TiposDatos {

	public static void main(String[] args) {
		/* Esto es un comentario.*/
		int entero = 10; // 32 bits de memoria
		long enteroGrande = 1000000L; // 64 bits
		float decimales = 9.14f; //32 bits
		double decimalesGrande = 3.14; // 64bits
		short enteroCorto =  4; // 16 bits.
		byte enteroByte = 4; // 8 bits.
		// Mejor usar "int" para enteros y "double" para decimales
		char simbolo = 'A'; // 16 bits.
		boolean verdadero = true;
		boolean falso = false;
		
		System.out.println("El valor de entero Byte es " + enteroByte);
	
		int suma = enteroCorto + enteroByte;
		
		System.out.println("El resultado de la suma es " + suma);
		System.out.println("El resultado de la multiplicacion es " + enteroCorto * enteroByte);
		System.out.println("El resultado de la suma es " + (enteroCorto + enteroByte));
		System.out.println("El resultado de la division es " + enteroCorto / enteroByte);
		// Si los numeros son enteros, el resultado quita los decimales
		//Si algunos de los numeros on float /double, saldran decimales
		System.out.println("El resultado de la division es " + enteroByte / decimalesGrande);
		System.out.println("El resultado del resto es " + enteroByte % enteroCorto);
		
		boolean b1 = true;
		boolean b2 = !b1; // NEGACION: b2 vale false (!true).
		boolean b3 = 9 < 2; //MENOR QUE : b3 vale false.
		boolean b4 = !!b1; // true.
		// < > <= >= == !=
		boolean b5 = 'B' != 'b'; // true
		// AND -> si los dos valen true, el resultado es true, y si no false.
		// OR -> si uno de los dos vale true, el resultado es true y si los dos vale true, el resultado es true si no false
		// AND -> &&
		// OR -> ||
		boolean b6 = 9 < 10 && 9 != 8; //true
		boolean b7 = 9 < 8 || 9!=8;//true
		boolean b8 = 9 > 2 && 7 !=7 || !true; // false
		
		System.out.println(b7);
		System.out.println(b8);

		
	}

}

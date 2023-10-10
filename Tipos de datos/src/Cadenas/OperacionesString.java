package Cadenas;

public class OperacionesString {

	public static void main(String[] args) {
		String cadena = "murciélago";
		String cadena2 = "0abeja";
		
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.substring(2));
		System.out.println(cadena.substring(2,5));
		
		//Modifico la variable y ahora son mayúscula
		cadena = cadena.toUpperCase();
		
		System.out.println(cadena);
		System.out.println(cadena2);
		
		if (cadena.compareTo(cadena2)== 0) {
			System.out.println("Las cadenas son iguales.");
		} else if (cadena.compareTo(cadena2) > 0) {
			System.out.println(cadena + " va despues que " + cadena2);
		} else {
			System.out.println(cadena + " va antes que " + cadena2);
		}
		
		if (cadena.contains("UR")) {
			System.out.println(cadena + " contiene UR");
			
		if (cadena.startsWith("MU")) {
			System.out.println(cadena + " empieza por MU");
		}
	  }
	}

}

package Cadenas;

public class CadenaArbol {

	public static void main(String[] args) {
		String palabra;
		
		System.out.print("Introduce una palabra: ");
		palabra = input.nextLine();
		
		for (int i = 0; i < palabra.length();i++) {
			System.out.print(palabra.charAt(i)+" "); 
		}

	}

}

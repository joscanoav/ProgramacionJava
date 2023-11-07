package Repaso;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa el primer elemento (agua, fuego, tierra, aire, neutro): ");
		String elemento1= teclado.nextLine().toLowerCase(); // convetir todo miniscula
		
		System.out.println("Ingresa el primer elemento (agua, fuego, tierra, aire, neutro): ");
		String elemento2= teclado.nextLine().toLowerCase(); // convetir todo miniscula
	
		String resultado = mezclarElementos(elemento1,elemento2);
		
		System.out.println("El elemento resultante de mezclar "+ elemento1 + " y " + elemento2 +  "es: " + resultado);
	}

    public static String mezclarElementos(String elemento1, String elemento2) {
        if (elemento1.equals(elemento2)) {
            return elemento1; // Mismos elementos se mantienen iguales
        } else if ((elemento1.equals("fuego") && elemento2.equals("agua")) || (elemento1.equals("agua") && elemento2.equals("fuego")) ||
                   (elemento1.equals("tierra") && elemento2.equals("aire")) || (elemento1.equals("aire") && elemento2.equals("tierra"))) {
            return "neutro"; // Elementos opuestos se convierten en "neutro"
        } else if (elemento1.equals("neutro")) {
            return elemento2; // Neutro con cualquier otro elemento se convierte en el otro elemento
        } else if (elemento2.equals("neutro")) {
            return elemento1; // Neutro con cualquier otro elemento se convierte en el otro elemento
        } else if ((elemento1.equals("agua") && elemento2.equals("tierra")) || (elemento1.equals("tierra") && elemento2.equals("agua"))) {
            return "barro"; // Agua + Tierra
        } else if ((elemento1.equals("agua") && elemento2.equals("aire")) || (elemento1.equals("aire") && elemento2.equals("agua"))) {
            return "niebla"; // Agua + Aire
        } else if ((elemento1.equals("fuego") && elemento2.equals("tierra")) || (elemento1.equals("tierra") && elemento2.equals("fuego"))) {
            return "lava"; // Fuego + Tierra
        } else if ((elemento1.equals("fuego") && elemento2.equals("aire")) || (elemento1.equals("aire") && elemento2.equals("fuego"))) {
            return "chispa"; // Fuego + Aire
        } else {
            return "combinación inválida"; // En caso de combinaciones inválidas
        }
    }
}
package recuperacion02;

public class Ejercicio02 {

	public static void main(String[] args) {
	        String[][] matriz = {
	                {"Pomelo", "Sol", "Acebo"},
	                {"Clave", "Universo", "Tijeras"},
	                {"Elefante", "Luz", "Titanio"}
	        };

	        System.out.println("Matriz :");
	        for (String[] fila : matriz) {
	            System.out.print("[");
	            for (int i = 0; i < fila.length; i++) {
	                System.out.print(fila[i]);
	                if (i < fila.length - 1) {
	                    System.out.print(", ");
	                }
	            }
	            System.out.println("]");
	        }

	        System.out.println();

	        System.out.println("Resultado:");
	        for (String[] fila : matriz) {
	            for (String cadena : fila) {
	                String cadenaModificada = "";
	                for (char caracter : cadena.toCharArray()) {
	                    if (esVocal(caracter)) {
	                        cadenaModificada += "";
	                    } else {
	                        cadenaModificada += caracter;
	                    }
	                }
	                System.out.print(cadenaModificada + " ");	            }
	            System.out.println(); 
	        }
	    }

	    private static boolean esVocal(char caracter) {
	        return "AEIOUaeiou".indexOf(caracter) != -1;
	    }
	}

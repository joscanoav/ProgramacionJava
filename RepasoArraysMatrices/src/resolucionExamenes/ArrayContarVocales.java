package resolucionExamenes;

public class ArrayContarVocales {

	    public static void main(String[] args) {
	        String cadena = "Esta es una cadena de ejemplo";
	        int vocales = 0;
	        int consonantes = 0;

	        for (int i = 0; i < cadena.length(); i++) {
	            char letra = cadena.charAt(i);
	            letra = Character.toLowerCase(letra); // Convertir a minúscula

	            if (esVocal(letra)) {
	                vocales++;
	            } else if (esConsonante(letra)) {
	                consonantes++;
	            }
	        }

	        System.out.println("Vocales: " + vocales);
	        System.out.println("Consonantes: " + consonantes);
	    }

	    private static boolean esVocal(char letra) {
	        return "aeiouáéíóúü".indexOf(letra) != -1;
	    }

	    private static boolean esConsonante(char letra) {
	        return Character.isLetter(letra) && !esVocal(letra);
	    }
	}
  
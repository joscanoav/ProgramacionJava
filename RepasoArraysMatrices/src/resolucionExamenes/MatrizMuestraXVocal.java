package resolucionExamenes;

public class MatrizMuestraXVocal {
    public static void main(String[] args) {
        // Definición de la matriz bidimensional de strings
        String[][] matriz = {
                {"Pomelo", "Sol", "Linterna"},
                {"Clave", "Laca", "Tijeras"},
                {"Pincel", "Luz", "Titanio"}
        };

        // Mostrar la matriz original
        System.out.println("Matriz original:");
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

        // Procesar la matriz y mostrar el resultado con vocales cambiadas por 'X'
        System.out.println("Matriz con vocales cambiadas por 'X':");
        for (String[] fila : matriz) {
            for (String cadena : fila) {
                String cadenaModificada = "";
                for (char caracter : cadena.toCharArray()) {
                    if (esVocal(caracter)) {
                        cadenaModificada += "X";
                    } else {
                        cadenaModificada += caracter;
                    }
                }
                System.out.print(cadenaModificada + " ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }

    // Método para verificar si un caracter es una vocal
    private static boolean esVocal(char caracter) {
        return "AEIOUaeiou".indexOf(caracter) != -1;
    }
}

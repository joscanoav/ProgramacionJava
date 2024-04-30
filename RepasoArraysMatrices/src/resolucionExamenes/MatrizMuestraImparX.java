package resolucionExamenes;

public class MatrizMuestraImparX {
    public static void main(String[] args) {
        // Definición de la matriz bidimensional de strings
        String[][] matriz = {
            {"Pomelo", "Sol", "Linterna"},
            {"Clave", "Laca", "Tijeras"},
            {"Pincel", "Luz", "Titanio"}
        };

        // Mostrar la matriz original
        System.out.println("Matriz:");
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

        // Procesar la matriz y mostrar el resultado según las especificaciones
        System.out.println("Resultado:");
        for (String[] fila : matriz) {
            for (String cadena : fila) {
                int longitud = cadena.length();
                // if (longitud % 2 != 0) { impar
                if (longitud % 2 == 0) {
                    // Si la longitud es par, mostrar la longitud
                    System.out.print(longitud + " ");
                } else {
                    // Si la longitud es impar, mostrar 'X'
                    System.out.print("X ");
                }
            }
            System.out.println();  // Nueva línea después de cada fila
        }
    }
}
package resolucionExamenes;

public class MatrizMuestraParX {
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
                // Mostrar elemento si impar, 'X' para pares
                System.out.print((longitud % 2 != 0) ? cadena + " " : "X ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }
}




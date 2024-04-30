package resolucionExamenes;

public class ConvertidorDeMayus {
    public static void main(String[] args) {
        // Define una matriz de cadenas de texto
        String[][] matriz = {
            {"apple", "banana", "cherry"},
            {"grape", "orange", "strawberry"},
            {"kiwi", "watermelon", "lemon"}
        };

        // Recorre la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Convierte cada cadena a mayúsculas
                matriz[i][j] = matriz[i][j].toUpperCase();
            }
        }

        // Muestra la matriz modificada
        System.out.println("Matriz modificada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
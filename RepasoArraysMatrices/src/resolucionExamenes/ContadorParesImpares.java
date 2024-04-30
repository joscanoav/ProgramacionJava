package resolucionExamenes;

public class ContadorParesImpares {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 4, 2, 3},
            {8, 8, 8, 8},
            {1, 0, 1, 1}
        };
        int contPares = 0;
        int contImpares = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            // Resetear contadores para cada fila
            contPares = 0;
            contImpares = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                // Verificar si el número es par o impar
                if (matriz[i][j] % 2 == 0) {
                    contPares++; // Incrementar contador de pares
                } else {
                    contImpares++; // Incrementar contador de impares
                }
            }

            // Imprimir resultados de pares e impares para cada fila
            System.out.println("Fila " + i + ": " + contPares + " pares");
            System.out.println("Fila " + i + ": " + contImpares + " impares");
        }
    }
}

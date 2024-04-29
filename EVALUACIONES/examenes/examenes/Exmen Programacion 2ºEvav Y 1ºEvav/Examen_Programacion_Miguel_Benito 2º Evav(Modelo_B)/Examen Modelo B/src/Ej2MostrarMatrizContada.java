

public class Ej2MostrarMatrizContada {
    public static void main(String[] args) {
        

        String[][] matriz = {
            { "Jardin", "Nuve", "Partida"},
            { "Pomo", "Pan", "Mano" },
            { "Amarillo", "Grande", "Junco" },
        };  
        mostrarMatriz(matriz);
        resultado(matriz);
    }
    // Método para mostrar la matriz
    public static void mostrarMatriz(String[][] matriz) {
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
 
    public static void resultado(String[][] matriz){
            System.out.println("Resultado:");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    String cadena = matriz[i][j];
                    int longitud = cadena.length();
    
                    if( longitud >= 6){
                        System.out.print(longitud + " ");
                    }else{
                        System.out.print("X ");
                    }
                    
                    
                }
                System.out.println();
            }
        }
    }

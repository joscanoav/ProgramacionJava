package matrices;

public class MayorCincoX {
    public static void main(String[] args) {
        String[][] matriz = {
            {"Jardín", "Nube", "Partida"},
            {"Pomo", "Pan", "Mano"},
            {"Amarillo", "Grande", "Junco"}
        };

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nResultado:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].length() > 5) {
                    System.out.print(matriz[i][j].length() + " ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
package matrices;
/*Haz un programa que, dado un array bidimensional (matriz) de strings
escrito en código, lo muestre completo como se muestra en el siguiente
ejemplo, de tal manera que salen las longitudes de las cadenas con

longitud par, así como una 'X' en aquellas de longitud impar:

Matriz:

[Pomelo, Sol, Linterna]
[Clave, Laca, Tijeras]
[Pincel, Luz, Titanio]

Resultado:
6 X 8

X 4 X
6 X X*/
public class ImparRemplazaX {

    public static void main(String[] args) {
        String[][] matriz = {
            {"Pomelo", "Sol", "Linterna"},
            {"Clave", "Laca", "Tijeras"},
            {"Pincel", "Luz", "Titanio"}
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
                if (matriz[i][j].length() % 2 == 0) {
                    System.out.print(matriz[i][j].length() + " ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
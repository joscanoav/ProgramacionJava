package DoWhile;
import java.util.Scanner;
public class IngreseValor0y999 {
//Escribir un programa que solicite la carga de un n�mero entre 0 y 999,
//y nos muestre un mensaje de cu�ntos d�gitos tiene el mismo. Finalizar el programa cuando se cargue el valor 0.


    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese un valor entre 0 y 999 (0 finaliza):");
            valor=teclado.nextInt();
            if (valor>=100) {
                System.out.println("Tiene 3 d�gitos.");
            } else {
                if (valor>=10) {
                    System.out.println("Tiene 2 d�gitos.");
                } else {
                    System.out.println("Tiene 1 d�gito.");
                }
            }
        } while (valor!=0);
    }
}

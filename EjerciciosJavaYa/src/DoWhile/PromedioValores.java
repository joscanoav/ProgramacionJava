package DoWhile;
import java.util.Scanner;

public class PromedioValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner teclado=new Scanner(System.in);
        double suma,cant,valor,promedio;
        suma=0;
        cant=0;
        do {
            System.out.print("Ingrese un valor (0 para finalizar):");
            valor=teclado.nextInt();
            if (valor!=0) {
                suma=suma+valor;
                cant++;
            }
        } while (valor!=0);
        if (cant!=0) {
            promedio=suma/cant;
            System.out.print("El promedio de los valores ingresados es:");
            System.out.print(promedio);
        } else {
            System.out.print("No se ingresaron valores.");
        }
    }
}
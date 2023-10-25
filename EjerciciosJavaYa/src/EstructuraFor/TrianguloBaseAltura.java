package EstructuraFor;
import java.util.Scanner;
public class TrianguloBaseAltura {

	public static void main(String[] args) {
		/*Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de la base y la altura de un triángulo. El programa deberá informar:
a) De cada triángulo la medida de su base, su altura y su superficie.
b) La cantidad de triángulos cuya superficie es mayor a 12*/
		
		Scanner teclado = new Scanner(System.in);
		int base,altura,superficie,cantidad,n,i;
		cantidad = 0;
		System.out.print("Cuantos triangulo procesarara:");
		n=teclado.nextInt();
		for (i=1; i<=n; i++) {
			System.out.print("Ingrese el valor de la base:  ");
			base = teclado.nextInt();
			System.out.print("Ingrese el valor de altura: ");
			altura = teclado.nextInt();
			superficie = base*altura/2;
			System.out.println("La superficie es: ");
			System.out.println(superficie);
			if (superficie > 12) {
				cantidad += 1;
			}
		}
		
		System.out.println("La canudad de triangulos con superfice superor a 12 son: " + cantidad);
		
		
	}

}

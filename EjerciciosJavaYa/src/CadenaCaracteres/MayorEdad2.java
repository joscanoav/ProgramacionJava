package CadenaCaracteres;
import java.util.Scanner;

public class MayorEdad2 {
	public static void main(String[] args) {

	Scanner teclado=new Scanner(System.in);
    String apenom1,apenom2;
    int edad1,edad2;
    System.out.print("Ingrese el apellido y el nombre:");
    apenom1=teclado.nextLine();
    System.out.print("Ingrese edad:");
    edad1=teclado.nextInt();
    System.out.print("Ingrese el apellido y el nombre:");
    teclado.nextLine();
    apenom2=teclado.nextLine();
    System.out.print("Ingrese edad:");
    edad2=teclado.nextInt();
    System.out.print("La persona de mayor edad es:");
    if (edad1>edad2) {
        System.out.print(apenom1);
    } else {
        System.out.print(apenom2);
    }
  }
	
}

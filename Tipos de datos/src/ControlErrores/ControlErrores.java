package ControlErrores;
import java.util.Scanner;
public class ControlErrores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		int numero;
		

		 do	{
				System.out.print("Introduce un numero: ");
				numero = input.nextInt();
				
				if (numero < 0 || numero > 9) {
					System.out.println("Error : dato invalido");
				}
				
				
		 	}while (numero < 0 || numero > 9);
/*		
		 do	{
			System.out.println(numero);
			numero--;
		}while (numero > 0); */
		
	}

}

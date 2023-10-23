package EstructuraFor;
import java.util.Scanner;
public class AprobadosReprobados {

	public static void main(String[] args) {
		// Escribir un programa que lea 10 notas de 
		//alumnos y nos informe cuántos tienen notas mayores 
		//o iguales a 7 y cuántos menores

		Scanner entrada = new Scanner(System.in);
		int aprobados,reprobados;
		double nota;
		aprobados=0;
		reprobados=0;
		for (int f=1;f<=10;f++) {
			System.out.println("Ingrese la nota");
			nota=entrada.nextInt();
			if(nota>=7) {
				aprobados=aprobados+1;
			}else {
				reprobados=reprobados+1;
			}
		}
		System.out.println("Cantiadad de aprobados: " + aprobados);
		System.out.println("Cantiadad de reprobados: " + reprobados);

		
		
		
	}

}

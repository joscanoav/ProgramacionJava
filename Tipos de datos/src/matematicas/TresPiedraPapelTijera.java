package matematicas;
import java.util.Scanner;
import java.util.Random;
public class TresPiedraPapelTijera {

	public static void main(String[] args) {

	Random ranGen = new Random();
	Scanner teclado = new Scanner(System.in);
	int victoriaUsuario =0,victoriaOrdenador=0;
	
	while (victoriaUsuario < 3 && victoriaOrdenador < 3) {
	int opcionUsuario, opcionOrdenador = ranGen.nextInt(3);

	
	
	System.out.println("Introduce la opcion deseada (0, 1 ,2 |piedra, papel, tijeras): ");
	opcionUsuario =teclado.nextInt();
		
	switch (opcionOrdenador) {
	case 0:
		System.out.println("La maquina selecciona PIEDRA");
		break;
	case 1:
		System.out.println("La maquina selecciona PAPEL");
		break;
	default:
		System.out.println("La maquina selecciona TIJERA");
	
	}
	
	if(opcionUsuario == opcionOrdenador) {
		System.out.println("Empate");
	}
	else if (opcionUsuario ==0 && opcionOrdenador ==2
		|| opcionUsuario ==1 && opcionOrdenador ==0
		|| opcionUsuario ==2 && opcionOrdenador ==1
		) {
		
		System.out.println("GANA USUARIO");
		victoriaUsuario ++;
	}else {
		System.out.println("GANA MAKINA");
		victoriaOrdenador ++;
	}
	
	}
	
	if (victoriaUsuario >= 3){
		System.out.println("El Usuario gana al mayor de 3!");
		}else {
			System.out.println("El Ordenador gana al mayor de3!");

		}

	
	}
	
	}



package matematicas;
import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random aletorio = new Random();
		String[] opciones = {"Piedra","Papel","Tijera"};
		System.out.println("Bienvenido al juego de Piedra, Papel o Tijera");
		System.out.println("Elije tu jugada: 0 (Piedra), 1 (Papel),2 (Tijera)");
		int eleccionUsuario = entrada.nextInt();
		if(eleccionUsuario < 0 || eleccionUsuario > 2) {
			System.out.println("Eleecion no valida: Elige 0 , 1 , 2. Por favor");
			return;
		
		}
		
		int eleccionComputadora = aletorio.nextInt(3);
		
		System.out.println("La computadora elige: "+ opciones[eleccionComputadora]);
		System.out.println("Tu eliges: "+ opciones[eleccionUsuario]);
			
		if (eleccionUsuario==eleccionComputadora) {
			System.out.println("Es un empate.");
				
		}else if ((eleccionUsuario == 0 && eleccionComputadora==2) ||
				  (eleccionUsuario == 1 && eleccionComputadora ==0) ||
				  (eleccionUsuario == 2 && eleccionComputadora == 1)) {
			System.out.println("¡Ganaste!");
		}else {
			System.out.println("La computadora gana.");
		}
		}
	
	}

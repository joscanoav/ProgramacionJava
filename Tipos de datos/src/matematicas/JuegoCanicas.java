package matematicas;
import java.util.Scanner;
public class JuegoCanicas {

	public static void main(String[] args) {
		int numCanicasJugador = 10;
		int numCanicasMaquina = 10;
		
		while (numCanicasJugador > 0 && numCanicasMaquina > 0) {

		System.out.println("Jugador, apuesta un numero de canicas (1-" +numCanicasJugador + "):");
		int numCanicasJugadas = new Scanner(System.in).nextInt();
		int numCanicasMaquinaJugadas = (int)(Math.random()*numCanicasMaquina)+1;
		
		System.out.println("Jugador, elige PARA o IMPAR: ");
		String opcionJugador = new Scanner(System.in).next();
				
		String opcionMaquina = "PAR".equals(opcionJugador)? "IMPAR":"PAR";
		
		int suma = numCanicasJugadas + numCanicasMaquinaJugadas;
		if (suma % 2 ==0) {
			if (opcionJugador.equals("PAR")) {
				numCanicasJugador += numCanicasMaquinaJugadas;
				numCanicasMaquina -= numCanicasMaquinaJugadas;
				
			}else {
				numCanicasJugador -= numCanicasJugadas;
				numCanicasMaquina += numCanicasJugadas;
			}
		}else {
			if (opcionJugador.equals("IMPAR")) {
				numCanicasJugador += numCanicasMaquinaJugadas;
				numCanicasMaquina -= numCanicasMaquinaJugadas;
			} else {
				numCanicasJugador -= numCanicasJugadas;
				numCanicasMaquina += numCanicasJugadas;
				
			}
			
		}
		
		System.out.println("Jugador: " +numCanicasJugador+ " canicas");
		System.out.println("Maquina: " +numCanicasMaquina+ " canicas");
		}
	if(numCanicasJugador>0) {
		System.out.println("El jugador a ganado!!!");
	}else {
		System.out.println("La maquina te gano! =( ");
	}
		
	
	}

}

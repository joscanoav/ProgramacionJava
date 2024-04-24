package interfaces;

import java.util.Random;

public class JuegoMoneda implements Jugable {
	public int contador;
	@Override
	public void iniciarJuego() {
		System.out.println("El juego va a comenzar ...");
		contador = 0;
	}
	@Override
	public void jugarRonda() {
		Random rand = new Random();
		if (rand.nextBoolean()) {
			System.out.println("Salio cara...");
			contador++;
		} else {
			System.out.println("Salio cruz...");
			contador--;
		}
	}
	
	@Override
	public void mostrarResultados() {
		System.out.println("Contador: " + contador);
	}
	
	@Override
	public void terminar() {
		System.out.println("Juego terminado. Puntuacion final: " + contador);
	}
}

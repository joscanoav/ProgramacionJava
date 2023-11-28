package examenUno;

import java.util.Random;
//se declara las variables del objeto dado
public class Dado {
	private int caras;
	private int puntos;

//
	
	public Dado(int caras) {
		this.caras = caras;
		this.puntos = 0;
	}
	// metodo lanzar dado utiliza el random
	public int LanzarDado() {
		Random random = new Random();
		int resultado = random.nextInt(caras) + 1;
		System.out.println("Resultado del lanzamiento: " + resultado);
		return resultado;
	}
	
	public void apostar(int numeroApostado, int puntosApostados) {
		int resultadoDado = LanzarDado();
		
		if (numeroApostado == resultadoDado) {
			System.out.println("¡Apsotaste correctamente! Ganas " + puntosApostados + " puntos.");
			puntos += puntosApostados;
			
		}else {
			int puntosPerdidos = puntosApostados /2;
			System.out.println("Fallaste. Pierdes " + puntosPerdidos + " puntos.");
			puntos -= puntosPerdidos;
			
		}
		
		System.out.println("Puntos acumulados: " + puntos);
	}
	
	public int ObtenerPuntos() {
		return puntos;
	}
	
}



package examenUnoSolo;

import java.util.Random;

public class Dado {
	public int caras;
	public int puntos;
	
	
//      public Dado(int caras, int puntos) {
		public Dado(int caras) {

		this.caras = caras;
		//this.puntos = puntos;
	}
	
	public int lanzar() {
		Random rand = new Random();
		return rand.nextInt(1, caras + 1);
	}
	
	public void apostar (int numero, int apuesta) {
		if(numero==lanzar()) {
			System.out.println("Has ganado!");
			puntos += apuesta;
		}else {
			System.out.println("Has perdido...");
			puntos -= apuesta /2;
		}
			
		
	}
		
	}
		
/*	public int lanzarDado() {
		Random random = new Random();
		int resultado = random.nextInt(caras) + 1;
		System.out.println("Resulado del lanzamiento: " + resultado);
		return resultado;
	}
	
	public void apostar(int numeroApostado, int puntosApostados) {
		int resultadoDado = lanzarDado();
		if (numeroApostado == resultadoDado) {
			System.out.println("!Apostastes correctamente ganaste: " + puntosApostados + "puntos");
			puntos += puntosApostados;
		}else {
			int puntosPerdidos = puntosApostados / 2;
			System.out.println("Fallaste. Pierdes " + puntosPerdidos + "puntos.");
			puntos -= puntosPerdidos;
		}
		
		System.out.println("Puntos acumulados: " + puntos);
	}
	
	public int ObtenerPuntos() {
		return puntos;
	}
*/		

	
	

package Actividad3;

public class Main {

	public static void main(String[] args) {

		Celula celulaMadre = new Celula("animal",30,70,"sana","AA","TT");
		celulaMadre.verificarADN();
		System.out.println("Estado de la celula madre:" + celulaMadre.tamaño);
		
		celulaMadre.recibirATP(20);
		celulaMadre.crecer(5);
		System.out.println("Tamaño de la celula madre despues de crecer: " + celulaMadre.tamaño);
		System.out.println("Reserva de ATP de la celula madre despues de crecer: " + celulaMadre.reservaATP);
		
		Celula celulaHija = celulaMadre.dividirse();
		System.out.println("Estado de la celula madre despues de dividirse: " + celulaMadre.estado);
		System.out.println("Estado de la celula hija: " + celulaHija.estado);
		System.out.println("Tamaño de la celula hija: " + celulaHija.tamaño);
		System.out.println("Reserva de ATP de la celula hija: " + celulaHija.reservaATP);
	
	}

}

package Actividad3;

public class Main {

	public static void main(String[] args) {

		Celula celulaMadre = new Celula("animal",30,70,"sana","AA","TT");
		celulaMadre.verificarADN();
		System.out.println("Estado de la celula madre:" + celulaMadre.tama�o);
		
		celulaMadre.recibirATP(20);
		celulaMadre.crecer(5);
		System.out.println("Tama�o de la celula madre despues de crecer: " + celulaMadre.tama�o);
		System.out.println("Reserva de ATP de la celula madre despues de crecer: " + celulaMadre.reservaATP);
		
		Celula celulaHija = celulaMadre.dividirse();
		System.out.println("Estado de la celula madre despues de dividirse: " + celulaMadre.estado);
		System.out.println("Estado de la celula hija: " + celulaHija.estado);
		System.out.println("Tama�o de la celula hija: " + celulaHija.tama�o);
		System.out.println("Reserva de ATP de la celula hija: " + celulaHija.reservaATP);
	
	}

}

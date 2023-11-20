package Actividad3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Celula celulaMadre = new Celula("animal",30,70,"sana","AA","TT");
		celulaMadre.verificarADN();
		System.out.println("***CELULA MADRE***");
		System.out.println("Reino de la celula madre: " + celulaMadre.reino);
		System.out.println("Tipo de las 2 Hebras del ADN de la Celula Madre :" + celulaMadre.hebraADN1 + " " + celulaMadre.hebraADN2 );
		System.out.println("Tama�o de la celula madre:" + celulaMadre.tama�o + " micr�metros");
		System.out.println("Cantidad de ATP de la celula madre:" + celulaMadre.reservaATP + " ATP");
		System.out.println("------------------------------------------------------------------------------------------------------");

		// APLICANDO EL EJEMPLO :  Por ejemplo: si tenemos una c�lula "animal", de 30 micr�metros, con 70 ATP, sana y con las hebras "AA" y "TT",
		//se restar�n 10 ATP (60), se quedar� en un tama�o de 15 micr�metros, se quedar� con 30 ATP (60/2) y se retornar� una c�lula id�ntica.		
		
		
		Celula celulaHija = celulaMadre.dividirse();
		System.out.println("***ESTADO DE CELULA MADRE DESPUES DE DIVISION***");
		System.out.println("Estado de la celula Madre despues de dividirse: " + celulaMadre.estado);
		System.out.println("Tama�o de la celula Madre despues de dividirse: " + celulaMadre.tama�o + " micr�metros");
		System.out.println("Cantidad de ATP de la celula madre despues de dividirse: " + celulaMadre.reservaATP + " ATP");
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("***ESTADO DE CELULA HIJA DESPUES DE DIVISION***");
		System.out.println("Estado de la celula hija: " + celulaHija.estado);
		System.out.println("Tama�o de la celula hija: " + celulaHija.tama�o);
		System.out.println("Reserva de ATP de la celula hija: " + celulaHija.reservaATP);
		System.out.println("------------------------------------------------------------------------------------------------------");
		
		//RECIBIR ATP
		celulaMadre.recibirATP(20);
		System.out.println("Reserva de ATP la celula madre despues de recibir la celula madre:" + celulaMadre.reservaATP + " ATP");
		System.out.println("Tama�o de la celula madre:" + celulaMadre.tama�o + " micr�metros");

		System.out.println("------------------------------------------------------------------------------------------------------");

		//CRECER
		celulaMadre.crecer(5);
		System.out.println("Tama�o de la celula madre despues de crecer: " + celulaMadre.tama�o);
		System.out.println("Reserva de ATP de la celula madre despues de crecer: " + celulaMadre.reservaATP);
	
	}

}

package Objetos;
/*
 * Un contador de galletas crudas;
 * Un contador de galletas horneadas;
 * Una capacidad de horno (numero de galletas que caben);
 * Contador de galletas envasadas;
 * Un deposito de dinero;
 * Un coste en euros por galleta envasada
 * 
 * Incrementar la cantidad de galletas crudas
 * Hornear una cantudad de su contador de galletas crudas (cuidado con la capacidad);
 * Envasar una cantidad de su contador de galletas hornedas;
 * Vender una cantidad de sus galletas envasadas con el coste configurado;
 * 
 * TODAS LAS ACCIONES TIENEN RESTRICCION POR CANTIDADES;
 * */
import java.util.Scanner;
public class RobotGalletas {
	public Scanner teclado;
	int ContarGalletasCrudas = 0;
	int ContarGalletasHorneadas;
	int CapacidadHorno;
	int EnvaseGalletas;
	double PagoGalletas;
	double CostoGalleta;


public void prepararGalletas () {
	do {
	System.out.println("Desea prepara galletas: Si/No");
	String respuesta = teclado.next();
	System.out.println("Cuantas galletas va a preparar");
	ContarGalletasCrudas = teclado.nextInt();
	} while (respuesta !="Si");
		




}


}
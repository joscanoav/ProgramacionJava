package Objetos;
import java.util.Scanner;
public class RegistroCoche {
	
	public Scanner teclado;
    private int plazas;
    private String matricula;
    private int ruedas;
    private String modelo;
    private String marca;
    private int deposito = 0;
    private String pitar;
    private int recorrido;
    private double kilometraje;
    private double Tanque;



    private int edad;
    
    public void registrar() {
        teclado=new Scanner(System.in);
        System.out.println("Bienvenido al registro de su Coche IFP: ");
        System.out.print("Ingrese numero de plazas:");
        plazas=teclado.nextInt();
        System.out.print("Ingrese matricula:");
        matricula=teclado.next();
        System.out.print("Ingrese Numero Ruedas:");
        ruedas=teclado.nextInt();
        System.out.print("Ingrese el modelo:");
        modelo=teclado.next();
        System.out.print("Ingrese marca:");
        marca=teclado.next();
        System.out.print("Ingrese deposito:");
        deposito=teclado.nextInt();
        System.out.print("Emite Sonido: Si/ No ");
        pitar = teclado.next();
    }
    
    public void repostar() {
    	
        System.out.print("Cuantos litros va a añadir:");
        int recarga = teclado.nextInt();
        deposito += recarga;
    }
      
    
    public void distanciaRecorrida() {
        System.out.print("Ingrese distancia recorrida en KM: ");
        recorrido = teclado.nextInt();
        kilometraje = recorrido / 0.05;
    	Tanque = deposito - kilometraje;
    	
    }
    
    public void registroFinal() {
    	System.out.println("---------------------------------------------------");
        System.out.println("El numero de plazas es: " + plazas);
        System.out.println("La matricula es: "+ matricula);
        System.out.println("El Numero Ruedas es: " +ruedas );
        System.out.println("El  modelo es: " + modelo );
        System.out.println("La marca es: " + marca);
        System.out.println("El cargado es deposito: " + deposito );
        System.out.println("Emite Sonido: Si/ No " + pitar);
        System.out.println("Te queda en combustible:" + Tanque);

    }
}


/*
 * Hacer un programa que pida los datos de un coche
 * Los coches tienen : numero de plazas , matricula,
 * numero de ruedas, modelo,marca y deposito (litros)
 * Los coches pueden repostar: repostar implica que
 * se recibe una cantidad de combustible y se añade al
 * deposito.
 * Los coches puden pitar: emiten un sonido.
 * Los coches pueden moverse a una distancia: para ello
 * se indica cuantos kilometros y se restan del deposito
 * 0.05 l/km
 */
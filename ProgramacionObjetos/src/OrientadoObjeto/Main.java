package OrientadoObjeto;
import Objetos.RegistroCoche;
public class Main {
	
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
	public static void main(String[] args) {

        RegistroCoche coche1;
        coche1 = new RegistroCoche();
        coche1.registrar();
        coche1.repostar();
        coche1.distanciaRecorrida();
        coche1.registroFinal();
 }
	
}




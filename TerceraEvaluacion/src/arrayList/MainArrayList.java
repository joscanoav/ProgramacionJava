package arrayList;

import java.util.ArrayList;

public class MainArrayList {

	public static void main(String[] args) {
		//WRAPPER CLASSES
		//---------------
		//dobule (primitivo) -> Double (objeto de un double)
		// int (primitivo) -> Integer (objeto de un int)
		// boolean (primitivo) -> Boolean (objeto de un boolean)
		// char (primitivo) -> Character (objeto de un char)
		
		// ArrayList solo permite objetos, no primitivos.
		// Si queremos un ArrayList de primitivos, usamos la Wrapper Class.
		// Si el constructor esta vacio, la dimension es ilimitada
		// Si el constructor tiene un numero, sera la capacidad maxima.
		
		ArrayList<Integer> listaEnteros = new ArrayList<>();
		ArrayList<String> listaStrings = new ArrayList<>(3);
		
		// Tamaño del Array: elementos que hay añadidos en el array.
		System.out.println(listaEnteros.size());
		
		// Añadir elementos al array list:
		listaEnteros.add(9);
		System.out.println(listaEnteros.size());
		
		//Añadir segundo elemento (siempre al final);
		listaEnteros.add(20);
		System.out.println(listaEnteros.size());
		
		// Añadir en una posicion concreta. Se desplazan hacia la derecha.
		listaEnteros.add(1,5); // posicion 1, añade el numero 5
		System.out.println(listaEnteros.size());
		
		// Mostrar array con Arrays.toString()
		System.out.println(listaEnteros);
		
		// Modificar el elemento de una posicion:
		listaEnteros.set(0, 10);
		System.out.println(listaEnteros);
		
		//Eliminar el tecer elemento:
		listaEnteros.remove(2);
		System.out.println(listaEnteros);
	}

}

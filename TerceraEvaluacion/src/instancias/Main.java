package instancias;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Producto prod1 = new Producto("Aspirina");
		ProductoOral prod2 = new ProductoOral("Paracetamol", false);
		ProductoTopico prod3 = new ProductoTopico("Cortisona", "manos");
		
		ArrayList<Producto>productos = new ArrayList<>();
		
		productos.add(prod1);
		productos.add(prod2);
		productos.add(prod3);
		
		for (Producto producto : productos) {
			
			// FORMA 1
			// El método getClass() de la clase Object en Java devuelve un objeto Class
			
			if (producto.getClass() == Producto.class) {
				System.out.println("Es producto generico");
			} else if (producto.getClass() == ProductoTopico.class) {
				System.out.println("Es producto topico");
			} else {
				System.out.println("Es producto Oral");
			}
		
		
			//	FORMA 2
			// productos.getClass().getSimpleName() solo devuelve el nombre simple de la clase del objeto al que se aplica.
			
			switch (productos.getClass().getSimpleName()) {
			case "Producto":
				System.out.println("Es producto generico");
				break;
			case "ProductoTopico":
				System.out.println("Es producto topico");
				break;
			default:
				System.out.println("Es producto oral");
			}
			
			//	FORMA 3
			// determinar si un objeto producto específico es una instancia de la clase Producto o una de sus subclases.
			if (producto instanceof Producto) {
				System.out.println("Es producto generico");
			} else if (producto instanceof ProductoTopico) {
				System.out.println("Es producto topico");
			} else {
				System.out.println("Es producto oral");
			}
			
		}
	}
}
		
	



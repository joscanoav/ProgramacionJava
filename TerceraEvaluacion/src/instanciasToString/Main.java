package instanciasToString;

import instancias.Producto;
import instancias.ProductoOral;

class Main {

	public static void main(String[] args) {
		
		ProductoOral prod1 = new ProductoOral("Paracetamol", false);
		Producto prod2 = new Producto("Paracetamol");
		
		System.out.println(prod1);
		System.out.println(prod2);
	}

}

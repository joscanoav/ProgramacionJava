package Principal;
import Objetos.Producto;

public class Main2 {

	public static void main(String[] args) {
		Producto prod1= new Producto ("Chocolate", -1,300, 5192254);
		Producto prod2= new Producto();
		
		System.out.println(prod1.nombre);
		System.out.println(prod2.precio);
		System.out.println(prod2.nombre);
		
		System.out.println(prod1.obtenerPrecioRebajado(20));
		prod1.reponer(100);
		System.out.println(prod1.stock);
	}

}

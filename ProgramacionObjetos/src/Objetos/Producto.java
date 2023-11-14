package Objetos;

public class Producto {
	public String nombre;//null
	public double precio; // 0.0
	public int stock;//0
	public int lote;//0
	
	public Producto(String nombre, double precio, int stock, int lote) {
		this.nombre = nombre.toLowerCase();
		
		if(precio < 0) {
			System.out.println("Precio negativo. cambiando a postivo...");
			precio = -precio;
		}
		
		this.precio = precio;
		this.stock = stock;
		this.lote = lote;
	}
	
	public Producto() {
		
	}

	public void reponer(int cantidad) {
		
		if(cantidad >=0) {
			stock +=cantidad;
		} else {
			System.out.println("Error: cantidad negativa no validad.");
		}
	}
	
	//Obtener el precio final ala aplicar un determinado descuento (%)
	public double obtenerPrecioRebajado(double porcentaje) {
		return precio * (100- porcentaje) / 100;
	}
	
	// obtener si hay estock o no queda nada
	
	public boolean hayStock() {
		return stock > 0;
	}
	
}

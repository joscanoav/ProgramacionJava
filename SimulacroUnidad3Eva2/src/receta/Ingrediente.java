package receta;


public class Ingrediente {
	private String nombre;
	private String cantidad;
	private int kilocalorias;
	
	public Ingrediente(String nombre, String cantidad, int kilocalorias) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.kilocalorias = kilocalorias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public int getKilocalorias() {
		return kilocalorias;
	}

	public void setKilocalorias(int kilocalorias) {
		this.kilocalorias = kilocalorias;
	}
	
}



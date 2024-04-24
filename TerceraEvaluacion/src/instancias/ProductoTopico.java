package instancias;

public class ProductoTopico extends Producto {
	private String zonasAplicacion;

	public ProductoTopico(String nombre, String zonasAplicacion) {
		super(nombre);
		this.zonasAplicacion = zonasAplicacion;
	}

	public String getZonasAplicacion() {
		return zonasAplicacion;
	}

	public void setZonasAplicacion(String zonasAplicacion) {
		this.zonasAplicacion = zonasAplicacion;
	}
	
}

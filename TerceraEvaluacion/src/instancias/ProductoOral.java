package instancias;

public class ProductoOral extends Producto {	

	private boolean enAyunas;

	public ProductoOral(String nombre, boolean enAyunas) {
		super(nombre);
		this.enAyunas = enAyunas;
	}

	public boolean isEnAyunas() {
		return enAyunas;
	}

	public void setEnAyunas(boolean enAyunas) {
		this.enAyunas = enAyunas;
	}


	}
	






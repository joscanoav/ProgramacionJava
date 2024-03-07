package polimorfismo;

public class Ingreso {
	
	private String concepto;
	private double cantidad;
	
	public Ingreso() {
		// concepto = null;
		// cantidad = 0.0;
	}
	
	public Ingreso(String concepto, double cantidad) {
		
		this.concepto = concepto;
		this.cantidad = cantidad;
		
	}
	
	// Polimorfismo utiliza el mismo metodo
	public void actualizar(double cantidad) {
		this.cantidad = cantidad;
	}

	public void actualizar(String concepto) {
		this.concepto = concepto;
	}
	
}

package clasesAbstractas;

public class Cuadrado extends Figura {
	private double lado;

	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public void generarPerimetro() {
		setPerimetro(4 * lado);
	}
	
	@Override
	public void generarArea() {
		setArea(lado * lado);
	}
}

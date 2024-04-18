package clasesAbstractas;

public class Circulo extends Figura{
	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public void generarPerimetro() {
		setPerimetro(2 * Math.PI * radio);
	}
	
	@Override
	public void generarArea() {
		setArea(Math.PI * radio * radio);
	}
}

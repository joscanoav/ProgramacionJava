package clasesAbstractas;

public class Triangulo extends Figura {
	
	private double lado1;
	private double lado2;
	private double base;
	private double alturaBase;
	
	public Triangulo(double lado1, double lado2, double base, double alturaBase) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.base = base;
		this.alturaBase = alturaBase;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAlturaBase() {
		return alturaBase;
	}

	public void setAlturaBase(double alturaBase) {
		this.alturaBase = alturaBase;
	}
	
	
	@Override
	public void generarPerimetro() {
		setPerimetro(lado1 + lado2 + base);
	}
	
	@Override
	public void generarArea() {
		setArea(base * alturaBase /2);
	}

}

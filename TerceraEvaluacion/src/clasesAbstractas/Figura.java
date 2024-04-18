package clasesAbstractas;

public abstract class Figura{
	private double perimetro;
	private double area;
	public Figura() {
		
}
	
	// METODOS ABSTRACTOS DE ESTA CLASE
	
	public abstract void generarPerimetro();
	public abstract void generarArea();

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
}

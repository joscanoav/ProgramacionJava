package clasesAbstractas;

public class MainFiguras {

	public static void main(String[] args) {
		Cuadrado c = new Cuadrado(2);
		Triangulo t = new Triangulo(3 , 5, 4, 3);
		
		// Generamos perimetro y area
		
		c.generarPerimetro();
		c.generarArea();
		
		System.out.println(c.getPerimetro() + " unidades - CUADRADO");
		System.out.println(c.getArea() + " unidades^2 - CUADRADO");
		
		t.generarPerimetro();
		t.generarArea();
		
		System.out.println(t.getPerimetro() + " unidades - TRIANGULO");
		System.out.println(t.getArea() + " unidades^2 - TRIANGULO");

	}

}

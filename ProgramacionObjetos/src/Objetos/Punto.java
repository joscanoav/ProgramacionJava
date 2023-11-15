package Objetos;

public class Punto {
	double x;
	double y;
	
public Punto(double x, double y) {
	this.x = x;
	this.y = y;
}

public double calcularDistancia(Punto otroPunto){
	return Math.sqrt
			(Math.pow(otroPunto.x - x, 2)
					+ Math.pow(otroPunto.y - y, 2));
}
	
}

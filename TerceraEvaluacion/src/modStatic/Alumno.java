package modStatic;

public class Alumno {
	private final String nombre;
	private static String centro;
	
	public Alumno(String nombre, String centro) {
		this.nombre = nombre;
		this.centro = centro;
	}

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	public String getNombre() {
		return nombre;
	}
	
	
}



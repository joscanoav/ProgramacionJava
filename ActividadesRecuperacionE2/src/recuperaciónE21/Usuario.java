package recuperaciónE21;

public class Usuario {
	String nombre;
	int estrellas;
	
	public Usuario(String nombre, int estrellas) {
		this.nombre = nombre;
		this.estrellas = estrellas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}
	
}

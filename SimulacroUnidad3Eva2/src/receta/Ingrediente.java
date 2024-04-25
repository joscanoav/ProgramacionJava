package receta;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ingrediente {
	private String nombre;
	private String cantidad;
	private int kilocalorias;
	
	public Ingrediente(String nombre, String cantidad, int kilocalorias) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.kilocalorias = kilocalorias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public int getKilocalorias() {
		return kilocalorias;
	}

	public void setKilocalorias(int kilocalorias) {
		this.kilocalorias = kilocalorias;
	}

	public void imprimir(String dirPath) {
		try {
		PrintWriter pw = new PrintWriter(new FileWriter(dirPat + "/" + nombre +));
	} catch (IOException e) {
		Syste,
	}
	}
	
}


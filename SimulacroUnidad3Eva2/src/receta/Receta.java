package receta;

import java.util.ArrayList;

public class Receta {

	private String nombre;
	private ArrayList<Ingrediente> ingredientes;
	private String descripcion;
	
	public Receta(String nombre, ArrayList<Ingrediente> ingredientes, String descripcion) {
		super();
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}

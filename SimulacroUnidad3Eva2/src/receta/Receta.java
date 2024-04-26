package receta;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Receta {
	private String nombre;
	private ArrayList<Ingrediente> ingredientes;
	private String descripcion;

	public Receta(String nombre, ArrayList<Ingrediente> ingredientes, String descripcion) {
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

	public void imprimir(String dirPath) {

		try {
			PrintWriter pw = new PrintWriter(new FileWriter(dirPath + "/" + nombre + ".txt"));

			pw.println(nombre);
			pw.println("Energía: " + calcularEnergia() + " kilocalorías");
			pw.print("Ingredientes:\n" + listarIngredientes());
			pw.println("Descripción:\n" + descripcion);
			pw.close();
		} catch (IOException e) {
			System.err.println("ERROR: no se pudo imprimir la receta.");
		}

	}

	public String listarIngredientes() {
		String lista = "";

		for (Ingrediente ingrediente : ingredientes) {
			lista += "  - " + ingrediente.getNombre() + " (" + ingrediente.getCantidad() + ")\n";
		}

		return lista;
	}

	public int calcularEnergia() {
		int kcal = 0;

		for (Ingrediente ingrediente : ingredientes) {
			kcal += ingrediente.getKilocalorias();
		}

		return kcal;
	}

}
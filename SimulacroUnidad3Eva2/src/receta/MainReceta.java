package receta;

import java.util.ArrayList;

public class MainReceta {

	public static void main(String[] args) {
		Ingrediente pan = new Ingrediente("Pan", "2 rebanadas", 100);
		Ingrediente tomate = new Ingrediente("Tomate", "2 rodajas", 10);
		ArrayList<Ingrediente> ingredientes = new ArrayList<>();

		ingredientes.add(pan);
		ingredientes.add(tomate);

		Receta receta = new Receta("Pan con tomate", ingredientes, "1. Poner el pan en un plato.\n2. Poner el tomate encima.");

		receta.imprimir(".");
	}

}
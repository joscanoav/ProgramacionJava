package vehiculos;

public class Camion extends Vehiculo {
	int paquetes;
	double peso; // en Kg.
	
	public Camion(String matricula, int ruedas, int plazas, boolean esGasolina, double deposito, int paquetes,
			double peso) {
		
		// Llamada al constructor superior, es decir, el de la superclase o clase madre.
		super(matricula, ruedas, plazas, esGasolina, deposito);
		this.paquetes = paquetes;
		this.peso = peso;
	}

	public int getPaquetes() {
		return paquetes;
	}

	public void setPaquetes(int paquetes) {
		this.paquetes = paquetes;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}



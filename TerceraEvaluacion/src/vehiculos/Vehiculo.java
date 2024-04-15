package vehiculos;

public class Vehiculo {
	// Si es protected, solo la jeraquia familiar puede acceder libremente.
	
	protected String matricula;
	private int ruedas;
	private int plazas;
	private boolean esGasolina; //"false" seria "diésel".
	private double deposito; // litros de combustible.
	
	public Vehiculo(String matricula, int ruedas, int plazas, boolean esGasolina, double deposito) {
		this.matricula = matricula;
		this.ruedas = ruedas;
		this.plazas = plazas;
		this.esGasolina = esGasolina;
		this.deposito = deposito;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public boolean isEsGasolina() {
		return esGasolina;
	}

	public void setEsGasolina(boolean esGasolina) {
		this.esGasolina = esGasolina;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	
	// Este metodo se hereda igual que el resto.
	// Los camiones y demas podran usarlo.
	
	public void depositarCombustible(double litros) {
		deposito += litros;
	}
}



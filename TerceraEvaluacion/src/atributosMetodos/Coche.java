package atributosMetodos;

public class Coche {
	private String matricula;
	private Persona conductor;
	
	public Coche(String matricula, Persona conductor) {
		this.matricula = matricula;
		this.conductor = conductor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Persona getConductor() {
		return conductor;
	}

	public void setConductor(Persona conductor) {
		this.conductor = conductor;
	}
}

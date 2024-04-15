package Animales;

public class Mamifero extends Vertebrado {
	private int extremidades;
	private boolean viviparo;
	
	public Mamifero(String especie, String clima, String habitat, String alimentacion, int extremidades,
			boolean viviparo) {
		super(especie, clima, habitat, alimentacion);
		this.extremidades = extremidades;
		this.viviparo = viviparo;
	}

	public int getExtremidades() {
		return extremidades;
	}

	public void setExtremidades(int extremidades) {
		this.extremidades = extremidades;
	}

	public boolean isViviparo() {
		return viviparo;
	}

	public void setViviparo(boolean viviparo) {
		this.viviparo = viviparo;
	}
	
}


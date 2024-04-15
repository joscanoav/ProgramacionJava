package Animales;

public class Insecto extends Invertebrado {
	private int alas;
	private int patas;
	private int antenas;
	
	public Insecto(String especie, String clima, String habitat, String alimentacion, int alas, int patas,
			int antenas) {
		super(especie, clima, habitat, alimentacion);
		this.alas = alas;
		this.patas = patas;
		this.antenas = antenas;
	}

	public int getAlas() {
		return alas;
	}

	public void setAlas(int alas) {
		this.alas = alas;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public int getAntenas() {
		return antenas;
	}

	public void setAntenas(int antenas) {
		this.antenas = antenas;
	}
	
	

	
	
}

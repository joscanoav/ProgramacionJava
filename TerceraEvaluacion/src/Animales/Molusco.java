package Animales;

public class Molusco extends Invertebrado{
	private boolean caparazon;

	public Molusco(String especie, String clima, String habitat, String alimentacion, boolean caparazon) {
		super(especie, clima, habitat, alimentacion);
		this.caparazon = caparazon;
	}
	
	public boolean isCaparazon() {
		return caparazon;
	}

	public void setCaparazon(boolean caparazon) {
		this.caparazon = caparazon;
	}
	
}

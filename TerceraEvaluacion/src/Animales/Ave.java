package Animales;

public class Ave extends Vertebrado {
	private boolean vuela;

	public Ave(String especie, String clima, String habitat, String alimentacion, boolean vuela) {
		super(especie, clima, habitat, alimentacion);
		this.vuela = vuela;
	}
	
	public boolean isVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}	
}
	
	



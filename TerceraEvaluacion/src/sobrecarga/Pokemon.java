package sobrecarga;

public class Pokemon {
	
	private String nombre;
	private String tipo;
	private int vida;
	
	
	public Pokemon(String nombre, String tipo, int vida) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.vida = vida;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public void atacar(Pokemon objetivo) {
		objetivo.recibirAtaque(0);
		
	}
	
	public void recibirAtaque(int puntosDmg) {
		vida -= puntosDmg;
	}
	
}

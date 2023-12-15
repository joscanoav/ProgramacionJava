package objeto;

public class Pokemon {

	public String nombre;
	public TipoPokemon tipo;
	public int nivel;
	private int hp;
	
	public Pokemon(String nombre, TipoPokemon tipo, int nivel, int hp) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.nivel = nivel;
		//this.hp = hp;
		setHP(hp);
	}
	
	public Pokemon() {
		
	}
	
	
	
	//GETTER - Método que retorna el valor de un atributo privado.
	public int getHP() {
		return hp;
	}
	
	//SETTER - Método que cambiar el valor de un atributo privado.
	public void setHP(int hp) {
		if (hp >= 0) {
		this.hp = hp;
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoPokemon getTipo() {
		return tipo;
	}

	public void setTipo(TipoPokemon tipo) {
		this.tipo = tipo;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

}



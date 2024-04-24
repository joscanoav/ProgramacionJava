package instancias;
/*Se llama instanciar a la acción de crear un objeto a 
 * partir de una clase , por tanto cuando se usa la palabra reservada “new” , se procede a instanciar un objeto de la clase especificada. 
 * Si quieres empezar a usarla una clase, debes “instanciarla”.*/

public class Producto {
	
	private String nombre;
	
	public Producto(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}



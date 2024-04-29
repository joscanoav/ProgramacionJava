package recuperaciónE21;

import java.util.ArrayList;
import java.util.List;

public class Cola {
	private int aforo;
	private List<Usuario> usuarios;
	
	// Si se inicializa de esta forma no hay forma de controlar aforo
	// ya que puede inicializarse desde la creacion.
	/*public Cola(int aforo, List<Usuario> usuarios) {
		this.aforo = aforo;
		this.usuarios = usuarios;
	}*/
	
	public Cola(int aforo) {
		this.aforo = aforo;
		// Inicializa el campo usuarios con una nueva instancia ArrayList
		//ArrayList tiene capacidad inicial (aforo)
		this.usuarios = new ArrayList<>(aforo);
	}
	
	public boolean estaLlena() {
		return usuarios.size() == aforo;
	}
	
	public boolean estaVacia() {
		return usuarios.isEmpty();
	}

	
	/*Si necesita saber si el usuario se agregó exitosamente (por ejemplo, para informar al usuario o actualizar la interfaz de usuario), se prefiere devolver un booleano.
	Si solo le importa la acción de agregar un usuario sin necesitar información específica de éxito / fracaso, un retorno vacío podría ser suficiente. Sin embargo, para mayor claridad y consistencia, devolver un booleano suele ser una mejor práctica.*/

	/*public agregarUsuario(usuario Usuario) {
	 * 	}*/
	//Se aplica el public void no devuelve ningun valor
	
	public void agregarUsuario(Usuario usuario) {
		if(!estaLlena()) {
			usuarios.add(usuario);
		}
	}
	
	public void eliminarUsuario() {
		if(!estaVacia()) {
			usuarios.remove(0);
		}
	}
	
	// El tipo de retorno es Usuario porque ese metodo devuelve objeto de tipo Usuario
	public Usuario siguienteUsuario() {
		if (!estaVacia()) {
			return usuarios.get(0);
		}
		return null;
	}
	
	// Investigar StringBuilder 
	public String verCola() {
		if (estaVacia()) {
			return " La cola esta vacia.";
		}
		String resultado = "";
		
		for (Usuario usuario : usuarios) {
			resultado += usuario.toString() + "\n";
		}
		return resultado;
	}
	

	
	
	
	
	

	
	
}

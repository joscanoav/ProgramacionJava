package Objetos;

public class Persona {
	//Atributos
	
	public String nombre;
	public String apellido1;
	public String apellido2;
	public boolean casado;
	public int edad;
	public boolean vivo;
	
	
	//Constructores
	
	public Persona(String nombre, String apellido1, String apellido2, boolean casado, int edad, boolean vivo) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.casado = casado;
		this.edad = edad;
		this.vivo = vivo;
	
	}
	
	public Persona (){
		
	}
	
	public Persona(String nombre,int edad,boolean casado) {
		this.nombre = nombre;
		this.edad = edad;
		this.casado = casado;
		vivo = true;
		

	}
	
	// METODOS empieza con miniscula

	public String obtenerNombreCompleto() {
		return nombre + " " + apellido1 + " " + apellido2;
	}

	public void matar() {
		
		if (vivo == true) {
			System.out.println("Muerto");
			vivo = false;
		} else {
			System.out.println("No puede matar a un muerto");
		}
	
	}
	
	public void revivir () {
		
		if (vivo == false) {
			System.out.println("Revive");
			vivo = true;
		} else {
			System.out.println("No puede revivir a un vivo");
		}
	
	}
	
	public boolean esMayorDeEdad() {
		return edad >= 18;
	}
	
	}


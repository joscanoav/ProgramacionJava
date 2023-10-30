package Principal;

import Objetos.Persona;

public class Main {

	public static void main(String[] args) {
		// Se crea la primera persona.
		// "new" estamos llamando al constructor de la clase.
		//Persona() es el constructor por defecto.
		Persona persona1 = new Persona("Pepe","García","Saenz",true,34,true);
		Persona persona2 = new Persona();
		Persona persona3 = new Persona("Daniel",37,false);


		
		System.out.println("Nombre: " + persona1.nombre);
		System.out.println("Apellido: " + persona1.apellido1);
		System.out.println("Apellido: " + persona1.apellido2);
		System.out.println("Casado: " + persona1.apellido1);
		System.out.println("Edad: " + persona1.edad);
		System.out.println("Vivo: " + persona1.vivo);

		
		System.out.println("-----------------------------------");
		
		System.out.println("Nombre: " + persona2.nombre);
		System.out.println("Apellido: " + persona2.apellido1);
		System.out.println("Apellido: " + persona2.apellido2);
		System.out.println("Casado: " + persona2.apellido1);
		System.out.println("Edad: " + persona2.edad);
		System.out.println("Vivo: " + persona2.vivo);
		
		System.out.println("-----------------------------------");

		
		System.out.println("Nombre: " + persona3.nombre);
		System.out.println("Edad: " + persona3.edad);
		System.out.println("Casado: " + persona3.casado);
		
		System.out.println("-----------------------------------");
		
		System.out.println(persona3.vivo);
		
		System.out.println("-----------------------------------");
		
		System.out.println(persona1.obtenerNombreCompleto()); 
		persona3.matar();
		persona3.revivir();
		persona3.esMayorDeEdad();
				
	}
}

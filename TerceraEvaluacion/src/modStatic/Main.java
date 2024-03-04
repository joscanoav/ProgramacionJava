package modStatic;

public class Main {

	public static void main(String[] args) {
		
		Alumno a1 = new Alumno("Juan", "Centro1");
		Alumno a2 = new Alumno("Maria", "Centro2");
		Alumno a3 = new Alumno("Luis", "Centro3");

		System.out.println(a1.getNombre() + ", " + Alumno.getCentro());
		System.out.println(a2.getNombre() + ", " + Alumno.getCentro());
		System.out.println(a3.getNombre() + ", " + Alumno.getCentro());
		
		// Static en atributos: los atributos se comparte.
		// Cuando un objeto cambia el valor, los demas también.
		//Static en metodos: no hay que crear el objeto para llamarlos.		
		// Los atributos no estaticos no se pueden usar en metodos estaticos.
	}

}

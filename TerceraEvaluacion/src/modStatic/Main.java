package modStatic;

public class Main {

	public static void main(String[] args) {
		
		Alumno a1 = new Alumno("Juan", "Centro1");
		Alumno a2 = new Alumno("Maria", "Centro2");
		Alumno a3 = new Alumno("Luis", "Centro3");

		System.out.println(a1.getNombre() + ", " + a1.getCentro());
		System.out.println(a2.getNombre() + ", " + a2.getCentro());
		System.out.println(a3.getNombre() + ", " + a3.getCentro());
		
	}

}

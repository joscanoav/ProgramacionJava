package excepciones;

public class Main {

	public static void main(String[] args) {
		OperacionesStrings os = new OperacionesStrings();
		
		System.out.println(os.repetir(null, 3));
		System.out.println(os.juntar(null, "Hola"));
		System.out.println(os.juntar(null, ""));
		System.out.println(os.juntar("Hola", ""));
		System.out.println(os.juntar("Hola","mundo"));
		
		try {
			System.out.println(os.eliminar(null, "o"));
		} catch (NullPointerException npe) {
			System.err.println(" Ha saltado una excepcion al llamar a 'eliminar'");
		} finally {
			System.out.println("Estoy en finally, que se ejecuta siempre y al final.");
			
		}
		System.out.println("Fin del programa");
		
	}
}
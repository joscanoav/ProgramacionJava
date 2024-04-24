package excepciones;

public class OperacionesStrings {
	public String juntar(String s1, String s2) {
		try {
			
			if (s1 == null || s2 == null) {
				throw new Exception ("ERROR: no pueden ser null");
			}
			if (s1.isEmpty() || s2.isEmpty()) {
				throw new Exception ("ERROR: no pueden estar vacias");
			}
			return s1 + s2;
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	public String repetir(String cadena, int veces) {
		try {
			return cadena.repeat(veces);
		} catch (NullPointerException e) {
			System.err.println("ERROR: se devuelve null");
			return null;
		}
	}
	
	public String eliminar(String original, String objetivo) 
		throws NullPointerException {
		return original.replaceAll(objetivo,"");
	}
	
}

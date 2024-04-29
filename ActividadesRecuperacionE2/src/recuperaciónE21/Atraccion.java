package recuperaciónE21;

public class Atraccion {
	private String nombre;
	private Cola colaNormal;
	private Cola colaVIP;
	private int aforoNormal;
	private int aforoVIP;
	
	public Atraccion(String nombre, int aforoNormal, int aforoVIP) {
		this.nombre = nombre;
		this.colaNormal = new Cola(aforoNormal);
		this.colaVIP = new Cola(aforoVIP);
		this.aforoNormal = aforoNormal;
		this.aforoVIP = aforoVIP;
	}
	
	public void agregarUsuarioColaNormal(Usuario usuario) {
		if(!colaNormal.estaLlena()) {
			colaNormal.agregarUsuario(usuario);
		} else {
			System.out.println("La cola normal de la atraccion" + nombre + " esta llena.");
		}
	}
	
    public void agregarUsuarioColaVIP(Usuario usuario) {
        if (!colaVIP.estaLlena()) {
            colaVIP.agregarUsuario(usuario);
        } else {
            System.out.println("La cola VIP de la atracción " + nombre + " está llena.");
        }
    }
	
	public String verColaNormal() {
		return colaNormal.verCola();
	}
	
	public String verColaVIP() {
		return colaVIP.verCola();
	}
	
	public void avanzarCola() {
		// preferencia VIP
		if (!colaVIP.estaVacia()) {
			colaNormal.eliminarUsuario();
		}else {
			System.out.println("No hay usuarios en ninguna de las colas de atraccion " + nombre );
		}
	}
}

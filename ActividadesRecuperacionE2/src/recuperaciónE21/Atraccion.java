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
        if (!colaNormal.estaLlena()) {
            colaNormal.agregarUsuario(usuario);
        } else {
            System.out.println("La cola normal de la atracción " + nombre + " está llena.");
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
    
    public Usuario siguienteUsuarioVIP() {
        return colaVIP.siguienteUsuario();
    }
    
    public void avanzarColaVIP() {
        colaVIP.eliminarUsuario();
    }
    
    public Usuario siguienteUsuarioNormal() {
        return colaNormal.siguienteUsuario();
    }
    
    public void avanzarColaNormal() {
        colaNormal.eliminarUsuario();
    }
}

package recuperaci�nE21;

public class Main {

	public static void main(String[] args) {
        // Crear la atracci�n
        Atraccion atraccion = new Atraccion("Monta�a Rusa", 100, 20);

        // Crear usuarios
        Usuario usuario1 = new Usuario("Juan", 3);
        Usuario usuario2 = new Usuario("Mar�a", 5);
        Usuario usuario3 = new Usuario("Pedro", 1);
        Usuario usuario4 = new Usuario("Ana", 4);
        Usuario usuario5 = new Usuario("Luis", 2);

        // Agregar usuarios a las colas
        atraccion.agregarUsuarioColaNormal(usuario1);
        atraccion.agregarUsuarioColaNormal(usuario2);
        atraccion.agregarUsuarioColaVIP(usuario3);
        atraccion.agregarUsuarioColaNormal(usuario4);
        atraccion.agregarUsuarioColaVIP(usuario5);

        // Mostrar las colas
        System.out.println("Cola normal:");
        System.out.println(atraccion.verColaNormal());
        System.out.println("\nCola VIP:");
        System.out.println(atraccion.verColaVIP());

        // Avanzar la cola
        System.out.println("\nAvanzando la cola...");
        atraccion.avanzarCola();

        // Mostrar las colas despu�s de avanzar
        System.out.println("\nCola normal:");
        System.out.println(atraccion.verColaNormal());
        System.out.println("\nCola VIP:");
        System.out.println(atraccion.verColaVIP());
    }
}
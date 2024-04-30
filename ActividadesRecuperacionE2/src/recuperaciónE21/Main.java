package recuperaciónE21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        // Crear usuarios
        Usuario usuario1 = new Usuario("Alice", 3);
        Usuario usuario2 = new Usuario("Bob", 4);
        Usuario usuario3 = new Usuario("Charlie", 5);
        Usuario usuario4 = new Usuario("Diana", 3);
        Usuario usuario5 = new Usuario("Eve", 5);
        Usuario usuario6 = new Usuario("Frank", 4);
        
        // Crear una atracción con aforo normal de 3 y aforo VIP de 2
        Atraccion atraccion = new Atraccion("Montaña Rusa", 3, 2);
        
        // Agregar usuarios a la cola normal
        atraccion.agregarUsuarioColaNormal(usuario1);
        atraccion.agregarUsuarioColaNormal(usuario2);
        atraccion.agregarUsuarioColaNormal(usuario3);
        
        // Agregar usuarios a la cola VIP
        atraccion.agregarUsuarioColaVIP(usuario4);
        atraccion.agregarUsuarioColaVIP(usuario5);
        
        // Mostrar las colas de espera
        System.out.println("Cola normal:");
        System.out.println(atraccion.verColaNormal());
        System.out.println("Cola VIP:");
        System.out.println(atraccion.verColaVIP());
        
        // Avanzar las colas de espera, alternando entre VIP y normal
        System.out.println("\nAvanzando colas de espera:");
        avanzarColas(atraccion, 3);
        
        // Mostrar las colas de espera después de avanzar
        System.out.println("\nDespués de avanzar las colas:");
        System.out.println("Cola normal:");
        System.out.println(atraccion.verColaNormal());
        System.out.println("Cola VIP:");
        System.out.println(atraccion.verColaVIP());
    }

    public static void avanzarColas(Atraccion atraccion, int numAvances) {
        for (int i = 0; i < numAvances; i++) {
            if (i % 2 == 0) {
                Usuario vipUsuario = atraccion.siguienteUsuarioVIP();
                if (vipUsuario != null) {
                    System.out.println(vipUsuario.getNombre() + " se ha montado en la atracción (VIP).");
                    atraccion.avanzarColaVIP();
                }
            } else {
                Usuario normalUsuario = atraccion.siguienteUsuarioNormal();
                if (normalUsuario != null) {
                    System.out.println(normalUsuario.getNombre() + " se ha montado en la atracción (normal).");
                    atraccion.avanzarColaNormal();
                }
            }
        }
    }
}
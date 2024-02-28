package preparacionDefinitiva;

public class MainTelefono {

	public static void main(String[] args) {
		// Crear una instancia de la clase Telefono
        Telefono miTelefono = new Telefono("123456789", 1234, 10);

        // Ejemplo de uso de los métodos
        miTelefono.recibirMensaje("Hola, ¿cómo estás?");
        miTelefono.recibirMensaje("Estoy bien, gracias.");

        // Ver mensajes
        miTelefono.verMensaje(0); // Debería imprimir el primer mensaje

        // Cambiar PIN
        miTelefono.cambiarPIN(1234, 4321); // Cambiar el PIN de 1234 a 4321
    }
}
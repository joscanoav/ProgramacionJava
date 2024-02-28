package preparacionDefinitiva;

import java.util.Arrays;

public class Telefono2 {

	    private String numero;
	    private int pin;
	    private String[] sms;

	    public Telefono2(String numero, int pin, int capacidad) {
	        this.numero = numero;
	        this.pin = pin;
	        sms = new String[capacidad];
	    }

	    public void recibirMensaje(String msg) {
	        boolean introducido = false;

	        for (int i = 0; i < sms.length && !introducido; i++) {
	            if (sms[i] == null) {
	                sms[i] = msg;
	                introducido = true;
	            }
	        }

	        System.out.println("Bandeja: " + Arrays.toString(sms));
	    }

	    public void verMensaje(int index) {
	        if (index >= 0 && index < sms.length) {
	            System.out.println(sms[index]);
	        } else {
	            System.out.println("Índice fuera de rango.");
	        }
	    }

	    public void cambiarPIN(int pinAntiguo, int pinNuevo) {
	        if (pin == pinAntiguo) {
	            pin = pinNuevo;
	            System.out.println("PIN cambiado correctamente.");
	        } else {
	            System.out.println("ERROR: PIN incorrecto. No se ha cambiado el PIN.");
	        }
	    }

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
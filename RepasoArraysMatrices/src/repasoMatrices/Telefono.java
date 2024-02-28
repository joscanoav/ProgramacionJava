package repasoMatrices;

import java.util.Arrays;

public class Telefono {
	private String numero;
	private int pin;
	private String[] sms;
	
	public Telefono(String numero, int pin, int capacidad) {
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
		}
		
	}

	public void cambiarPIN(int pinAntiguo, int pinNuevo) {
		
		if (pin == pinAntiguo) {
			pin = pinNuevo;
		} else {
			System.out.println("ERROR: PIN incorrecto.");
		}
		
	}
	
}
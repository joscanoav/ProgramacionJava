package examenUno;

public class MainDeposito {

	public static void main(String[] args) {
        TiendaHelados tienda = new TiendaHelados(1000);

        tienda.realizarVenta(1, "vainilla");
        tienda.realizarVenta(2, "chocolate");
        tienda.realizarVenta(3, "fresa");

        // Puedes agregar m�s llamadas a m�todos para probar la funcionalidad completa del sistema
    }

	}



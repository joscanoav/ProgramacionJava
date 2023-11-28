package examenUno;

public class MainLinterna {

	public static void main(String[] args) {
        Linterna miLinterna = new Linterna();

        miLinterna.encender();
        miLinterna.cargarBateria(3);
        miLinterna.encender();
        miLinterna.apagar();
        miLinterna.encender();
        miLinterna.apagar();
    }
}


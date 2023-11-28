package examenUno;

public class Linterna {
    private boolean encendida;
    private boolean nivelAlto;
    private int cargaBateria;

    public Linterna() {
        this.encendida = false;
        this.nivelAlto = false;
        this.cargaBateria = 0;
    }

    public void encender() {
        if (!encendida && cargaBateria > 0) {
            encendida = true;
            System.out.println("Linterna encendida. Nivel alto: " + nivelAlto);
            cargaBateria -= nivelAlto ? 2 : 1;
        } else {
            System.out.println("La linterna ya est� encendida o no hay suficiente carga en la bater�a.");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("Linterna apagada.");
        } else {
            System.out.println("La linterna ya est� apagada.");
        }
    }

    public void cargarBateria(int cantidadCargas) {
        cargaBateria += cantidadCargas;
        System.out.println("Bater�a cargada con " + cantidadCargas + " cargas. Carga actual: " + cargaBateria);
    }
}


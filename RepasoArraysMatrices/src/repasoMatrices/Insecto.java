package repasoMatrices;

import java.util.Random;

public class Insecto {
    private String nombreEspecie;
    private String sonido;
    private int numeroPatas;
    private int numeroAlas;

    // Constructor para representar un gusano inicialmente
    public Insecto() {
        this.nombreEspecie = "Gusano";
        this.sonido = "zzz";
        this.numeroPatas = 0;
        this.numeroAlas = 0;
    }

    // Método para verificar si el insecto tiene alas
    public boolean tieneAlas() {
        return numeroAlas > 0;
    }

    // Método para mutar el insecto
    public void mutar() {
        Random random = new Random();
        this.numeroPatas = random.nextInt(7); // Número aleatorio entre 0 y 6
        this.numeroAlas = random.nextInt(7); // Número aleatorio entre 0 y 6
        // Cambiar el sonido y el nombre también de manera aleatoria
        if (random.nextBoolean()) {
            this.sonido = "flap-flap";
            this.nombreEspecie = "Mariposa";
        } else {
            this.sonido = "bzzz";
        }
    }

    // Método para emitir el sonido del insecto
    public void emitirSonido() {
        System.out.println("El " + nombreEspecie + " hace el sonido: " + sonido);
    }

    // Método para obtener información sobre el insecto
    @Override
    public String toString() {
        return "Insecto{" +
                "nombreEspecie='" + nombreEspecie + '\'' +
                ", sonido='" + sonido + '\'' +
                ", numeroPatas=" + numeroPatas +
                ", numeroAlas=" + numeroAlas +
                '}';
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un gusano
        Insecto gusano = new Insecto();

        // Mostrar información inicial
        System.out.println("Información inicial del gusano:");
        System.out.println(gusano);

        // Verificar si el gusano tiene alas
        System.out.println("¿Tiene alas? " + gusano.tieneAlas());

        // Mutar el gusano
        gusano.mutar();
        System.out.println("Información después de la mutación:");
        System.out.println(gusano);

        // Emitir sonido
        gusano.emitirSonido();
    }
}
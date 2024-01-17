package GestionCitas;

public class Cita {
    private String dni;
    private int franja;
    private int tipo;
    private int hueco;

    public Cita(String dni, int franja, int tipo, int hueco) {
        this.dni = dni;
        this.franja = franja;
        this.tipo = tipo;
        this.hueco = hueco;
    }

    public String getDni() {
        return dni;
    }

    public int getFranja() {
        return franja;
    }

    public int getTipo() {
        return tipo;
    }

    public int getHueco() {
        return hueco;
    }

    @Override
    public String toString() {
        return "DNI: " + dni +
                "\nFranja horaria: " + (franja == 0 ? "Mañana" : "Tarde") +
                "\nTipo de cita: " + (tipo == 0 ? "Revisión" : "Tratamiento") +
                "\nHueco: " + (hueco + 1);
    }
}

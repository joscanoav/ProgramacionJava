package GestionCitasClinica;

public class Cita {
    private String dni;
    private int consultaNumero;
    private int tipo;
    private int hora;
    private int minutos;

    public Cita(String dni, int consultaNumero, int tipo, int hora, int minutos) {
        this.dni = dni;
        this.consultaNumero = consultaNumero;
        this.tipo = tipo;
        this.hora = hora;
        this.minutos = minutos;
    }

    public String getDni() {
        return dni;
    }

    public int getConsultaNumero() {
        return consultaNumero;
    }

    public int getTipo() {
        return tipo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    @Override
    public String toString() {
        return "DNI: " + dni +
                "\nConsulta Número: " + consultaNumero +
                "\nTipo de cita: " + (tipo == 0 ? "Revisión" : "Tratamiento") +
                "\nHora: " + String.format("%02d:%02d - %02d:%02d", hora, minutos, hora, minutos + 30);
    }
}
package GestionCitas;

public class Cita {
    private String dni;
    private int franja;
    private int tipo;
    private int hora;
    private int minutos;

    public Cita(String dni, int franja, int tipo, int hora, int minutos) {
		this.dni = dni;
		this.franja = franja;
		this.tipo = tipo;
		this.hora = hora;
		this.minutos = minutos;
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

	public int getHora() {
		return hora;
	}

	public int getMinutos() {
		return minutos;
	}
	@Override
    public String toString() {
        return "DNI: " + dni +
                "\nFranja horaria: " + (franja == 0 ? "Ma�ana" : "Tarde") +
                "\nTipo de cita: " + (tipo == 0 ? "Revisi�n" : "Tratamiento") +
                "\nHueco: " + String.format("%02d:%02d", hora,minutos);
    }
}

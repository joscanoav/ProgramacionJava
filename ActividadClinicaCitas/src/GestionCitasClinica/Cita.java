package GestionCitasClinica;

// Se crea esta clase cita para poder almacenar los datos

public class Cita {
    private String dni;
    private int consultaNumero;
    private int tipo;
    private int hora;
    private int minutos;

// Se genera los constructores para inicializar los atributos a la clase

    public Cita(String dni, int consultaNumero, int tipo, int hora, int minutos) {
        this.dni = dni;
        this.consultaNumero = consultaNumero;
        this.tipo = tipo;
        this.hora = hora;
        this.minutos = minutos;
    }
    
// Se crean los metodos getter se utilizan para devolver el atributos de la consulta

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

    // Devolver la informacion en cadena de del objeto
    public String toString() {
        return "DNI: " + dni +
                "\nConsulta Número: " + consultaNumero +
                "\nTipo de cita: " + (tipo == 0 ? "Revisión" : "Tratamiento") +
                "\nHora: " + String.format("%02d:%02d - %02d:%02d", hora, minutos, hora, minutos + 30);
    }
}
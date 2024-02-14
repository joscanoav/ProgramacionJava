package CineCompraGrafico;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Cine {
    private String nombre;
    private int aforo;
    private Sala[] salas;
    private int butacasLibres;
    private double totalIngreso;


   
    public Cine(String nombre, int aforo, Sala[] salas, int butacasLibres, double totalIngreso) {
		super();
		this.nombre = nombre;
		this.aforo = aforo;
		this.salas = salas;
		this.butacasLibres = aforo;
		this.totalIngreso = 0.0;
	}

	public void visualizarInformacion() {
        StringBuilder info = new StringBuilder();
        info.append("Nombre del cine: ").append(nombre).append("\n");
        info.append("Aforo total: ").append(aforo).append("\n");

        for (Sala sala : salas) {
            info.append("Sala ").append(sala.getId()).append(":\n");
            info.append("Pelicula: ").append(sala.getPelicula().getTitulo()).append("\n");
            info.append("Duracion: ").append(sala.getPelicula().getDuracion()).append(" minutos\n");
            info.append("Precio de entrada: $").append(sala.getPelicula().getPrecioEntrada()).append("\n");
            info.append("Horario: ").append(sala.getPelicula().getHorario()).append("\n");
        }

        JOptionPane.showMessageDialog(null, info.toString(), "Información del Cine", JOptionPane.INFORMATION_MESSAGE);
    }

    public void realizarCompra() {
        String[] opciones = {"Ver salas y datos de películas", "Elegir sala y butaca para reservar", "Ver la matriz con asientos libres/ocupados de una sala concreta", "Salir"};
        int opcion = JOptionPane.showOptionDialog(null, "¿Qué desea hacer?", "Realizar Compra", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        switch (opcion) {
            case 0:
                visualizarInformacion();
                break;
            case 1:
                realizarReserva();
                break;
            case 2:
                consultarDisponibilidad();
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Compra cancelada. ¡Hasta luego!", "Compra Cancelada", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    public void realizarReserva() {
        visualizarInformacion();
        int salaId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la sala:"));

        Sala salaSeleccionada = getSalaById(salaId);

        if (salaSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "Sala no encontrada. Reserva cancelada.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        salaSeleccionada.mostrarAsientos();

        int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila de la butaca:"));
        int columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna de la butaca:"));

        if (salaSeleccionada.reservarButaca(fila, columna, "correo@ejemplo.com")) {
            JOptionPane.showMessageDialog(null, "Reserva exitosa. ¡Disfrute de la película!", "Reserva Exitosa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "La butaca no está disponible para reserva. Inténtelo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void consultarDisponibilidad() {
        visualizarInformacion();
        int salaId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la sala:"));

        Sala salaSeleccionada = getSalaById(salaId);

        if (salaSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "Sala no encontrada. Consulta cancelada.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        salaSeleccionada.mostrarAsientos();
    }

    private Sala getSalaById(int id) {
        for (Sala sala : salas) {
            if (sala.getId() == id) {
                return sala;
            }
        }
        return null;
    }
}
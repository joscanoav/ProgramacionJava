package CineCompraGrafico;

import javax.swing.JOptionPane;

public class Sala {
    private int id;
    private Pelicula pelicula;
    private Butaca[][] butacas;

    public Sala(int id, Pelicula pelicula, Butaca[][] butacas) {
        this.id = id;
        this.pelicula = pelicula;
        this.butacas = butacas;
    }

    public int getId() {
        return id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Butaca[][] getButacas() {
        return butacas;
    }

    public Butaca getButaca(int fila, int columna) {
        return butacas[fila - 1][columna - 1];
    }

    public boolean isButacaLibre(int fila, int columna) {
        Butaca butaca = getButaca(fila, columna);
        return butaca != null && !butaca.isOcupada();
    }

    public boolean reservarButaca(int fila, int columna, String emailComprador) {
        Butaca butaca = getButaca(fila, columna);
        if (butaca != null && !butaca.isOcupada()) {
            butaca.ocupar(emailComprador);
            return true;
        }
        return false;
    }

    public void mostrarAsientos() {
        StringBuilder estadoAsientos = new StringBuilder("Estado de los asientos:\n");
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[0].length; j++) {
                if (butacas[i][j].isOcupada()) {
                    estadoAsientos.append("[x]");
                } else {
                    estadoAsientos.append("[ ]");
                }
            }
            estadoAsientos.append("\n");
        }
        JOptionPane.showMessageDialog(null, estadoAsientos.toString(), "Asientos de la Sala " + getId(), JOptionPane.INFORMATION_MESSAGE);
    }
}
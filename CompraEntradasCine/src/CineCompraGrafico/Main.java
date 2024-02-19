package CineCompraGrafico;

import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
	       Pelicula pelicula1 = new Pelicula("Titanic", 180, 10.0, "18:00");
	        Pelicula pelicula2 = new Pelicula("Matrix", 150, 12.0, "20:30");

	        Butaca[][] butacasSala1 = new Butaca[5][10];
	        Butaca[][] butacasSala2 = new Butaca[6][12];

	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 10; j++) {
	                butacasSala1[i][j] = new Butaca();
	            }
	        }

	        for (int i = 0; i < 6; i++) {
	            for (int j = 0; j < 12; j++) {
	                butacasSala2[i][j] = new Butaca();
	            }
	        }

	        Sala sala1 = new Sala(1, pelicula1, butacasSala1);
	        Sala sala2 = new Sala(2, pelicula2, butacasSala2);

	        Sala[] salas = {sala1, sala2};
	        
	        Cine cine = new Cine("Cine Planet", 50, salas,50, 15);

	        int opcion;
	        do {
	            String[] opciones = {"Visualizar información del cine", "Realizar compra de entradas", "Consultar disponibilidad", "Salir"};
	            opcion = JOptionPane.showOptionDialog(null, "Menú Principal", "Cine", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

	            switch (opcion) {
	                case 0:
	                    cine.visualizarInformacion();
	                    break;
	                case 1:
	                    cine.realizarCompra();
	                    break;
	                case 2:
	                    cine.consultarDisponibilidad();
	                    break;
	                case 3:
	                    JOptionPane.showMessageDialog(null, "¡Hasta luego!", "Cine", JOptionPane.INFORMATION_MESSAGE);
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
	                    break;
	            }
	        } while (opcion != 3);
	    }
	}
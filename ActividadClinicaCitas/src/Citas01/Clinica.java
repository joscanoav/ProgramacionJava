package Citas01;

public class Clinica {

	    private Consulta[] consultas;

	    public Clinica() {
	        consultas = new Consulta[10];
	        // Inicializar consultas de revisi�n
	        for (int i = 0; i < 5; i++) {
	            consultas[i] = new Consulta(i + 1, "Revisi�n", "M�dico " + (i + 1));
	        }
	        // Inicializar consultas de tratamiento
	        for (int i = 5; i < 10; i++) {
	            consultas[i] = new Consulta(i + 1, "Tratamiento", "M�dico " + (i - 4));
	        }
	    }

	    public Consulta[] getConsultas() {
	        return consultas;
	    }
	}
	
	


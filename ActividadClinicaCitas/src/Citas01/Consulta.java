package Citas01;

public class Consulta {

	    private int numero;
	    private String tipo;
	    private String medico;
	    private boolean[] horariosManana;
	    private boolean[] horariosTarde;

	    public Consulta(int numero, String tipo, String medico) {
	        this.numero = numero;
	        this.tipo = tipo;
	        this.medico = medico;
	        this.horariosManana = new boolean[20];
	        this.horariosTarde = new boolean[20];
	    }

	    public int getNumero() {
	        return numero;
	    }

	    public String getTipo() {
	        return tipo;
	    }

	    public String getMedico() {
	        return medico;
	    }

	    public boolean[] getHorariosManana() {
	        return horariosManana;
	    }

	    public boolean[] getHorariosTarde() {
	        return horariosTarde;
	    }
	}


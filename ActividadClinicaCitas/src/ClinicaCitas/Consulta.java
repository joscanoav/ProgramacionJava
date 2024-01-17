package ClinicaCitas;

public class Consulta {
    private int numeroConsulta;
    private String tipo;
    private String medico;

    public Consulta(int numeroConsulta, String tipo, String medico) {
        this.numeroConsulta = numeroConsulta;
        this.tipo = tipo;
        this.medico = medico;
    }

    public int getNumeroConsulta() {
        return numeroConsulta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMedico() {
        return medico;
    }
}

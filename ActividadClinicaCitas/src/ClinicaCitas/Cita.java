package ClinicaCitas;

public class Cita {
    private String dniPaciente;
    private String tipoCita;
    private String franjaHoraria;
    private int numeroHueco;

    public Cita(String dniPaciente, String tipoCita, String franjaHoraria, int numeroHueco) {
        this.dniPaciente = dniPaciente;
        this.tipoCita = tipoCita;
        this.franjaHoraria = franjaHoraria;
        this.numeroHueco = numeroHueco;
    }

    public String getDniPaciente() {
        return dniPaciente;
    }

    public String getTipoCita() {
        return tipoCita;
    }

    public String getFranjaHoraria() {
        return franjaHoraria;
    }

    public int getNumeroHueco() {
        return numeroHueco;
    }

    public void setFranjaHoraria(String franjaHoraria) {
        this.franjaHoraria = franjaHoraria;
    }

    public void setNumeroHueco(int numeroHueco) {
        this.numeroHueco = numeroHueco;
    }
}


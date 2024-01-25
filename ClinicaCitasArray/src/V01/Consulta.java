package V01;

public class Consulta {
    private int numero;
    private Medico medico;

    public Consulta(int numero, Medico medico) {
        this.numero = numero;
        this.medico = medico;
    }

    public int getNumero() {
        return numero;
    }

    public Medico getMedico() {
        return medico;
    }
}


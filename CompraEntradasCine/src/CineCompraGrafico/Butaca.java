package CineCompraGrafico;

public class Butaca {
    private boolean ocupada;
    private String emailComprador;

    public Butaca() {
        this.ocupada = false;
        this.emailComprador = null;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public String getEmailComprador() {
        return emailComprador;
    }

    public void ocupar(String emailComprador) {
        this.ocupada = true;
        this.emailComprador = emailComprador;
    }

    public void desocupar() {
        this.ocupada = false;
        this.emailComprador = null;
    }
}


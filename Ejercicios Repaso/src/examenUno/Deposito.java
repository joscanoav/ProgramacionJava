package examenUno;

class Deposito {
    private int capacidadMaxima;
    private int cantidadActual;

    public Deposito(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = 0;
    }

    public void recargar(int cantidad) {
        if (cantidadActual + cantidad <= capacidadMaxima) {
            cantidadActual += cantidad;
            System.out.println("Dep�sito recargado con " + cantidad + " ml.");
        } else {
            System.out.println("Recarga excede la capacidad m�xima del dep�sito.");
        }
    }

    public int getCantidadActual() {
        return cantidadActual;
    }
}

class TiendaHelados {
    private Deposito vainillaDeposito;
    private Deposito chocolateDeposito;
    private Deposito fresaDeposito;
    private Deposito nataDeposito;

    private double costoPorBola;
    private int contadorVentas;

    public TiendaHelados(int capacidadDeposito) {
        vainillaDeposito = new Deposito(capacidadDeposito);
        chocolateDeposito = new Deposito(capacidadDeposito);
        fresaDeposito = new Deposito(capacidadDeposito);
        nataDeposito = new Deposito(capacidadDeposito);

        costoPorBola = 10.0;  // Costo inicial por bola de helado
        contadorVentas = 0;
    }

    public void realizarVenta(int cantidad, String sabor) {
        double costoBola = 0.0;

        if (cantidad == 1) {
            costoBola = costoPorBola;
        } else if (cantidad == 2) {
            costoBola = 0.9 * costoPorBola;
        } else if (cantidad >= 3) {
            costoBola = 0.8 * costoPorBola;
        }

        System.out.println("Venta de " + cantidad + " bolas de helado de sabor " + sabor +
                ". Costo total: " + (costoBola * cantidad));
        
        // Actualizar dep�sito de dinero y contador de ventas
        // (aqu� deber�as tener m�todos correspondientes en tu implementaci�n)
        // por ejemplo, dineroDeposito.incrementar(costoBola * cantidad);
        // contadorVentas.incrementar();
    }

    // Otros m�todos para recargar dep�sitos, obtener informaci�n, etc.
}
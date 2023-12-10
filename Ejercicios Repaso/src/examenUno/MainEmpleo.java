package examenUno;

public class MainEmpleo {
    public static void main(String[] args) {
        // Crear una instancia de Empleo
        Empleo empleo = new Empleo("MiEmpresa", 50, 20, 30, 20000, 30000, 40000, 500000);

        // Pruebas de los métodos
        empleo.ingresarDinero(100000);
        empleo.gastarDinero(50000);

        empleo.convertirTemporalesAFijos(10);

        empleo.contratarEmpleados(15, true);
        empleo.contratarEmpleados(20, false);

        double pagaFijo = empleo.calcularPagaFijo(12, 2);
        double pagaTemporal = empleo.calcularPagaTemporal(6);

        System.out.println("Paga de un trabajador fijo: " + pagaFijo + " euros.");
        System.out.println("Paga de un trabajador temporal: " + pagaTemporal + " euros.");

        if (empleo.tieneDeudas()) {
            System.out.println("La empresa tiene deudas.");
        } else {
            System.out.println("La empresa no tiene deudas.");
        }

        empleo.calcularExtra(25);
    }
}
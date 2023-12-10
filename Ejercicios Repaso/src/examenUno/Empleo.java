package examenUno;

import java.util.Scanner;

class Empleo {
    private String nombre;
    private int empleadosFijos;
    private int empleadosTemporales;
    private int vacantesOfertadas;
    private double salarioRango1;
    private double salarioRango2;
    private double salarioRango3;
    private double dineroTotal;

    // Constructor
    public Empleo(String nombre, int empleadosFijos, int empleadosTemporales, int vacantesOfertadas,
                  double salarioRango1, double salarioRango2, double salarioRango3, double dineroTotal) {
        this.nombre = nombre;
        this.empleadosFijos = empleadosFijos;
        this.empleadosTemporales = empleadosTemporales;
        this.vacantesOfertadas = vacantesOfertadas;
        this.salarioRango1 = salarioRango1;
        this.salarioRango2 = salarioRango2;
        this.salarioRango3 = salarioRango3;
        this.dineroTotal = dineroTotal;
    }

    // Método para ingresar dinero
    public void ingresarDinero(double cantidad) {
        dineroTotal += cantidad;
        System.out.println("Se han ingresado " + cantidad + " euros. Dinero total actual: " + dineroTotal + " euros.");
    }

    // Método para gastar dinero
    public void gastarDinero(double cantidad) {
        if (dineroTotal >= cantidad) {
            dineroTotal -= cantidad;
            System.out.println("Se han gastado " + cantidad + " euros. Dinero total actual: " + dineroTotal + " euros.");
        } else {
            System.out.println("No hay suficiente dinero para realizar el gasto.");
        }
    }

    // Método para convertir empleados temporales en fijos
    public void convertirTemporalesAFijos(int cantidad) {
        if (empleadosTemporales >= cantidad && vacantesOfertadas >= cantidad) {
            empleadosTemporales -= cantidad;
            empleadosFijos += cantidad;
            vacantesOfertadas -= cantidad;
            System.out.println(cantidad + " empleados temporales convertidos a empleados fijos.");
        } else {
            System.out.println("No hay suficientes empleados temporales o vacantes disponibles.");
        }
    }

    // Método para contratar nuevos empleados
    public void contratarEmpleados(int cantidad, boolean esTemporal) {
        if (esTemporal && vacantesOfertadas >= cantidad) {
            empleadosTemporales += cantidad;
            vacantesOfertadas -= cantidad;
            System.out.println(cantidad + " nuevos empleados temporales contratados.");
        } else if (!esTemporal && vacantesOfertadas >= cantidad) {
            empleadosFijos += cantidad;
            vacantesOfertadas -= cantidad;
            System.out.println(cantidad + " nuevos empleados fijos contratados.");
        } else {
            System.out.println("No hay suficientes vacantes disponibles.");
        }
    }

    // Método para calcular la paga de un trabajador fijo
    public double calcularPagaFijo(int numPagas, int antiguedad) {
        if (antiguedad < 1) {
            return salarioRango1 * numPagas;
        } else if (antiguedad <= 3) {
            return salarioRango2 * numPagas;
        } else {
            return salarioRango3 * numPagas;
        }
    }

    // Método para calcular la paga de un trabajador temporal
    public double calcularPagaTemporal(int numMeses) {
        return salarioRango2 * numMeses;
    }

    // Método para verificar si hay deudas
    public boolean tieneDeudas() {
        return dineroTotal < 0;
    }

    // Método para calcular el extra para los trabajadores
    public void calcularExtra(double porcentajeExtra) {
        if (!tieneDeudas()) {
            double montoExtra = dineroTotal * (porcentajeExtra / 100);
            double montoFijos = montoExtra * 0.7;
            double montoTemporales = montoExtra * 0.3;

            // Aquí podrías distribuir los montos extras entre los empleados
            System.out.println("Extra calculado. Monto total: " + montoExtra +
                    " euros. Monto para fijos: " + montoFijos + " euros. Monto para temporales: " + montoTemporales + " euros.");
        } else {
            System.out.println("No se puede calcular el extra porque la empresa tiene deudas.");
        }
    }
}
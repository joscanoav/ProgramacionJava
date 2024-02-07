package repasoMatrices;

import java.util.Scanner;

public class MatrizCalendarioBisiesto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Obtener el año y el día de la semana del 1 de enero
        System.out.print("Ingresa el año: ");
        int year = scanner.nextInt();

        System.out.print("Ingresa el día de la semana del 1 de enero (1 para lunes, 2 para martes, ..., 7 para domingo): ");
        int primerDiaEnero = scanner.nextInt();

        // Verificar si el año es bisiesto
        boolean esBisiesto = esBisiesto(year);

        // Generar y mostrar el calendario
        for (int mes = 1; mes <= 12; mes++) {
            System.out.println("\n\n" + obtenerNombreMes(mes) + " " + year);
            System.out.println("Lu Ma Mi Ju Vi Sa Do");

            // Obtener el día de la semana del primer día del mes
            int primerDiaMes = calcularPrimerDiaMes(primerDiaEnero, mes, esBisiesto);

            // Imprimir espacios para alinear el primer día del mes
            for (int i = 1; i < primerDiaMes; i++) {
                System.out.print("   ");
            }

            // Imprimir los días del mes
            int diasEnMes = obtenerDiasEnMes(mes, esBisiesto);
            for (int dia = 1; dia <= diasEnMes; dia++) {
                System.out.printf("%2d ", dia);

                // Ir a la siguiente línea después de sábado
                if ((primerDiaMes + dia - 1) % 7 == 0) {
                    System.out.println();
                }
            }

            System.out.println();
        }
    }

    private static boolean esBisiesto(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static String obtenerNombreMes(int mes) {
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        return nombresMeses[mes - 1];
    }

    private static int calcularPrimerDiaMes(int primerDiaEnero, int mes, boolean esBisiesto) {
        int[] diasEnMesNoBisiesto = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] diasEnMesBisiesto = {0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};

        int[] tablaDias = esBisiesto ? diasEnMesBisiesto : diasEnMesNoBisiesto;

        int primerDiaMes = (primerDiaEnero + tablaDias[mes - 1]) % 7;
        return (primerDiaMes == 0) ? 7 : primerDiaMes;
    }

    private static int obtenerDiasEnMes(int mes, boolean esBisiesto) {
        int[] diasEnMesNoBisiesto = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] diasEnMesBisiesto = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return esBisiesto ? diasEnMesBisiesto[mes] : diasEnMesNoBisiesto[mes];
    }

	}



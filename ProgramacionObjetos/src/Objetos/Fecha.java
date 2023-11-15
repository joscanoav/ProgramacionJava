package Objetos;

public class Fecha {
	public int dia;
	public int mes;
	public int a�o;
	

	public Fecha(int dia, int mes, int a�o) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}
	
	public boolean esValida(){
		if(mes<1||mes>12||dia<1) {
			return false;
		}
		
		int maxDiasEnMes = obtenerMaxDiasEnMes();
		return dia <= maxDiasEnMes;
		
	}
	
	public int calcularDias() {
		int[] diasEnMes= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int dias = dia;
		
		for (int i=1; i<mes; i++) {
			dias += diasEnMes[i];
		}
		
		if(mes >2 && esBisiesto()) {
			dias++;
		}
		
		return dias;
	}
	
	private boolean esBisiesto() {
		return(a�o % 4 == 0 && a�o%100 !=0)||(a�o%400 ==0);
	}
	
	private int obtenerMaxDiasEnMes() {
		if(mes == 2 && esBisiesto()) {
			return 29;
		}
		
		int[] diasEnMes = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		return diasEnMes[mes];
	}
	
}

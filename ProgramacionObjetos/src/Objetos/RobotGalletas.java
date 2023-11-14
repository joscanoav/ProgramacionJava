package Objetos;

public class RobotGalletas {
	public int contadorGalletasCrudas;
	public int contadorGalletasHorneadas;
	public int capacidadHorno;
	public int contadorGalletasEnvasadas;
	public double depositoDinero;
	public double costeGalletaEnvasada;


	public RobotGalletas(int capacidadHorno, double costeGalletaEnvasada) {
		
		this.capacidadHorno = capacidadHorno;
		this.costeGalletaEnvasada = costeGalletaEnvasada;
	}
	
	public void incrementarGalletasCrudas(int cantidad) {
		if(cantidad > 0) {
			contadorGalletasCrudas += cantidad;
			System.out.println("Se incrementaron" + cantidad + "galletas crudas.");
		}else {
			System.out.println("La cantidad debe ser mayor que cero.");
		}
	}
	
	// Separa por cada criterio de if
	
	public void hornearGalletas(int cantidad) {
		if(cantidad > 0 && cantidad <= contadorGalletasCrudas && cantidad <=capacidadHorno) {
			
			contadorGalletasCrudas -= cantidad;
			contadorGalletasHorneadas += cantidad;
			System.out.println("Se hornearon" + cantidad + "galletas.");
		}else {
			System.out.println("Cantidad invalidad o insuficiente espacio en el horno");
		}
	}

	public void envasarGalletas(int cantidad) {
		if (cantidad > 0 && cantidad <= contadorGalletasHorneadas) {
			contadorGalletasHorneadas -= cantidad;
			contadorGalletasEnvasadas += cantidad;
			System.out.println("Se enviaron" + cantidad + "galletas");
		}else {
			System.out.println("Cantidad invalidad o insuficientes galletas horneadas");
		}
	}

	public void venderGalletas (int cantidad) {
		if(cantidad >0 && cantidad <=contadorGalletasEnvasadas ) {
			double ingreso = cantidad * costeGalletaEnvasada;
			depositoDinero += ingreso;
			contadorGalletasEnvasadas -= cantidad;
			System.out.println("Se vendieron" + cantidad + "galletas por $" + ingreso + ".");
			
		}else {
			System.out.println("Cantidad invalidad o insuficientes galletas envasadas.");
		}
	}
	
	public void mostrarEstado() {
		System.out.println("Galletas Crudas: " + contadorGalletasCrudas);
		System.out.println("Galletas Horneadas: " + contadorGalletasHorneadas);
		System.out.println("Galletas Envasadas" + contadorGalletasEnvasadas);
		System.out.println("Depósito de Dinero: €" + depositoDinero);
	}
}



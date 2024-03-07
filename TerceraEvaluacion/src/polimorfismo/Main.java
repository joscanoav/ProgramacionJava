package polimorfismo;

public class Main {

	public static void main(String[] args) {

		Ingreso i1 = new Ingreso();
		Ingreso i2 = new Ingreso("Nomina", 2000);
		
		
		i1.actualizar("Pago cervezas");
		i2.actualizar(3000);
		
		
		
	}

}

package examenUno;

public class Balanza {
	private int pesoIzquierdo;
	private int pesoDerecho;
	
	
	public Balanza(int pesoIzquierdo, int peroDerecho) {
		this.pesoIzquierdo = pesoIzquierdo;
		this.pesoDerecho = pesoDerecho;
	}
	
		public void calcularInclinacion() {
			if (pesoIzquierdo > pesoDerecho) {
				System.out.println("La balanza esta inclinada hacia la izquierda.");
			} else if (pesoIzquierdo < pesoDerecho) {
				System.out.println("La balanza esta inclinada hacua la derecha");
			} else {
				System.out.println("La balanza esta en equilibrio.");
			}
			
	}
		
		public void equilibrar() {
			int pesoTotal = pesoIzquierdo + pesoDerecho;
			int pesoPromedio = pesoTotal/2;
			
			pesoIzquierdo = pesoPromedio;
			pesoDerecho = pesoPromedio;
			
			if(pesoTotal %2 !=0) {
				pesoDerecho--;
				
			}
			
			System.out.println("Balanza equilibrada. Peso izquierdo: " + pesoIzquierdo + ", Peso derecho: " + pesoDerecho );
		}
	
}

package Actividad3;

public class Celula {
	public String reino;
	public int tamaño;
	public int reservaATP;
	public String estado;
	public String hebraADN1;
	public String hebraADN2;
	
	
	public Celula(String reino, int tamaño, int reservaATP, String estado, String hebraADN1, String hebraADN2) {
		this.reino = reino;
		this.tamaño = tamaño;
		this.reservaATP = reservaATP;
		this.estado = estado;
		this.hebraADN1 = hebraADN1;
		this.hebraADN2 = hebraADN2;
	}
	
	//MÉTODO ESTADO DE LA CELULA
	
	public void verificarADN() {
		for(int i = 0; i < hebraADN1.length();i++) {
			char base1 = hebraADN1.charAt(i);
			char base2 = hebraADN2.charAt(i);
			
			if ((base1 == 'A' && base2 != 'T') || (base1 =='T' && base2 != 'A') ||
			
					(base1 =='G' && base2 != 'C') || (base1 == 'C' && base2 != 'G')) {
					estado = "dañada";
					break;
			}
		}
	}

	// MÉTODO RECIBIR MOLECULAS DE ATP	
	public void recibirATP(int cantidad) {
		reservaATP += cantidad;
	}
	
	// MÉTODO CRECER MOLÉCULA
	
	public void crecer(int moleculasATP) {
		if(reservaATP >= moleculasATP) {
			reservaATP -= moleculasATP;
			tamaño += (2 * moleculasATP);
		} else {
			System.out.println("No hay suficientes moleculas ATP para crecer.");
		}
	}

	// MÉTODO DIVISIÓN MOLECULAR
	
	public Celula dividirse() {
		if(reservaATP >=10) {
			reservaATP = (reservaATP-10)/2;
			tamaño /=2;
			Celula celulaHija = new Celula(reino, tamaño, reservaATP, estado, hebraADN1, hebraADN2);
			return celulaHija;
		} else {
			System.out.println("No hay suficientes moleculas de ATP para dividirse");
			return null;
		}
	}
}

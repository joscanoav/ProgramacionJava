package Actividad3;

public class Celula {
	public String reino;
	public int tama�o;
	public int reservaATP;
	public String estado;
	public String hebraADN1;
	public String hebraADN2;
	
	
	public Celula(String reino, int tama�o, int reservaATP, String estado, String hebraADN1, String hebraADN2) {
		this.reino = reino;
		this.tama�o = tama�o;
		this.reservaATP = reservaATP;
		this.estado = estado;
		this.hebraADN1 = hebraADN1;
		this.hebraADN2 = hebraADN2;
	}
	
	//metodo para verificar da�os en las hebras de ADN
	
	public void verificarADN() {
		for(int i = 0; i < hebraADN1.length();i++) {
			char base1 = hebraADN1.charAt(i);
			char base2 = hebraADN2.charAt(i);
			
			if ((base1 == 'A' && base2 != 'T') || (base1 =='T' && base2 != 'A') ||
			
					(base1 =='G' && base2 != 'C') || (base1 == 'C' && base2 != 'G')) {
					estado = "da�ada";
					break;
			}
		
	
		}
	}

	//metodo para recibir moleculas de ATP
	
	public void recibirATP(int cantidad) {
		reservaATP += cantidad;
	}
	
	//metodo para crecer
	
	public void crecer(int moleculasATP) {
		if(reservaATP >= moleculasATP) {
			reservaATP -= moleculasATP;
			tama�o += (2 * moleculasATP);
		} else {
			System.out.println("No hay suficientes moleculas ATP para crecer.");
		}
	}

	//metodo para dividirse
	
	public Celula dividirse() {
		if(reservaATP >=10) {
			reservaATP -= 10;
			tama�o /=2;
			Celula celulaHija = new Celula(reino, tama�o, reservaATP/2, estado, hebraADN1, hebraADN2);
			return celulaHija;
		} else {
			System.out.println("No hya suficientes moleculas de ATP para dividirse");
			return null;
		}
	}
}

package getionFarmaciaV3;

public class Direccion {
    private String numero;
    private String piso;
    private String letra;
    private String localidad;
    private String via;

    public Direccion(String numero, String piso, String letra, String localidad, String via) {
        this.numero = numero;
        this.piso = piso;
        this.letra = letra;
        this.localidad = localidad;
        this.via = via;
    }

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}
    
    
    
}

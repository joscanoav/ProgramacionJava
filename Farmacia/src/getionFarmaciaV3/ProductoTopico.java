package getionFarmaciaV3;

import java.time.LocalDate;
import java.util.List;

public class ProductoTopico extends Producto {
    private String pao;
    private String consistencia;
    private List<String> zonasAplicacion;

    public ProductoTopico(int id, String nombre, double precio, int cantidad, String unidades, LocalDate fechaCaducidad,
                          String pao, String consistencia, List<String> zonasAplicacion) {
        super(id, nombre, precio, cantidad, unidades, fechaCaducidad);
        this.pao = pao;
        this.consistencia = consistencia;
        this.zonasAplicacion = zonasAplicacion;
    }

	public String getPao() {
		return pao;
	}

	public String getConsistencia() {
		return consistencia;
	}

	public List<String> getZonasAplicacion() {
		return zonasAplicacion;
	}
  
}

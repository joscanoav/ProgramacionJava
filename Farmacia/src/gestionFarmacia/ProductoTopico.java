package gestionFarmacia;
import java.time.LocalDate;

public class ProductoTopico extends Producto {
    private int pao;

    public ProductoTopico(int id, String nombre, double precio, int cantidad, String unidades, LocalDate fechaCaducidad,
                          String consistencia, String parteCuerpo, String instrucciones, String dosisMaximaDiaria,
                          String recomendaciones, int pao) {
        super(id, nombre, precio, cantidad, unidades, fechaCaducidad, consistencia, parteCuerpo, instrucciones,
                dosisMaximaDiaria, recomendaciones);
        this.pao = pao;
    }

	public int getPao() {
		return pao;
	}

	public void setPao(int pao) {
		this.pao = pao;
	}
}



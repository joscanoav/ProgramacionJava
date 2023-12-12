package ModeloC;

public class ModeloCFarmacia {
	
	public int stockSuplementos;
	public int stockCosmeticos;
	public int stockMedicamentos;
	public int unidades;
	public int ventas;
	public double precioBase;
	public double dineroVenta;
	public double precioFinalUnidad;
	public boolean receta;
	


	public ModeloCFarmacia(int stockSuplementos, int stockCosmeticos, int stockMedicamentos, int unidades, int ventas,
			double precioBase, double dineroVenta, double precioFinalUnidad, Boolean receta) {
		super();
		this.stockSuplementos = stockSuplementos;
		this.stockCosmeticos = stockCosmeticos;
		this.stockMedicamentos = stockMedicamentos;
		this.unidades = unidades;
		this.ventas = ventas;
		this.precioBase = precioBase;
		this.dineroVenta = dineroVenta;
		this.precioFinalUnidad = precioFinalUnidad;
		this.receta = receta;
	}

	public void incrementarStock(String producto, int unidades) {

		switch (producto.toUpperCase()) {
		case "SUPLEMENTOS":
			stockSuplementos += unidades;
			break;
		case "COSMETICOS":
			stockCosmeticos += unidades;
			break;
		case "MEDICAMENTOS":
			stockMedicamentos += unidades;
			break;
		default:
			System.out.println("Producto desconocido.");
		}

	}
	
	public void costeProducto(String producto, int unidades) {

		switch (producto.toUpperCase()) {
		case "SUPLEMENTOS":
			if (unidades <= stockSuplementos) {
			precioFinalUnidad = precioBase * 0.15;
			dineroVenta += precioFinalUnidad * unidades;
			stockSuplementos -= unidades;
			ventas++;
			}
			break;
			
		case "COSMETICOS":
			if (unidades <= stockSuplementos) {
			precioFinalUnidad = precioBase * 0.15;
			dineroVenta += precioFinalUnidad * unidades;
			stockSuplementos -= unidades;
			ventas++;
			}
			break;
			
		case "MEDICAMENTOS":
			if (unidades <= stockSuplementos) {
			precioFinalUnidad = precioBase * 0.15;
			dineroVenta += precioFinalUnidad * unidades;
			stockSuplementos -= unidades;
			ventas++;
			}
			break;	
			
		default:
			System.out.println("Producto Desconocido.");
		}
	}
}







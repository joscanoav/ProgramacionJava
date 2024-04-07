package gestionFarmaciaV2;
import java.time.LocalDate;
/*
extends en public class ProductoOral extends Producto
 indica que ProductoOral es una subclase de Producto, heredando sus atributos y métodos.*/

	public class ProductoOral extends Producto {
	    private String ingestion;

	    public ProductoOral(int id, String nombre, double precio, int cantidad, String unidades, LocalDate fechaCaducidad,
	                        String consistencia, String parteCuerpo, String instrucciones, String dosisMaximaDiaria,
	                        String recomendaciones, String ingestion) {
	        super(id, nombre, precio, cantidad, unidades, fechaCaducidad, consistencia, parteCuerpo, instrucciones,
	                dosisMaximaDiaria, recomendaciones);
	        this.ingestion = ingestion;
	    }

	    public String getIngestion() {
	        return ingestion;
	    }

	    public void setIngestion(String ingestion) {
	        this.ingestion = ingestion;
	    }
	}
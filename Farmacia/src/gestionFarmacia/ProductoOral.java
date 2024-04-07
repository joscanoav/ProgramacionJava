package gestionFarmacia;
import java.time.LocalDate;
/*
extends en public class ProductoOral extends Producto
 indica que ProductoOral es una subclase de Producto, heredando sus atributos y métodos.*/

public class ProductoOral extends Producto {
    private String ingestion; // Atributo para indicar cómo se debe ingerir el producto

    // Constructor que inicializa todos los atributos de ProductoOral y llama al constructor de Producto
    public ProductoOral(int id, String nombre, double precio, int cantidad, String unidades, LocalDate fechaCaducidad,
                        String consistencia, String parteCuerpo, String instrucciones, String dosisMaximaDiaria,
                        String recomendaciones, String ingestion) {

    	/* super() se usa para llamar al constructor de la clase base (Producto) y pasarle los valores necesarios para inicializar 
			sus atributos.*/
    	super(id, nombre, precio, cantidad, unidades, fechaCaducidad, consistencia, parteCuerpo, instrucciones,
                dosisMaximaDiaria, recomendaciones);
    	/*This.ingestion = ingestion; se usa para asignar el valor del parámetro ingestion al atributo ingestion de la clase ProductoOral.*/
        this.ingestion = ingestion; // Inicializa el atributo ingestion
    }

    // Métodos getters y setters para el atributo ingestion
    public String getIngestion() {
        return ingestion;
    }

    public void setIngestion(String ingestion) {
        this.ingestion = ingestion;
    }
}
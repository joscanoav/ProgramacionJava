package gestionFarmacia;
import java.time.LocalDate;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int cantidad;
    private String unidades;
    private LocalDate fechaCaducidad;
    private String consistencia;
    private String parteCuerpo;
    private String instrucciones;
    private String dosisMaximaDiaria;
    private String recomendaciones;

    public Producto(int id, String nombre, double precio, int cantidad, String unidades, LocalDate fechaCaducidad,
                    String consistencia, String parteCuerpo, String instrucciones, String dosisMaximaDiaria,
                    String recomendaciones) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.unidades = unidades;
        this.fechaCaducidad = fechaCaducidad;
        this.consistencia = consistencia;
        this.parteCuerpo = parteCuerpo;
        this.instrucciones = instrucciones;
        this.dosisMaximaDiaria = dosisMaximaDiaria;
        this.recomendaciones = recomendaciones;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidades() {
		return unidades;
	}

	public void setUnidades(String unidades) {
		this.unidades = unidades;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getConsistencia() {
		return consistencia;
	}

	public void setConsistencia(String consistencia) {
		this.consistencia = consistencia;
	}

	public String getParteCuerpo() {
		return parteCuerpo;
	}

	public void setParteCuerpo(String parteCuerpo) {
		this.parteCuerpo = parteCuerpo;
	}

	public String getInstrucciones() {
		return instrucciones;
	}

	public void setInstrucciones(String instrucciones) {
		this.instrucciones = instrucciones;
	}

	public String getDosisMaximaDiaria() {
		return dosisMaximaDiaria;
	}

	public void setDosisMaximaDiaria(String dosisMaximaDiaria) {
		this.dosisMaximaDiaria = dosisMaximaDiaria;
	}

	public String getRecomendaciones() {
		return recomendaciones;
	}

	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}
    	
}

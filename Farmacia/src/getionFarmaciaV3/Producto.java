package getionFarmaciaV3;

import java.time.LocalDate;


public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int cantidad;
    private String unidades;
    private LocalDate fechaCaducidad;

    public Producto(int id, String nombre, double precio, int cantidad, String unidades, LocalDate fechaCaducidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.unidades = unidades;
        this.fechaCaducidad = fechaCaducidad;
    }

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public String getUnidades() {
		return unidades;
	}


	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

  
}
    

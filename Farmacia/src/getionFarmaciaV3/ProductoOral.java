package getionFarmaciaV3;

import java.time.LocalDate;

public class ProductoOral extends Producto {
    private double dosisMaximaDiaria;
    private boolean tomarConComida;

    public ProductoOral(int id, String nombre, double precio, int cantidad, String unidades, LocalDate fechaCaducidad,
                        double dosisMaximaDiaria, boolean tomarConComida) {
        super(id, nombre, precio, cantidad, unidades, fechaCaducidad);
        this.dosisMaximaDiaria = dosisMaximaDiaria;
        this.tomarConComida = tomarConComida;
    }

	public double getDosisMaximaDiaria() {
		return dosisMaximaDiaria;
	}


	public boolean isTomarConComida() {
		return tomarConComida;
	}


}
package CineCompraGrafico;

	public class Pelicula {
	    private String titulo;
	    private int duracion;
	    private double precioEntrada;
	    private String horario;

	    public Pelicula(String titulo, int duracion, double precioEntrada, String horario) {
	        this.titulo = titulo;
	        this.duracion = duracion;
	        this.precioEntrada = precioEntrada;
	        this.horario = horario;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public int getDuracion() {
	        return duracion;
	    }

	    public double getPrecioEntrada() {
	        return precioEntrada;
	    }

	    public String getHorario() {
	        return horario;
	    }
	}
package compraEntradasCine;

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

	//Se utiliza get para acceder a valores privados de una clase
	// Es un medio controlado y seguro para acceder a atributos desde fuera de clase
	// practica comun es usar encapsulamiento
	// Flexibilidad: Si m�s adelante necesitas realizar alguna l�gica adicional (como validaciones, c�lculos, etc.) al acceder o modificar un atributo, puedes hacerlo en los m�todos getters y setters sin afectar a las partes del c�digo que ya lo utilizan.
	// No se usa setter porque no seria necesario
	// En caso lo usariamos si tuvieramos cambiar valoresa los atributos
	// , los setters son m�todos que se utilizan para modificar o actualizar los valores de los atributos de un objeto
    /*
     *  public void setTitulo(String nuevoTitulo) {
        this.titulo = nuevoTitulo;
        }
     *  
     *  */
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
